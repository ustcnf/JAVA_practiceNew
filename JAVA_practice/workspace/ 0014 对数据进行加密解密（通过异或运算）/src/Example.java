import java.io.*;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个原字符符串或加密字符串");
		String psword = scan.nextLine();
		char [] arr = psword.toCharArray();
		for (int i = 0; i< arr.length; i++) {
			arr[i] = (char)(arr[i] ^ 20000);
		}
		System.out.println("加密结果或解密结果如下如下");
		System.err.println(new String(arr));
		
		
		}
		

	

}
