
public class Single {
	
}
//����ʽ
class SingleMode
{
	private static final SingleMode s = new SingleMode();
	private SingleMode() {}
	public static SingleMode getInstance(){
		return s;
	}
}


//����ʽ
class SingleMode3
{
	private static SingleMode3 s = null;
	private SingleMode3(){}
	public static SingleMode3 getInstance() {
		if(s == null)
			s = new SingleMode3();
		return s;
	}
}


//����ʽ(ʹ���ڶ��߳�)

class SingleMode2
{
	private static SingleMode2 s = null;
	private SingleMode2() {}
	private static SingleMode2 getInstance()
	{
		if(s == null)
		{
			synchronized(Single.class)
			{
				if( s== null)
					s = new SingleMode2();
			}
		}
		return s;
	}
}


