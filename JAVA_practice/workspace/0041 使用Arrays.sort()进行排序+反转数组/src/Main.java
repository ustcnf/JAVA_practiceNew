
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
		List list = Arrays.asList(arrInt);     // ������ת��Ϊ�б�
		Collections.sort(list);             //����
		for(Integer i : arrInt) {
			System.out.print(i+"\t");
		}
		System.out.println();
		Collections.reverse(list);            //����
		arrInt = (Integer[])list.toArray();   //��ת��Ϊ����
		for(Integer i : arrInt) {
			System.out.print(i+"\t");          
		}
		System.out.println();
		String sortline = Arrays.toString(arrInt);   //ת�����ַ���
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
