import java.util.Scanner;

/**
 * ѡ������ �ռ临�Ӷ�O(1)
 *         ʱ�临�Ӷ�O(n^2)
 *         ��index��¼ÿ��ѡȡ��С��Ԫ�أ����н���
 *         for  i;
 *           for  j = i+1;
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String []arr = line.split("\\s+");
		Integer [] arrInt = strArr2intArr(arr);
		Integer [] arrIntSort = SelSort(arrInt);
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
	
	private static Integer[] SelSort(Integer[] arr) {
		int index;
		int temp;
		for(int i = 0; i < arr.length; i++) {
			index = i;
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[j] < arr[index])
					index = j;
			}
			if(i != index) {
				arr[i] = arr[i]^arr[index];
				arr[index] = arr[i]^arr[index];
				arr[i] = arr[i]^arr[index];
			}
		}
		return arr;
	}

}
