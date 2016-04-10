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
    //源串翻转
    public void reverseString() {
    	String iniString = "abc";
        StringBuffer sb = new StringBuffer();
        sb = sb.append(iniString);
        System.out.println(sb.reverse().toString());
       
    }*/
 /*   @Test
    //源串翻转2
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
    //检查是否有相同字母
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
//    /*基本字符串压缩
//     * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
//     * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的
//     * 字符串没有变短，则返回原先的字符串。
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
//    /*确定两串乱序同构
//     * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，
//     * 能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
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
//    /*确定两串乱序同构
//     * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，
//     * 能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
//     * */
//    /*
//     * 注意：取string 的每一个元素没必要转换成数组，直接用String.CharAt(int index)
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
//    /**  像素翻转
//     * 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，
//     * 在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。
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
//    /**  清除行列
//     请编写一个算法，若MxN矩阵中某个元素为0，则将其所在的行与列清零。
//     给定一个MxN的int[][]矩阵(C++中为vector>)mat和矩阵的阶数n，
//     请返回完成操作后的int[][]矩阵(C++中为vector>)，保证n小于等于
//     300，矩阵中的元素为int范围内。
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
//    /**  翻转子串
//     假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。请将
//     这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查s2是否为
//     s1旋转而成，要求只能调用一次检查子串的函数。
//     给定两个字符串s1,s2,请返回bool值代表s2是否由s1旋转而成。字符串中字符
//     为英文字母和空格，区分大小写，字符串长度小于等于1000。
//    */
//    /*"Hello world","worldhello "
//              返回：false
//      "waterbottle","erbottlewat"
//               返回：true
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
	
//    /*  链表分割
//     * 链表操作：为了避免保存头指针，可以通过：smallFirst = smallNode;
//     * 对smallNode进行
//     * 
//          编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//          给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后
//         保持原来的数据顺序不变。
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
//         //注意此处条件是pHead,如果是pHead.next会少判断一次，拉下了最后一个数
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
   
//   /*  大数相加
//   * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表
//   * 的首部。编写函数对这两个整数求和，并用链表形式返回结果。给定两个链表ListNode* A，ListNode* B，
//   * 请返回A+B的结果(ListNode*)。
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
  
//  /*  回文字符串
//  * 请编写一个函数，检查链表是否为回文。
//	给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
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
