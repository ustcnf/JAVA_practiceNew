
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String []arr = line.split("\\s+");
		Integer [] arrInt = strArr2intArr(arr);
		List list = Arrays.asList(arrInt);     // 将数组转换为列表
		Collections.sort(list);             //排序
		for(Integer i : arrInt) {
			System.out.print(i+"\t");
		}
		System.out.println();
		Collections.reverse(list);            //逆序
		arrInt = (Integer[])list.toArray();   //再转换为数组
		for(Integer i : arrInt) {
			System.out.print(i+"\t");          
		}
		System.out.println();
		String sortline = Arrays.toString(arrInt);   //转换成字符串
		System.out.println(sortline);
		StringBuffer sortlinestr = new StringBuffer(sortline).reverse();
		//Integer [] arrIntSort = QuickSort(arrInt);
		
		
		System.out.print(sortlinestr.toString());
//		
		
	}
	private static Integer[] strArr2intArr(String []arr) {
		Integer [] intArr = new Integer[arr.length];
		for(int i = 0; i < arr.length; i++) {
			intArr[i] = new Integer(Integer.parseInt(arr[i]));
		}
		return intArr;
	}
}
