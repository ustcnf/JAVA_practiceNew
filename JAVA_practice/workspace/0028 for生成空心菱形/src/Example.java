import java.io.*;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("«Î ‰»Î––∫≈");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		char [][] arr = new char[(2*n-1)][(2*n-1)];
		for(int row = 0; row< 2*n - 1; row++) {
			for(int col = 0; col < 2*n -1 ; col++){
				arr[row][col] = ' ';
			}
		}
		for(int i = 0; i < n ;i++) {
			arr[i][n-i-1] = '*';
			arr[i][n+i-1] = '*';
		}
		for(int i = n; i < 2*n-1 ;i++) {
			arr[i][i-n+1] = '*';
			arr[i][3*n-i-3] ='*';
		}
		for(int row = 0; row< (2*n - 1); row++) {
			for(int col = 0; col < (2*n -1) ; col++){
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
			
		}
		

	

}
