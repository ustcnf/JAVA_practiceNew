import org.junit.Test;
import java.io.*;


/**
 * 
 * @author Nf_ustc
 * IO��������ȷ:
 *     (1):��ȷԴ��Ŀ�ģ�������¼��Ϳ���̨�����
 *     (2):��ȷ�����Ķ����Ƿ��Ǵ��ı���������¼��Ϳ���̨�����Ȼ�Ǵ��ı��������ֽ�������Ҫ
 *        ��InputStreamReader �� OutputStreamWriter ����ת�������ڲ�����
 *        Reader �� Writer����
 *IO�����࣬���������ݷ��ࣺ�ֽ������ַ�����ר�Ŵ����ı�����
 *        ������������ࣺ�������������
 *IO���û��ࣺ
 *        �ֽ�����InputStream;OutputStream;
 *        �ַ�����Reader,Writer;
 */

public class IOAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	/**
	 * �ַ�����Reader,Writer
	 * ���������ʽ���ļ�
	 * ������Ӳ�̴���һ���ļ�������д�����ݡ�
	 * �ҵ�һ�������ļ����������FileWriter
	 * �����Ŀ¼��ͬ���ļ����������ǡ�
	 * Ŀ�ģ���ȷ�����ļ����Ŀ�ĵء�
	 */
	
/*	public void FileWriteDemo() throws IOException
	{
		FileWriter fw = new FileWriter("Demo.txt");
		
		//writeд�������棬��û������д���ļ�
		fw.write("abcde");
		//������������д���ļ�
		fw.flush();
		//close = close + flush;
		fw.close();
	}
	*/
	
	/**
	 * IO�쳣����ʽ
	 * �����潨�����ã���try�н�������
	 * ��ס��׼��ʽ
	 */
	/*public void IODeal()
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("abcdelf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
		finally
		{
			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("CloseError");
			}
		}
		
	}
	*/
	/**
	 * �����������ļ�����д
	 * д��Append
	 *ע��д�뻻��ʱ��д"\r\n"
	 */
	
	/*public void IOAppend()
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo1.txt",true);
			fw.write("abcdelf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
		finally
		{
			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("CloseError");
			}
		}
		
	}*/
	/**
	 * �ַ�������Ĭ�ϱ��루ϵͳĬ�ϱ��룩
	 * 
	 *��ȡ��ʽ��һ�֣�һ���ֽڵĶ�
	 *�ж����� fr.read() != -1;
	 */
/*	
	public void FileRead1() throws IOException
	{
		//����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ������
		//Ҫ��֤�ļ��Ѿ����ڣ���������ڣ��ᷢ���쳣
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1)
			System.out.println("ch="+(char)ch);
		fr.close();
	}
	*/
	/**
	 * �ַ�������Ĭ�ϱ��루ϵͳĬ�ϱ��룩
	 * 
	 *��ȡ��ʽ�ڶ��֣�ͨ���ַ�������ж�ȡ
	 *fr.read(char[])���ض������ַ����������
	 *�ж����� fr.read(char[]) != -1);
	 *char[] buf = new char[1024]; һ��1024��������
	 */
/*	
	public void FileRead2() throws IOException
	{
		//����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ������
		//Ҫ��֤�ļ��Ѿ����ڣ���������ڣ��ᷢ���쳣
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		char[] buf = new char[3];
		int num = 0;
		while((num = fr.read(buf)) != -1)
			System.out.println(new String(buf,0,num));
		fr.close();
	}
	*/
	/**
	 * ����һ���ļ�
	 * ��c���ļ�д��d���ļ���
	 * ����һ����ȡ���������
	 * ͨ�����϶�д������ݴ洢
	 * �ر���Դ
	 */
/*	public void copyText1()
	{
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("Dest.txt");
			fr = new FileReader("demo1.txt");
			int ch = 0;
			while((ch = fr.read()) != -1)
			{	
				fw.write(ch);
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
				try 
				{
					if(fw != null)
						fw.close();
					if(fr != null)
						fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	*/
	
	/**
	 * ����һ���ļ�
	 * ��c���ļ�д��d���ļ���
	 * ����һ����ȡ���������
	 * ͨ�����϶�д������ݴ洢
	 * �ر���Դ
	 */
/*	
	public void copyText2()
	{
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("Dest.txt");
			fr = new FileReader("demo1.txt");
			char [] chbuf = new char[1024];
			int len = 0;
			while((len = fr.read(chbuf)) != -1)
			{	
				fw.write(chbuf,0,len);
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("��дʧ��");
		}
		finally
		{
			if(fw != null)
				try 
				{
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fr != null)
				try 
				{
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	*/

	/**
	 * ��߶�дЧ�ʣ�����������
	 * BufferWriter
	 * ����������ǰ����������������
	 * ��ƽ̨�Ļ��з���bufw.newLine();
	 * �ر���Դ
	 */
/*	
	public void BufferReaderDemo()
	{
		FileWriter fw = null;
		BufferedWriter bufw = null;
		try {
			fw = new FileWriter("Demo2.txt");
			bufw = new BufferedWriter(fw);
			bufw.write("abcdefghijk");
			bufw.newLine();
			bufw.write("abcdefgh");
			bufw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}*/
	/**
	 * ��߶�дЧ�ʣ�����������
	 * BufferReader
	 * bufr.readLine()�������з���������bufw.newLine();
	 * ����������ǰ����������������
	 * ��ƽ̨�Ļ��з���
	 * �ر���Դ
	 */
	/*
	public void BufferReaderDemo() 
	{
		FileReader fr = null;
		BufferedReader bufr = null;
		try {
			fr = new FileReader("Demo2.txt");
			bufr = new BufferedReader(fr);
			String line = null;
			try {
				while((line = bufr.readLine())!= null)
					System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			if(bufr != null)
			try {
				bufr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	*/
	
	/**
	 * �ֽ�������(����ý�壬ͼƬ����);
	 * ���󣺸���ͼƬ����
	 * �ֽ���ʹ���ֽ����飻
	 */
	
/*	public void writeFileDemo()
	{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("abc.jpg");
			try {
				fos.write("abcle".getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}*/
	
	
	/**
	 * �ֽ�������(����ý�壬ͼƬ����);
	 * ���󣺸���ͼƬ����
	 * �ֽ���ʹ���ֽ����飻
	 */
/*	
	public void writeFileDemo()
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.jpg");
			try {
				byte[] buf = new byte[1024];
				fis.read(buf);
				System.out.println(new String(buf));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}*/
	
	/**
	 * �ֽ����Ļ���������(����ý�壬����MP3);
	 * ���󣺸���MP3����
	 * �ֽ���ʹ���ֽ����飻
	 * ԭ���Ȱ�FileInputStream�����ݶ�һ���ֵ�������BufferedInputStream
	 *  Ȼ��ӻ��������ж�ȡ��
	 */
	/*public void StreamDemo()
	{
		BufferedInputStream bufis = null;
		BufferedOutputStream bufos = null;
		
		try {
			bufis = new BufferedInputStream(new FileInputStream("1.jpg"));
			bufos = new BufferedOutputStream(new FileOutputStream("2.jpg"));
			int by = 0;
			try {
				while((by = bufis.read()) != -1)
					bufos.write(by);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	/**
	 * ��ȡ����¼��
	 */
	
/*	public void ReadKeyDemo() throws Exception
	{
		InputStream in = System.in;
		int by = in.read();
		System.out.println(by);
	}*/
	
	/**
	 * ��ȡ����¼��
	 * ��ȡһ�У����д�ӡ
	 * ���ǡ�over��ʱ��ֹͣ¼��
	 */
	/*
	public void ReadKeyDemo() throws Exception
	{
		InputStream in = System.in;
		int ch = 0;
		StringBuffer sb = new StringBuffer();
		while(true)
		{
			ch = in.read();
		    if(ch == '\r')
		    	continue;
		    if(ch == '\n')
		    	{
		    		if("over".equals(sb.toString()))
		    		{
		    			break;
		    		}
		    		System.out.println(sb.toString());
		    		sb.delete(0, sb.length());
		    	}
		    else
		    	sb.append((char)ch);
		   
		}
		
	}
	*/
	
	/**
	 * ��ReadLine()��ȡ����¼��;
	 * Ŀǰ������scanner ��ȡ����¼��
	 * ���ֽ���ת�����ַ�������ReadLine()������
	 * InputStreamReader:�ֽ�ͨ���ַ�������
	 */
	/*public void CovertStreamDemo()
	{
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bfr = new BufferedReader(isr);
		String line = null;
		try {
			while((line = bfr.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	/**
	 * OutputStreamReader:�ַ�ͨ���ֽڵ�����
	 * ��;��������¼������һ�ɴ�д
	 */
	/*public void CovertStreamDemo() throws Exception
	{
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bfr = new BufferedReader(isr);
		OutputStream out = System.out; 
		OutputStreamWriter osw = new OutputStreamWriter(out);
		String line = null;
		while((line = bfr.readLine()) != null)
		{
			osw.write(line.toUpperCase());
			osw.write("\r\n");
			osw.flush();
		}
		
	}
	*/
	
	/**
	 * ���󣺽�����¼������ݴ洢���ļ���
	 * OutputStreamReader:�ַ�ͨ���ֽڵ�����
	 * ��;���������¼��
	 */
	/*
	public void CovertStreamDemo2() throws Exception
	{
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bfr = new BufferedReader(isr);
		FileWriter fw = new FileWriter("demo3.txt");
		String line = null;
		while((line = bfr.readLine()) != null)
		{
			fw.write(line.toUpperCase());
			fw.write("\r\n");
			fw.flush();
		}
		
	}
	*/
	
	/**
	 * ���󣺽���ȡ���ļ����������̨��
	 * OutputStreamReader:�ַ�ͨ���ֽڵ�����
	 * ��;���ļ����ݵ�����̨������̨�������ֽ�����
	 */
	/*
	public void CovertStreamDemo3() throws Exception
	{
		BufferedReader bfr = new BufferedReader(new FileReader("demo3.txt"));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line = bfr.readLine()) != null)
		{
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		
	}
	*/
	
	/**
	 * ���󣺴洢��ָ�������ʽ���ļ�������utf-8,��ϵͳĬ�ϲ�ͬ��
	 * �ʲ�����FileWriter;
	 * OutputStreamWriter:����ָ������ı����ʽ
	 * ͬ����ȡutf-8,�ļ�����ҪInputStreamReader(FileInputStream(),"utf-8")
	 */
	
	/*public void CovertStreamDemo4() throws Exception
	{
		BufferedReader bfr = new BufferedReader(new FileReader("demo3.txt"));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Demo4.txt"),"utf-8"));
		String line = null;
		while((line = bfr.readLine()) != null)
		{
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		
	}*/
	
	/**
	 * �����޸�Ĭ�ϵ��������Դ
	 * System.setIn(InputStream) ע�⣺inputStrem ���Դ���FileInputStream
	 * System.setOut(PrintStream)
	 * PrintStream : ���ã�����ʾ�ڿ���̨����Ϣ������ı��ļ�
	 */
	
	/*public void SetOutDemo() throws Exception
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.setOut(new PrintStream("SetOutDemo.txt"));
		String line = null;
		while((line = bfr.readLine()) != null)
		{
			System.out.println(line);
		}
			
	}*/
	
	/**
	 * ͨ��File�����ļ��ļ�
	 * ���Խ����л�δ�е��ļ����ļ��з�װ�ɶ���
	 * File������������ File.createNewFile()
	 *      �������ļ��� 
	 *      File.mkdir()  �����ļ���
	 *      File.mkdirs();  �����༶Ŀ¼
	 *      ��ɾ��:f1.deleteOnExit()  �˳�ʱɾ��;f1.delete();
	 *      �жϣ�
	 *      f1.canExecute()�ܷ�ִ��
	 *     
	 *      �Ƿ���Ŀ¼�� 
	 *      ���ж� f1.exists();
	 *      f1.isDerectory(),f1.isFile()
	 *      
	 *      ��ȡ��Ϣ:
	 *      getName();
	 *      
	 */
	
/*	
	public void FileDemo() throws Exception
	{
		File f1 = new File("FileDemo.txt");
		f1.createNewFile();
		System.out.println(f1.canExecute());
		System.out.println(f1.exists());
		f1.deleteOnExit();
		
		File dir = new File("abc");
		dir.mkdirs();
		
	}
	*/
	/**
	 * ͨ��File�����ļ��ļ�
	 * ���󣺱��������ļ��Ĺ��ܣ������ļ���
	 *
	 * 
	*/
/*
	public void show()
	{
		File dir = new File ("D:\\nf_JAVA\\workspace");
		System.out.println(dir.isDirectory());
		showDir(dir);
	}
	public void showDir(File dir)
	{
		
		File [] files = dir.listFiles();
		for( int x = 0; x < files.length ; x++)
		{
			if(files[x].isDirectory())
				showDir(files[x]);
			else
				System.out.println(files[x]);
		}
	}
	*/
	/**
	 * �����Ŀ�嵥
	 * ����
	 * 
	*/
	/*public void PrintProjDemo()
	{
		String path = "";
		File fl = new File(path);
		File [] files = fl.listFiles();
		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(new FileWriter("JAVAList.txt"));
			for(File f : files)
			{
				if(!f.isDirectory())
				{
					bfw.write(f.toString());
					bfw.newLine();
					bfw.flush();
				}
					
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(bfw != null)
					bfw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	/**
	 * PrintWriter��PrintStream ��Writer�����ã�
	 * ���󣺴�ӡ����ĸ�ʽ���ļ�
	 * ���ƣ������ṩ��ӡ��������֤�������͵����ݽ���ԭ���Դ�ӡ
	 *    PrintWriter out = new PrintWriter(System.out);
	 *    out.println()
	 * �������ͣ�File��
	*/
	/*public void PrintDemo() throws IOException
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		// ������ļ�
		// PrintWriter out = new PrintWriter("a.txt");
		String line = null;
		line = bfr.readLine();
		while((line = bfr.readLine()) != null)
			{
				if("over".equals(line))
					break;
				//��Ҫ�ĵط�
				out.println((line.toUpperCase()));
				out.flush();
			}
			out.close();
		    bfr.close();		
	}
	*/
}
