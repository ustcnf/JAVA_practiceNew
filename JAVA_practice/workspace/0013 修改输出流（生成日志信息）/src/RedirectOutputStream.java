import java.io.*;

public class RedirectOutputStream {

	public static void main(String[] args) {
		try {
			PrintStream out = System.out;		
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("����ɹ�����");
			String  sex = "��";
			System.out.println("�Ա�ɹ�����");
			System.setOut(out);
			System.out.println("������ϣ��뿴��־");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
