import java.io.*;
import java.util.*;

/**
 * 
 * @author ustcnf
 * �ú����
 * 
 * ���룺���������ſγɼ�
 * �������ѧ����Ϣ�ͼ�������ܷ����ߵ�˳���������ļ���stud.txt��;
 * ˼·��1����ѧ������
 *     2.������Բ���ѧ������Ĺ����ࣻ
 * 
 * ������
 * 1.ͨ�����̻�ȡһ�����ݣ������ݷ�װ��ѧ������
 * 2.��Ϊ��Ҫ�Զ���������Ҫ�洢���ϣ�ʹ��TreeSet()
 * 3.��������Ϣд���ļ���
 * 
 * 
 * ע�⣺
 *    ������ͬ�жϣ�hashCode() , equals()
 *    ����Ƚ��жϣ�implements Comparable<T>
 *             ���� ComparaTo(T)
 *    �޸���������
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
	// ԭ���д:
	// ԭ���ж϶�����ͬ��hashCode()��Ҫ�ĳ�һ������������������Զ������ͬ����ʹͬ��ͬ��ͭ�ɼ�
	//                equals() �����ж϶����Ƿ���ͬ�ı�־
	
	public int hashcode()
	{
		return name.hashCode()+ sum*78;
	}
	
    public boolean equals(Object obj)
    {
    	if(! (obj instanceof Student))
    			throw new ClassCastException("���Ͳ�ƥ��");
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
	//ʵ��Comparable�ӿ�һ��Ҫ����ComparaTo()����
	
	


	public static void main(String[] args) throws IOException {
		Comparator<Student> cmp = Collections.reverseOrder();
		Set<Student> stu = SudentInfoTool.getStudent(cmp);
		SudentInfoTool.write2File(stu);
	}

}
