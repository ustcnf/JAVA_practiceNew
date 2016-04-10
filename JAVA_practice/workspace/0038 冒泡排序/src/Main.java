import java.util.Scanner;

/**
 * 冒泡排序： 空间复杂度O(1)
 *         时间复杂度O(n^2)
 *         想象气泡，不断上升
 *         for int i = 0; i < arr.length; i++
 *           for  int j = 0; j < arr.length - i - 1; j++
 *               arr[j] swap arr[j-1];
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String []arr = line.split("\\s+");
		Integer [] arrInt = strArr2intArr(arr);
		Integer [] arrIntSort = BubbleSort(arrInt);
		for(Integer i : arrIntSort) {
			System.out.print(i+"\t");
		}
//		int min = Integer.parseInt(arr[0]);
//		for(String s : arr){
//			int j = Integer.parseInt(s);
//			System.out.println(j);
//			if(j < min)
//				min = j;
//		}
//		System.out.println(min);
		
	}
	private static Integer[] strArr2intArr(String []arr) {
		Integer [] intArr = new Integer[arr.length];
		for(int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
	
	private static Integer[] BubbleSort(Integer[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
					
			}
				
		}
		return arr;
	}

}
