package moBile;

import java.util.Scanner;

public class Stringa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		boolean flag = IsBoolean(line);
		
		
		

	}
	public boolean IsBoolean(String line) {
		boolean [] arr = new boolean[256];
		for(int i = 0; i < arr.length ; i++)
			arr[i] = false;
		char[] arrCh = line.toCharArray();
		for (int i = 0; arrCh.length; i++)
		{
			if(arr[arrCh[i]]== false){
				arr[arrCh[i]] = true;
			}
			else
				return true;
		}
		return false;
		
	}

}
