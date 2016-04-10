import java.io.*;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int [][] triangel = new int[10][];
		for(int i = 0 ; i < 10 ;i++) {
			triangel[i] = new int[i+1];
			for(int j=0; j<=i ; j++){
				if(i == 0 || j==0 || i==j)
					triangel[i][j] = 1;
				else
					triangel[i][j] = triangel[i-1][j] + triangel[i-1][j-1];
				System.out.print(triangel[i][j]+"\t");
			}
			System.out.println();
			
		}
		
		
		}
		

	

}
