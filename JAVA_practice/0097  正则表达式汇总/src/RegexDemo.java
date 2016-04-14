import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author ustcnf
 * 正则表达式汇总
 * 主要操作字符串,用特定的符号表示一些代码操作。
 * 弊端：符号定义越多，阅读性越差
 *主要功能： 1.匹配；String.matches(regex);
 *       2.切割：字符串  String.splite(regex);  实质：获取规则以外的字符串
 *       3.替换：String.replaceAll()；
 *       4.获取：将符合规则的字符串取出来：                             实质：获取规则以内的字符串
 *         1）.将正则表达式封装成对象；
 *         2）.将正则对象和要操作的字符串相关联；
 *         3）.关联后，获取正则匹配的引擎；
 *         4）.通过引擎对符合规则的字串进行操作，比如获取
 *         
 *       
 */
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	/**
	 * 匹配
	 */

	/*	public void CheckQQ()
	{
		String qq = "18888312";
		String regex = "[1-9][0-9]{4,14}";
		boolean flag = qq.matches(regex);
		if(flag)
		{
			System.out.println("QQ合法");
		}
		else
			System.out.println("QQ不合法");
	}*/
	
	
	/**
	 * 切割 有规律的字符串
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
	 * 按叠词切割 
	 * 用()封装成组，将结果重用;
	 * 从1号开始标号，通过\1来用
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
	 * 替换 
	 * 发帖替换：将字符串的数字换成###
	 * 去除叠词：用美元符号替换组的概念
	 */
/*
	public void replaceAllDemo()
	{
		//将手机号码屏蔽
		String strOld1 = "erkktyqq4223423uiz1231zo";
		//将叠词进行替换；
		String strOld2= "rekkddvlksdlfssssscbb";
		String strNew = "";
		String regex1 = "\\d{5,}";
		String regex2 = "(.)\\1+";
		strNew = strOld2.replaceAll(regex2, "$1");
		System.out.println(strNew);

	}
*/
	
	/**
 		4.获取：将符合规则的字符串取出来：
 *         1）.将正则表达式封装成对象；
 *         2）.将正则对象和要操作的字符串相关联；
 *         3）.关联后，获取正则匹配的引擎；
 *         4）.通过引擎对符合规则的字串进行操作，比如获取
 *            (先find()，然后用group()获取)
	 */
	public void getDemo()
	{
		String str = "ming tian jiu yao fang jiale ,da jia";
		String regex = "\\b[a-z]{4}\\b";
		//讲规则封装成对象
		Pattern p = Pattern.compile(regex);
		
		//对正则对象和要操作的字符串进行关联；获取匹配器对象(2,3步)
		Matcher m = p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());  //获取内容
			System.out.println(m.start());  //获取位置
			System.out.println(m.end());
		}
//		System.out.println(m.find());
//		System.out.println(m.group());
	}
}
