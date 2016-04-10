import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

//类似Intefer 这种引用变量，计算时不能用加减，需要用add，divide等方法。
public class Example {

	public static void main(String[] args) {
			BigDecimal sum = new BigDecimal(0.0);
			BigDecimal fatorial = new BigDecimal(1.0);
			for(int i =0 ; i < 20; i++){
				fatorial =new BigDecimal(1.0/Multi(i+1));
				//System.out.println(Multi(i+1));
				sum = sum.add(fatorial);
			//	System.out.println(sum);
				//System.out.println("----------------");
			}
			System.out.println("Resutl:"+sum);
		//	System.out.println("----------------");
			
		}
	
	public static double Multi(int n){
		if(n == 1)
			return 1.0;
		else
			return n*Multi(n-1);
	}

	

}
