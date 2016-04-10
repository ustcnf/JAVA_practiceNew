import java.util.Scanner;

/**
 * 插入排序： 空间复杂度O(1)
 *         时间复杂度O(n^2)
 *         用排序好的下一个元素与前面排序好的元素进行比较，选中合适的位置。
 *         for  int i =1 ; i<arr.length; i++;
 *           for  j = i -1; j>=0 && arr[j] > temp; j--;
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String []arr = line.split("\\s+");
		Integer [] arrInt = strArr2intArr(arr);
		Integer [] arrIntSort = InsertSort(arrInt);
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
	
	private static Integer[] InsertSort(Integer[] arr) {
		int temp = 0;
		int j;
		for (int i =1 ; i<arr.length; i++) {
			temp = arr[i];
			for(j = i -1; j>=0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		return arr;
	}

}
