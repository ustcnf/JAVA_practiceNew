import java.util.*;

import org.junit.Test;

/**
 * 
 * @author ustcnf
 * 使用泛型，目的在编译时发现运行错误
 * 		声明是就指定元素类型
 *泛型擦除：
 *      泛型只在编译时有效，在自解码文件不存在泛型；
 */

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	
	/**
	 * 编译时提示错误
	 */
/*	public void Demo()
	{
		List<String> list = new ArrayList<String>();
		list.add("abc");
//		list.add(1);   // 编译时就已经提示错误
		String st = list.get(0);
	}*/
	
	/**
	 * 泛型擦除:
	 *       只在编译时有效，字节码中不存在泛型信息
	 *       会报错，其实参数是一致的，都是List，不是函数重载
	 */
	/*public void Demo()
	{
		void save(List<Person> list)
		{
			
		}
		void save(List<Human> list)
		{
			
		}
	}*/

	/**
	 * 泛型写法：声明泛型集合时，集合两端泛型类型一致
	 *       泛型类型必须是引用类型，不能是基本类型。即：Integer(ok),int不行
	 */
/*	public void Demo2()
	{
		List<String> list1 = new ArrayList<String>();
		List list2 = new ArrayList<String>();
		List<Integer> list3 = new ArrayList();
		//以上均可
		
	}
	*/
	/**
	 * 泛型方法/泛型类/泛型接口：（见FanXingClass）
	 *      10几个类型，可以通用方法，用泛型；
	 *      取代之前各种的重载
	 */
	
	//泛型方法定义
	public <K,T> T save(T t, K k)
	{
		return null;
	}
	
	public void TestSaveDemo()
	{
		//使用泛型方法：在使用时，才确定泛型的类型
		save("abc",3);
	}	

}


