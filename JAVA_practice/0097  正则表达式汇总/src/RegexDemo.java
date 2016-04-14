import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author ustcnf
 * ������ʽ����
 * ��Ҫ�����ַ���,���ض��ķ��ű�ʾһЩ���������
 * �׶ˣ����Ŷ���Խ�࣬�Ķ���Խ��
 *��Ҫ���ܣ� 1.ƥ�䣻String.matches(regex);
 *       2.�и�ַ���  String.splite(regex);  ʵ�ʣ���ȡ����������ַ���
 *       3.�滻��String.replaceAll()��
 *       4.��ȡ�������Ϲ�����ַ���ȡ������                             ʵ�ʣ���ȡ�������ڵ��ַ���
 *         1��.��������ʽ��װ�ɶ���
 *         2��.����������Ҫ�������ַ����������
 *         3��.�����󣬻�ȡ����ƥ������棻
 *         4��.ͨ������Է��Ϲ�����ִ����в����������ȡ
 *         
 *       
 */
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	/**
	 * ƥ��
	 */

	/*	public void CheckQQ()
	{
		String qq = "18888312";
		String regex = "[1-9][0-9]{4,14}";
		boolean flag = qq.matches(regex);
		if(flag)
		{
			System.out.println("QQ�Ϸ�");
		}
		else
			System.out.println("QQ���Ϸ�");
	}*/
	
	
	/**
	 * �и� �й��ɵ��ַ���
	 */

	/*public void SpiteDemo1()
	{
		String str = "c:\\abc\\a.txt";
		String regex = "\\\\";
		String [] strArr = str.split(regex);
		for(String st : strArr)
		{
			System.out.println(st);
		}
		
	
	}
	*/
	
	/**
	 * �������и� 
	 * ��()��װ���飬���������;
	 * ��1�ſ�ʼ��ţ�ͨ��\1����
	 */

	/*public void SpiteDemo2()
	{
		String str = "erkktyqquizzo";
		String regex = "(.)\\1";
		String [] strArr = str.split(regex);
		for(String st : strArr)
		{
			System.out.println(st);
		}
	}
	*/
	
	/**
	 * �滻 
	 * �����滻�����ַ��������ֻ���###
	 * ȥ�����ʣ�����Ԫ�����滻��ĸ���
	 */
/*
	public void replaceAllDemo()
	{
		//���ֻ���������
		String strOld1 = "erkktyqq4223423uiz1231zo";
		//�����ʽ����滻��
		String strOld2= "rekkddvlksdlfssssscbb";
		String strNew = "";
		String regex1 = "\\d{5,}";
		String regex2 = "(.)\\1+";
		strNew = strOld2.replaceAll(regex2, "$1");
		System.out.println(strNew);

	}
*/
	
	/**
 		4.��ȡ�������Ϲ�����ַ���ȡ������
 *         1��.��������ʽ��װ�ɶ���
 *         2��.����������Ҫ�������ַ����������
 *         3��.�����󣬻�ȡ����ƥ������棻
 *         4��.ͨ������Է��Ϲ�����ִ����в����������ȡ
 *            (��find()��Ȼ����group()��ȡ)
	 */
	public void getDemo()
	{
		String str = "ming tian jiu yao fang jiale ,da jia";
		String regex = "\\b[a-z]{4}\\b";
		//�������װ�ɶ���
		Pattern p = Pattern.compile(regex);
		
		//����������Ҫ�������ַ������й�������ȡƥ��������(2,3��)
		Matcher m = p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());  //��ȡ����
			System.out.println(m.start());  //��ȡλ��
			System.out.println(m.end());
		}
//		System.out.println(m.find());
//		System.out.println(m.group());
	}
}
