package �������߱�����;
//@!%12dgsa
//010111100
//Character.isLetterOrDigit  �ж��Ƿ���ĸ������
//Character.isLetter  �ж��Ƿ���ĸ
//Character.Digit  �ж��Ƿ���ĸ
//


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = null;
        String b = null;
        a = scan.nextLine();
        b = scan.nextLine();
        System.out.println(a );
        String c = Conv(a);
        double result = 0;
        int count = 0;
        for(int i = 0 ; i<a.length(); i++) {
        	if(c.charAt(i) == b.charAt(i))
        		count++;

        }
        System.out.println(count);
        result = (double)count/a.length();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(result)+"%");


    }
	
	public static String Conv(String sour) {
		char[] arr = new char[sour.length()];
		for(int i = 0; i < sour.length(); i++) {
			if(Character.isLetterOrDigit(sour.charAt(i))) {
				arr[i] = '1';
			}
			else
				arr[i] = '0';
			
		}
		return new String(arr);
	}
		
		        

}

