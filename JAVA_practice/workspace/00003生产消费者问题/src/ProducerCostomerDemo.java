
public class ProducerCostomerDemo {
	
	public static void main(String[] args) {
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer com = new Consumer(r);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(com);
		t1.start();
		t2.start();

	}

}

class Resource {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name)
	{
		while(flag)
			try{this.wait();}catch(Exception e){}
		this.name = name + "--" + count++;
		System.out.println(Thread.currentThread().getName()+">>������"+this.name);
		flag = true;
		this.notifyAll();
	}
	public synchronized void out(){
		while(!flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+">>������"+this.name);
		flag = false;
		this.notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource  res;
	Producer(Resource res)
	{
		this.res = res;
	}
	public void run() {
		while(true) {
			res.set("+��Ʒ+");
		}
	}
}

class Consumer implements Runnable
{
	private Resource  res;
	Consumer(Resource res)
	{
		this.res = res;
	}
	public void run() {
		while(true) {
			res.out();
		}
	}
}