import java.io.*;

public class RedirectOutputStream {

	public static void main(String[] args) {
		try {
			PrintStream out = System.out;		
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("年龄成功定义");
			String  sex = "男";
			System.out.println("性别成功定义");
			System.setOut(out);
			System.out.println("运行完毕，请看日志");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
