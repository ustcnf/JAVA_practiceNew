import java.io.*;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��ԭ�ַ�����������ַ���");
		String psword = scan.nextLine();
		char [] arr = psword.toCharArray();
		for (int i = 0; i< arr.length; i++) {
			arr[i] = (char)(arr[i] ^ 20000);
		}
		System.out.println("���ܽ������ܽ����������");
		System.err.println(new String(arr));
		
		
		}
		

	

}
