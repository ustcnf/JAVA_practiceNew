class Res 
{
	private String name;
	private String sex;
	private boolean flag = false;
	public synchronized void get(String name, String sex){
		if(flag)
			try{this.wait();}catch(Exception e){}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	public synchronized void out()
	{
		if(!flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(name+"......"+sex);
		flag = false;
		this.notify();
	}
}

class Input implements Runnable
{
	private Res r;
	Input(Res r)
	{
		this.r = r;
	}
	public void run(){
		int x = 0;
		while(true) {
			if(x==0) {
				r.set()
			}
		}
	}
}

public class InputOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
