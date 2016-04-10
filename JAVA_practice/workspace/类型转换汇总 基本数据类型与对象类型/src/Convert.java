import java.sql.Date;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Convert {
	@Test
	public void Str2int () {
		String str = "123";
		int i = Integer.parseInt(str);
//		System.out.println(i);
	}
	@Test
	public void Str2double() {
		String str = "123.56";
		double i = Double.parseDouble(str);
//		System.out.println(i);
	}
	@Test
	public void Str2long() {
		String str = "123";
		long i = Long.parseLong(str);
//		System.out.println(i);
	}
	@Test
	public void int2Str() {
		int i = 35;
		String str = Integer.toString(i);
		String str2 = i+"";
//		System.out.println(str2);
	}
	@Test
	public void double2Str() {
		double i = 35;
		String str = Double.toString(i);
		String str2 = i+"";
//		System.out.println(str2);
	}
	@Test
	public void sqlDate2Str() {
		double i = 35;
		String str = Double.toString(i);
		String str2 = i+"";
//		System.out.println(str2);
	}
	@Test
	public void Str2sqlDate() {
		String str = "2014-10-21";
		Date dt = Date.valueOf(str);
//		System.out.println(dt);
	}
	
	@Test
	public void Str2Sqldate() {
		Date dt = new Date(343425);
		String str = dt.toString();
//		System.out.println(str);
	}
	
	@Test
	public void Str2ByteArr() {
		String str = "abcd";
		byte[] by = str.getBytes();
//		for(int i=0; i<by.length; i++)
//			System.out.println((char)by[i]);
		}
	
	@Test
	public void Str2CharArr() {
		String str = "dcba";
		char[] arr = str.toCharArray();
//		for(int i=0; i<arr.length; i++)
//			System.out.println((char)arr[i]);
	}
	@Test
	public void Str2intArr() {
		String str = "123 343 4534 45 23 343";
		String [] strarr = str.split("\\s+");
		int [] intArr = new int[strarr.length];
		for(int i=0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(strarr[i]);
		}
//		for(int i=0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
	}
	@Test
	public void intArr2Str () {
		int[] intArr ={2,3,5,63,34};
//		for(int i=0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		Arrays.sort(intArr);
		String str = Arrays.toString(intArr);
//		System.out.println(str);
		
	}
	@Test
	public void intArr2Str2 () {
		int[] intArr ={2,3,5,63,34};
//		for(int i=0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		StringBuilder sb = new StringBuilder();
		for(int i : intArr) {
			sb.append(i+" ");
		}
		String str = sb.toString();
//		System.out.println(str);
		
	}
	@Test
	public void intArr2charArr(){
		int[] intArr ={97,99,98,100,101};
		char [] charArr = new char[intArr.length];
		for(int i = 0; i < intArr.length ; i++){
			charArr[i] = (char)intArr[i];
		}
//		for(int i=0; i < charArr.length; i++) 
//			System.out.println(charArr[i]);
	}
	@Test
	public void charArr2intArr(){
		
		char [] charArr = {'A','C','E','B','D'};
		int[] intArr = new int[charArr.length];
		for(int i = 0; i < charArr.length ; i++){
			intArr[i] = (int)charArr[i];
		}
//		for(int i=0; i < intArr.length; i++) 
//			System.out.println(intArr[i]);
	}
	@Test
   //数组转集合 数组必须对象类型才能用asList
	public void StrArr2List(){
		
		String [] StrArr = {"A","D","E","F","B"};
		List<String> list = Arrays.asList(StrArr);
		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
	}
	@Test
	   //数组转集合 数组必须对象类型才能用asList
		public void IntgerArr2List(){
			
			Integer [] intArr = {4,10,3,8,2};
			List<Integer> list = Arrays.asList(intArr);
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
		}
	
	
}





	

