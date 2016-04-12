import java.io.*;
import java.util.*;

/**
 * 
 * @author ustcnf
 * 好好理解
 * 
 * 输入：姓名，三门课成绩
 * 输出：将学生信息和计算出的总分数高低顺序存入磁盘文件“stud.txt”;
 * 思路：1描述学生对象
 *     2.定义可以操作学生对象的工具类；
 * 
 * 方法：
 * 1.通过键盘获取一行数据，将数据封装成学生对象；
 * 2.因为需要对对象排序，需要存储集合，使用TreeSet()
 * 3.将集合信息写到文件中
 * 
 * 
 * 注意：
 *    对象相同判断：hashCode() , equals()
 *    对象比较判断：implements Comparable<T>
 *             覆盖 ComparaTo(T)
 *    修改排序结果：
 *             Comparator<Student> cmp = Collections.reverseOrder();
 */

class Student implements Comparable<Student>
{

	private String name;
	private int ma,cn,en;
	private int sum;
	
	Student(String name,int ma, int cn, int en)
	{
		this.name = name;
		this.ma = ma;
		this.cn = cn;
		this.en = en;
		sum = ma + cn + en;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSum()
	{
		return sum;
	}
	// 原因待写:
	// 原因：判断对象相同：hashCode()需要改成一样，否则两个对象永远不会相同，即使同名同姓铜成绩
	//                equals() 具体判断对象是否相同的标志
	
	public int hashcode()
	{
		return name.hashCode()+ sum*78;
	}
	
    public boolean equals(Object obj)
    {
    	if(! (obj instanceof Student))
    			throw new ClassCastException("类型不匹配");
    	Student s = (Student)obj;
    	return this.name.equals(s.name) && this.sum == s.sum;
    	
    }
	
	@Override
	public int compareTo(Student stu) {
		int num = new Integer(this.sum).compareTo(new Integer(stu.sum));
		if(num ==0)
			return this.name.compareTo(stu.name);
		return num;
    	
	}
	
	public String toString()
	{
		return "Student"+name+","+ma+","+cn+","+en+","+sum;
	}
	
}

class SudentInfoTool
{
	public static Set<Student> getStudent() throws IOException
	{
		return getStudent(null);
	}
	
	public static Set<Student> getStudent(Comparator<Student> cmp) throws IOException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		Set<Student> stus = new TreeSet<Student>();
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;
			String [] info = line.split(",");
			Student stu = new Student(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]));
			stus.add(stu);
		}
		bufr.close();
		return stus;
	}
	public static void write2File(Set<Student> stus) throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter("stuInfo.txt"));
		for(Student stu : stus)
		{
			bufw.write(stu.toString()+"\t");
			bufw.write(stu.getSum()+"");
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}
	
}

public class Demo {
	//实现Comparable接口一定要覆盖ComparaTo()方法
	
	


	public static void main(String[] args) throws IOException {
		Comparator<Student> cmp = Collections.reverseOrder();
		Set<Student> stu = SudentInfoTool.getStudent(cmp);
		SudentInfoTool.write2File(stu);
	}

}
