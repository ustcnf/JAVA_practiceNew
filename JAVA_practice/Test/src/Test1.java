import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;


public class Test1 {
   	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    */
/*    @Test
    //Դ����ת
    public void reverseString() {
    	String iniString = "abc";
        StringBuffer sb = new StringBuffer();
        sb = sb.append(iniString);
        System.out.println(sb.reverse().toString());
       
    }*/
 /*   @Test
    //Դ����ת2
    public void reverseString2() {
    	String iniString = "abc";
        char [] sor = iniString.toCharArray();
        char [] end = new char[sor.length];
        for(int i = 0; i < sor.length; i++) {
        	end[(sor.length)-i -1] = sor[i];
        }
        System.out.println(new String(end));
       
    }*/
 /*   @Test
    //����Ƿ�����ͬ��ĸ
    public void checkDifferent(){
    	 boolean flag = true;
    	 String iniString = "abdhkc";
    	 boolean [] arr = new boolean[256];
    	 if(iniString.length() > 256)
    		 flag = false;
    	 for(int i =0 ;i < iniString.length(); i++){
    		  int c = iniString.charAt(i);
    		  System.out.println(c);
    		  if(arr[c] )
    		  {
    			  flag = false;
    			  break;
    		  }
    		  arr[c] = true;
    		  
    	 }
    	System.out.println(flag);
    }
    */

//    @Test
//    /*�����ַ���ѹ��
//     * �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ�
//     * ���磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3������ѹ�����
//     * �ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
//     * */
//    public void zipString() {
//    	
//    	    String iniString = "jjjjjjxxxxxxxooZLLLLLLLLQQQQQQQQQLLLLLLLLECXXXXXXXIIIIIIIIIhjjyyySSooooooooommmuuEEEEEEEEEnnnnnnnffffffAAAAAllllllllbbbbkkkkkkkkkkkkKKKKKKhhhhhhhhhooooooooooYCCCCCCOOOOOOOOOMMMMMMMMMMiiiiiivvvvvvvWWWWkkkkkkwwwwwwwMmmmmmmmmLLLwwwwwwwkkkjjjjjjttttQQQQQQQQQaaaaaaaFFFFFFFlllllllllggggggggggPPPPPPuuuuuuuuaYYYYYYwQQQFFFFFFFFFFaaaaapXXXXXXXxxxxxxQQQQQQQQQsssssGGGGfffffffddddddpppQQQQQQHHHTTTaaaaaaGGGGGGddyyyyyMhhllllllllllNNNNNNNNUUUWWWWWWLLLLLLLLLYYYYYYYYYYTTKKKKKKKKiiiiiiitttttttXXXXXXXXXLLLHZZZZZZZssssjjJJJEEEEEOOOOOttttttttttBBttttttTTTTTTTTTTrrrrttttRRRRRyyooooooaaaaaaaaarrrrrrrPPPPPPPjjPPPPddddddddddHHHHnnnnnnnnnnSSSSSSSSSSzzHHHHHHHHHddddddDDDzzzhhhhhfffffffffftttttteeeeeeeeEEEEEEEEEaaaaaaccccccccccFFFFFFFF";
//            StringBuffer sb= new StringBuffer();
//            char [] arr = iniString.toCharArray();
//            if(iniString == null)
//            	System.out.println("wu");
//            int num = 1;
//            sb.append(arr[0]);
//            for(int i = 1; i < arr.length; i++){
//            	if(arr[i] == arr[i-1]) {
//            		num++;
//            	}
//            	else 
//            	{
//            		sb.append(num+""); 
//            		num = 1;
//            		sb.append(arr[i]);	
//            	}
//        		sb.append(num+""); 
//        		if(sb.length() == 2*arr.length)
//        			System.out.println(iniString);
//            System.out.println(sb.toString());
//            
//            }
// 
//    }
    
//    @Test
//    /*ȷ����������ͬ��
//     * ���������ַ��������д����ȷ������һ���ַ������ַ��������к�
//     * �ܷ�����һ���ַ���������涨��СдΪ��ͬ�ַ����ҿ����ַ����ص�ո�
//     * */
//    public void checkSam() {
//    	String stringA = "Here you are";
//    	String stringB = "Are you here";
//    	char [] arra = stringA.toCharArray();
//    	char [] arrb = stringB.toCharArray();
//    	Arrays.sort(arra);
//    	Arrays.sort(arrb);
//    	if(new String(arra).equals(new String(arrb))) {
//    		System.out.println("same");
//    	}
//    	else
//    		System.out.println("false");
//    	// write code here
//    }
    
    
//    @Test
//    /*ȷ����������ͬ��
//     * ���������ַ��������д����ȷ������һ���ַ������ַ��������к�
//     * �ܷ�����һ���ַ���������涨��СдΪ��ͬ�ַ����ҿ����ַ����ص�ո�
//     * */
//    /*
//     * ע�⣺ȡstring ��ÿһ��Ԫ��û��Ҫת�������飬ֱ����String.CharAt(int index)
//     * */
//    public void checkSam2() {
//    	String stringA = "Here you are";
//    	String stringB = "Are you here";
//    	if(stringA.length() != stringB.length())
//    		System.out.println("false");
//    	int [] count = new int [256];
//    	for(int i = 0; i < stringA.length(); i++) {
//    		count[stringA.charAt(i)]++;
//    	}
//    	for(int i = 0; i < stringA.length(); i++) {
//    		count[stringB.charAt(i)]--;
//    	}
//    	for(int i = 0; i < 256; i++) {
//    		if (count[i] != 0)
//    			System.out.println("false");
//    	}
//    	System.out.println("same");
//    	
//    	// write code here
//    }
    
    
//    @Test
//    /**  ���ط�ת
//     * ��һ����NxN�����ʾ��ͼ������ÿ��������һ��int��ʾ�����дһ���㷨��
//     * �ڲ�ռ�ö����ڴ�ռ�������(����ʹ�û������)����ͼ��˳ʱ����ת90�ȡ�
//     * */
//    public void transformImage() {
//    	int n =3;
//    	int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//    	int[][] result = new int[n][n];
//    	for(int i = 0; i < n ; i++) {
//    		for(int j = 0 ; j < n ; j++){
//    			result[i][j] = mat[n-j-1][i];
//    		}
//    	}
//    	for(int i = 0; i < n ; i++) {
//    		for(int j = 0 ; j < n ; j++){
//    			System.out.print(result[i][j]);
//    			
//    		}
//    		System.out.println();
//    	}
//    	
//    	
//    }
    
    
//    @Test
//    /**  �������
//     ���дһ���㷨����MxN������ĳ��Ԫ��Ϊ0���������ڵ����������㡣
//     ����һ��MxN��int[][]����(C++��Ϊvector>)mat�;���Ľ���n��
//     �뷵����ɲ������int[][]����(C++��Ϊvector>)����֤nС�ڵ���
//     300�������е�Ԫ��Ϊint��Χ�ڡ�
//     * */
//    public void CleanHL() {
//    	int [][]arr ={{1,2,3},{0,1,2},{0,0,1}};
//    	int n = 3;
//    	boolean []rows = new boolean[n];
//    	boolean []column = new boolean[n];
//    	for(int i = 0; i< rows.length ; i++) {
//    		rows[i] = false;
//    	}
//    	for(int i = 0; i< column.length ; i++) {
//    		column[i] = false;
//    	}
//    	for(int i = 0; i< rows.length; i++) {
//    		for(int j=0; j < column.length; j++) {
//    			if(arr[i][j] == 0) {
//    				rows[i] = true;
//    				column[j] = true;
//    			}
//    		}
//    	}
//    	for(int i = 0; i< rows.length; i++) {
//    		for(int j=0; j < column.length; j++) {
//    			if(rows[i] || column[j]) {
//    				arr[i][j] = 0;
//    			}
//    		}
//    	}
//    	for(int i = 0; i< rows.length; i++) {
//    		for(int j=0; j < column.length; j++) {
//    			System.out.print(arr[i][j]);
//    		}
//    		System.out.println();
//    	}
//    }
    
//    @Test
//    /**  ��ת�Ӵ�
//     �ٶ����Ƕ�֪���ǳ���Ч���㷨�����һ�������Ƿ�Ϊ�����ַ������Ӵ����뽫
//     ����㷨��д��һ�����������������ַ���s1��s2�����д������s2�Ƿ�Ϊ
//     s1��ת���ɣ�Ҫ��ֻ�ܵ���һ�μ���Ӵ��ĺ�����
//     ���������ַ���s1,s2,�뷵��boolֵ����s2�Ƿ���s1��ת���ɡ��ַ������ַ�
//     ΪӢ����ĸ�Ϳո����ִ�Сд���ַ�������С�ڵ���1000��
//    */
//    /*"Hello world","worldhello "
//              ���أ�false
//      "waterbottle","erbottlewat"
//               ���أ�true
//     * 
//     * */
//    public void ReverseEqual() {
//    	String s1 = "waterbottle";
//    	String s2 = "erbottlewat";
//    	String s3 = s1+s1;
//    	if(s3.indexOf(s2) >= 0)
//    		System.out.println(true);
//    	else 
//    		System.out.println(false);
//    	
//    	
//    }
	
//    /*  ����ָ�
//     * ���������Ϊ�˱��Ᵽ��ͷָ�룬����ͨ����smallFirst = smallNode;
//     * ��smallNode����
//     * 
//          ��д���룬�Ը���ֵxΪ��׼������ָ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ
//          ����һ�������ͷָ�� ListNode* pHead���뷵���������к�������ͷָ�롣ע�⣺�ָ��Ժ�
//         ����ԭ��������˳�򲻱䡣
//     * */
//    public class ListNode {
//    	private int val;
//        private ListNode next = null;
//
//        public ListNode(int val) {
//            this.val = val;
//         }
//    }
//   @Test 
//   public void  partition() {
//    	ListNode pHead = new ListNode(20);
//    	ListNode two = new ListNode(10);
//    	ListNode three = new ListNode(30);
//    	int x = 15;
//    	pHead.next = two;
//    	two.next = three;
//    	 if(pHead == null){
//        //     return pHead;
//         }
//         ListNode smallNode = new ListNode(-1);
//         ListNode bigNode = new ListNode(-1);
//         ListNode smallFirst, bigFirst;
//         ListNode pos = pHead;
//         smallFirst = smallNode;
//         bigFirst = bigNode;
//          
//         //ע��˴�������pHead,�����pHead.next�����ж�һ�Σ����������һ����
//         while(pHead != null){
//             if(pHead.val < x){
//            	 smallFirst.next = pHead;
//            	 smallFirst = pHead;;
//             }else{
//            	 bigFirst.next = pHead;
//            	 bigFirst = pHead;
//             }
//              
//             pHead = pHead.next;
//              
//         }
//         smallFirst.next = bigNode.next;
//         bigFirst.next = null;
//          
//         System.out.println(pos.val);
//         
//         while(smallNode!=null)
//         {
//        	 System.out.println(smallNode.val);
//        	 smallNode = smallNode.next;
//         }
//         
//    	
//    }
   
//   /*  �������
//   * �������������ʾ��������ÿ��������һ����λ����Щ��λ�Ƿ����ŵģ�Ҳ���Ǹ�λ��������
//   * ���ײ�����д������������������ͣ�����������ʽ���ؽ����������������ListNode* A��ListNode* B��
//   * �뷵��A+B�Ľ��(ListNode*)��
//   * 
//   * */
//  public class ListNode {
//  	private int val;
//      private ListNode next = null;
//
//      public ListNode(int val) {
//          this.val = val;
//       }
//  }
//  @Test
//  public void  plusAB() {
//	  Scanner sc = new Scanner(System.in);
//	  String line1 = sc.nextLine();
//	  String line2 = sc.nextLine();
//	  String [] arr1 = line1.split(",");
//	  String [] arr2 = line2.split(",");
//	  ListNode head1 = new ListNode(-1);
//  	  ListNode head2 = new ListNode(-1);
//  	  ListNode pos1 = head1;
//  	  ListNode pos2 = head2;
//	  for(int i = 0 ; i < arr1.length ; i++) {
//		  head1.next = new ListNode(Integer.parseInt(arr1[i]));
//		  head1 = head1.next;
//	  }
//	  head1.next = null;
//	  for(int i = 0 ; i < arr1.length ; i++) {
//		  head2.next = new ListNode(Integer.parseInt(arr2[i]));
//		  head2 = head2.next;
//	  }
//	  head2.next = null;
//	
//	  ListNode a = pos1.next;
//  	  ListNode b = pos2.next;
////  	  while(a !=null)
////	    {
////	   	  System.out.println(a.val);
////	   	  a = a.next;
////	    }
//  	  int c = 0;
//  	  int sum = 0;
//  	  ListNode Head = new ListNode(-1);
//  	  ListNode pos = Head;
//  	  while(a != null || b != null) {
//  		  if(a != null && b!= null) {
//  			  sum = (a.val + b.val + c)%10;
//  		      c = (a.val + b.val + c) / 10;
//  		      a = a.next;
//  		      b = b.next;
//  		      pos.next = new ListNode(sum);
//  		      pos = pos.next;
//  		  }
//  		  else if(a != null) {
//  			  sum = (a.val + c) % 10;
//  			  c = (a.val + c) / 10;
//  			  a = a.next;
//  			  pos.next = new ListNode(sum);
//		      pos = pos.next;
//  		  }
//  		  else {
//  			sum = (b.val + c) % 10;
//			  c = (b.val + c) / 10;
//			  b = b.next;
//  			  pos.next = new ListNode(sum);
//		      pos = pos.next;
//  		  }
//  	  }
//  	  if ( c > 0){
//  		  pos.next = new ListNode(1);
//  		  pos = pos.next;
//  	  }
//  	  pos.next = null;
//  	  while(Head!=null)
//    {
//   	  System.out.println(Head.val);
//   	  Head = Head.next;
//    }
//   }
  
//  /*  �����ַ���
//  * ���дһ����������������Ƿ�Ϊ���ġ�
//	����һ������ListNode* pHead���뷵��һ��bool�����������Ƿ�Ϊ���ġ�
//  * 
//  * */
//	public class ListNode {
// 	private int val;
//     private ListNode next = null;
//
//     public ListNode(int val) {
//         this.val = val;
//      }
//	}
//	@Test
//	public void isPalindrome() {
//		 Scanner sc = new Scanner(System.in);
//		 String line1 = sc.nextLine();
//		 String [] arr1 = line1.split(",");
//		 ListNode head1 = new ListNode(-1);
//	  	 ListNode pos1 = head1;		
//		 for(int i = 0 ; i < arr1.length ; i++) {
//		 head1.next = new ListNode(Integer.parseInt(arr1[i]));
//		 head1 = head1.next;
//	  }
//		 head1.next = null;
//		 StringBuilder sb = new StringBuilder();
//		 while(head1 != null) {
//			 sb.append(head1.val+"");
//			 head1 = head1.next;
//		 }
//		 String s1 = sb.toString();
//		 String s2 = sb.reverse().toString();
//		 System.out.println(s1.equals(s2));
//	}
//	
/*	@Test
	public void printMath(){
		System.out.println(Math.round(12.5)+Math.round(-12.5));
	}*/
	
	@Test
	public void printMath(){
		BigInteger m = new BigInteger();
		for(int i = 0 ; i < 10; i++) {
			int j = 0;
			m = m.multiply(new BigInteger(1024));
			j = m % 7;
			System.out.println("i:"+i+"j:"+j);
		}
	}
}
