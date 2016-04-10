import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String []arr = line.split("\\s+");
		int min = Integer.parseInt(arr[0]);
		for(String s : arr){
			int j = Integer.parseInt(s);
			System.out.println(j);
			if(j < min)
				min = j;
		}
		System.out.println(min);
		
	}

}
