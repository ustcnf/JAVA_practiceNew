import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

import org.junit.Test;


/**
 * 
 * @author NF
 * Scanner scan = new Scanner(System.in);
 */
public class JavaInterview {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	
	@Test
/*	
 * ����true��ʾ����ͬ
 * false ��ʾ����ͬԪ��
 * public void checkDiff()
	{
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean [] booleanArr = new boolean[256];
		//System.out.println(boleanArr[1]);
		if(str.length() > 256)
			flag = false;
		for(int i=0; i < str.length(); i++)
		{
			int c = str.charAt(i);
			if(booleanArr[c])
			{
				flag = false;
				break;
			}
			booleanArr[c] = true;
		}
		System.out.println(flag);
	}*/

/*	
 * 
//     * �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ�
//     * ���磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3������ѹ�����
//     * �ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
 * public void zipString()
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuffer sb = new StringBuffer();
		char [] charArr = str.toCharArray();
		if(str == null)
			System.out.println("wu");
		int num = 1;
		for(int i = 1; i < charArr.length; i++)
		{
			if(charArr[i] == charArr[i-1])
				num++;
			else
			{				
				sb.append(charArr[i-1]);
				sb.append(num);
				num = 1;
			}
		}
	
			sb.append(charArr[charArr.length-1]);
			sb.append(num);
		
		System.out.println(str);
		System.out.println(sb.toString());
			
	}
	*/
	
/*	public void checkSame()
	{
    	String stringA = "Here you are";
    	String stringB = "Are you here";
    	char [] arr1 = stringA.toCharArray();
    	char [] arr2 = stringB.toCharArray();
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	if(new String(arr1).equals(new String(arr2)))
    		System.out.println("same");
    	else
    		System.out.println("false");
		
	}
	*/
	
	/**
	 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
	 * Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд
	 * ��������:
����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���

�������:
��������ַ����к��и��ַ��ĸ�����

��������:
ABCDEF
A

�������:
1
	 */


//		public static int countNum(String str,String ch )
/*		public  void countNum()
		{
			int num = 0;
			System.out.println(num);
			String str = "abdljlcaaabb";
			char ch = 'A';
			String strTemp = str.toUpperCase();
			char [] charArr = strTemp.toCharArray();
			for (int i = 0; i < charArr.length; i++)
				{
				if(charArr[i] == ch)
					num++;
				}
			System.out.println(num);
		}
*/
	/**
	 * ��Ŀ����

��������ѧУ����һЩͬѧһ����һ���ʾ����飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��100����
���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
�������źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 
 
Input Param 
     n               ����������ĸ���     
 inputArray      n�����������ɵ����� 
     
Return Value
     OutputArray    �����������������
 

ע������������֤�����������ȷ�ԣ�������������֤��

 
 

��������:
������У���������������ĸ�������������Ӧ����������


�������:
���ض��У�������Ľ��

��������:
11
10
20
40
32
67
40
20
89
300
400
15
11
10
20
40
32
67
40
20
89
300
400
15
�������:
10
15
20
32
40
67
89
300
400
	 */
/*	public void Test1() {
		String str = "11,10,20,40,32,67,40,20,89,300,400,15,11,10,20,40,32,67,40,20,89,300,400,15";
		String []strArr = str.split(",");
		int [] intArr = new int[strArr.length];
		for (int i = 0 ; i < intArr.length; i++)
		{
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i : intArr)
			treeSet.add(i);
		for(Integer i : treeSet){
			System.out.println(i);
		}
	}*/
	
	/**
	 * ��Ŀ����

�����һ����Ч�㷨���ҳ�����������֮��Ϊָ��ֵ�����������ԡ�
����һ��int����A�������Сn�Լ�����ҵĺ�sum���뷵�غ�Ϊsum�������Եĸ�������֤�����СС�ڵ���3000��
����������
[1,2,3,4,5],5,6
���أ�2
	 * 
	 */
	public void FindNumCp()
	{
		int []arr = {1,2,3,4,5};
		Arrays.sort(arr);
		int num = arr.length;
		int sum = 6;
		int count = 0;
		int i = 0;
		int j = num - 1;
		if( i == j )
			System.out.println(0);
		if( i == j && arr[i] == sum)
			System.out.println(1);
			
		while(i < j)
		{
			if(arr[i] + arr[j] < sum)
				i++;
			else if (arr[i] + arr[j] > sum)
				j--;
			else
			{
				count++;
				if(arr[i] == arr[i+1])
					i++;
				else 
				    j--;
			}
		}
		System.out.println(count);
	}
	
	
	   public int countPairs(int[] A, int n, int sum) {
			Arrays.sort(A);
			int count = 0;
			int countTemp1 = 0;
			int countTemp2 = 0;
			int i = 0;
			int j = n - 1;
			if( n==0)
				return 0;
			if (i == j && A[i] == sum)
				return 1;
				
			while(i < j)
			{
				if(A[i] + A[j] < sum)
					i++;
				else if (A[i] + A[j] > sum)
					j--;
				else
				{
					int temp1 = i;
					if(A[i] == A[i+1])
				}
			}
			return count;
	    }
}