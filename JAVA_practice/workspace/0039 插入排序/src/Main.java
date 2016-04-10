import java.util.Scanner;

/**
 * �������� �ռ临�Ӷ�O(1)
 *         ʱ�临�Ӷ�O(n^2)
 *         ������õ���һ��Ԫ����ǰ������õ�Ԫ�ؽ��бȽϣ�ѡ�к��ʵ�λ�á�
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
