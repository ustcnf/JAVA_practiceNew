import java.util.Scanner;

/**
 * 快速排序： 空间复杂度O(lg n)
 *         时间复杂度O(lg n)
 *         
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String []arr = line.split("\\s+");
		int [] arrInt = strArr2intArr(arr);
		Quick(arrInt);
		//Arrays.sort(arrInt);
		//System.out.println(arrInt+"\t");
	
		for(int i : arrInt) {
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
	private static int[] strArr2intArr(String []arr) {
		int [] intArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
	
	private static void Quick(int[] arr) {
		if(arr.length > 0)
			QuickSort(arr,0,arr.length - 1);
	}
	private static void QuickSort(int[] arr , int start , int end) {
		if(start < end)
		{
			int mid = getMiddle(arr, start , end);
			QuickSort(arr,start, mid - 1);
			QuickSort(arr,mid + 1, end);
		}
			
	}
	private static int getMiddle(int[] arr , int start , int end)
	{
		int temp = arr[start];
		while(start < end) {
			while(start < end && arr[end] >= temp)
				end--;
			arr[start] = arr[end];
			while(start < end && arr[start] <= temp)
				start++;
			arr[end] = arr[start];
		}
		arr[start] = temp;
		return start;
	}
	

}
