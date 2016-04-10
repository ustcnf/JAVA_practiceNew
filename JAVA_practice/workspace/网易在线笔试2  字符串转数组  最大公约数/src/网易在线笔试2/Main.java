package ÍøÒ×ÔÚÏß±ÊÊÔ2;
/* 
3 50
50 105 200
5 20
30 20 15 40 100
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = null;
        String b = null;
        a = scan.nextLine();
        b = scan.nextLine();
        String []arr = a.split("\\s+");
		int num = Integer.parseInt(arr[0]);
		int result = Integer.parseInt(arr[1]);
		int [] arrBoss = new int[num];
		String[] arr2 = b.split("\\s+");
		for(int i = 0; i < arr2.length; i++) {
			arrBoss[i] = Integer.parseInt(arr2[i]);
		}
		for(int i = 0; i < arrBoss.length; i++) {
			if(result >= arrBoss[i]) {
				if(arrBoss[i] >= 0)
					result = result+arrBoss[i];
			}
				
			else
				result = result + maxGy(result,arrBoss[i]);
		}
		
		System.out.println(result);
		
		
		

	}
	
	 public static int maxGy(int num1, int num2) {
	        int min = num1;
	        int max = num2;
	        if (num1 > num2) {
	            min = num2;
	            max = num1;
	        }
	        if (min == 0)
	            return max;
	        else
	            return maxGy(min, max - min);
	    }

}
