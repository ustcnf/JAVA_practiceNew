import org.junit.Test;
import java.io.*;


/**
 * 
 * @author Nf_ustc
 * IO流两个明确:
 *     (1):明确源和目的；（键盘录入和控制台输出）
 *     (2):明确操作的对象是否是纯文本。（键盘录入和控制台输出虽然是纯文本，但是字节流，需要
 *        用InputStreamReader 和 OutputStreamWriter 将其转换成易于操作的
 *        Reader 和 Writer对象）
 *IO流分类，按操作数据分类：字节流；字符流（专门处理文本）；
 *        按操作流向分类：输入流，输出流
 *IO常用基类：
 *        字节流：InputStream;OutputStream;
 *        字符流：Reader,Writer;
 */

public class IOAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	/**
	 * 字符流：Reader,Writer
	 * 最常见体现形式：文件
	 * 需求：在硬盘创建一个文件，并且写入数据。
	 * 找到一个操作文件的子类对象，FileWriter
	 * 如果该目录有同名文件，将被覆盖。
	 * 目的：明确数据文件存放目的地。
	 */
	
/*	public void FileWriteDemo() throws IOException
	{
		FileWriter fw = new FileWriter("Demo.txt");
		
		//write写到流里面，并没有马上写到文件
		fw.write("abcde");
		//将缓冲区内容写到文件
		fw.flush();
		//close = close + flush;
		fw.close();
	}
	*/
	
	/**
	 * IO异常处理方式
	 * 在外面建立引用，在try中建立对象。
	 * 记住标准格式
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
	 * 对已有数据文件的续写
	 * 写入Append
	 *注意写入换行时，写"\r\n"
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
	 * 字符流都有默认编码（系统默认编码）
	 * 
	 *读取方式第一种，一个字节的读
	 *判断条件 fr.read() != -1;
	 */
/*	
	public void FileRead1() throws IOException
	{
		//创建一个文件读取流对象，和指定名称的文件相关联
		//要保证文件已经存在，如果不存在，会发生异常
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1)
			System.out.println("ch="+(char)ch);
		fr.close();
	}
	*/
	/**
	 * 字符流都有默认编码（系统默认编码）
	 * 
	 *读取方式第二种，通过字符数组进行读取
	 *fr.read(char[])返回读到的字符数组个数。
	 *判断条件 fr.read(char[]) != -1);
	 *char[] buf = new char[1024]; 一般1024的整数倍
	 */
/*	
	public void FileRead2() throws IOException
	{
		//创建一个文件读取流对象，和指定名称的文件相关联
		//要保证文件已经存在，如果不存在，会发生异常
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
	 * 复制一个文件
	 * 将c盘文件写到d盘文件；
	 * 创建一个读取流和输出流
	 * 通过不断读写完成数据存储
	 * 关闭资源
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
	 * 复制一个文件
	 * 将c盘文件写到d盘文件；
	 * 创建一个读取流和输出流
	 * 通过不断读写完成数据存储
	 * 关闭资源
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
			throw new RuntimeException("读写失败");
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
	 * 提高读写效率：缓冲区技术
	 * BufferWriter
	 * 创建缓冲区前，必须现有流对象；
	 * 跨平台的换行符；bufw.newLine();
	 * 关闭资源
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
	 * 提高读写效率：缓冲区技术
	 * BufferReader
	 * bufr.readLine()不含换行符，常搭配bufw.newLine();
	 * 创建缓冲区前，必须现有流对象；
	 * 跨平台的换行符；
	 * 关闭资源
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
	 * 字节流操作(操作媒体，图片数据);
	 * 需求：复制图片数据
	 * 字节流使用字节数组；
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
	 * 字节流操作(操作媒体，图片数据);
	 * 需求：复制图片数据
	 * 字节流使用字节数组；
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
	 * 字节流的缓冲区操作(操作媒体，复制MP3);
	 * 需求：复制MP3数据
	 * 字节流使用字节数组；
	 * 原理：先把FileInputStream的数据读一部分到缓冲区BufferedInputStream
	 *  然后从缓冲区进行读取；
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
	 * 读取键盘录入
	 */
	
/*	public void ReadKeyDemo() throws Exception
	{
		InputStream in = System.in;
		int by = in.read();
		System.out.println(by);
	}*/
	
	/**
	 * 读取键盘录入
	 * 读取一行，进行打印
	 * 当是“over”时，停止录入
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
	 * 用ReadLine()读取键盘录入;
	 * 目前都在用scanner 读取键盘录入
	 * 将字节流转换成字符流，用ReadLine()方法。
	 * InputStreamReader:字节通向字符的桥梁
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
	 * OutputStreamReader:字符通向字节的桥梁
	 * 用途：将键盘录入的输出一律大写
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
	 * 需求：将键盘录入的数据存储到文件。
	 * OutputStreamReader:字符通向字节的桥梁
	 * 用途：保存键盘录入
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
	 * 需求：将读取的文件输出至控制台。
	 * OutputStreamReader:字符通向字节的桥梁
	 * 用途：文件数据到控制台（控制台是数据字节流）
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
	 * 需求：存储成指定编码格式的文件（例如utf-8,与系统默认不同）
	 * 故不能用FileWriter;
	 * OutputStreamWriter:可以指定输出的编码格式
	 * 同理：读取utf-8,文件，需要InputStreamReader(FileInputStream(),"utf-8")
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
	 * 可以修改默认的输入输出源
	 * System.setIn(InputStream) 注意：inputStrem 可以传个FileInputStream
	 * System.setOut(PrintStream)
	 * PrintStream : 常用：将显示在控制台的信息输出至文本文件
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
	 * 通过File操作文件文件
	 * 可以将已有或未有的文件或文件夹封装成对象
	 * File（）创建方法 File.createNewFile()
	 *      ：创建文件夹 
	 *      File.mkdir()  创建文件夹
	 *      File.mkdirs();  创建多级目录
	 *      ；删除:f1.deleteOnExit()  退出时删除;f1.delete();
	 *      判断，
	 *      f1.canExecute()能否执行
	 *     
	 *      是否是目录： 
	 *      先判断 f1.exists();
	 *      f1.isDerectory(),f1.isFile()
	 *      
	 *      获取信息:
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
	 * 通过File操作文件文件
	 * 需求：遍历所有文件的功能，包括文件夹
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
	 * 输出项目清单
	 * 需求：
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
	 * PrintWriter，PrintStream （Writer更常用）
	 * 需求：打印所需的格式到文件
	 * 优势：该流提供打印方法，保证数据类型的数据进行原样性打印
	 *    PrintWriter out = new PrintWriter(System.out);
	 *    out.println()
	 * 参数类型：File，
	*/
	/*public void PrintDemo() throws IOException
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		// 输出到文件
		// PrintWriter out = new PrintWriter("a.txt");
		String line = null;
		line = bfr.readLine();
		while((line = bfr.readLine()) != null)
			{
				if("over".equals(line))
					break;
				//重要的地方
				out.println((line.toUpperCase()));
				out.flush();
			}
			out.close();
		    bfr.close();		
	}
	*/
}
