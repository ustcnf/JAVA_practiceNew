import java.util.concurrent.locks.*;

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
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();
	
	public  void set(String name)
	{
		lock.lock();
		while(flag)
		try {
				condition_pro.await();
				this.name = name + "--" + count++;
				System.out.println(Thread.currentThread().getName()+">>生产者"+this.name);
				flag = true;
				condition_con.signal();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		finally{
			lock.unlock();
		}
		
	}
	public  void out() throws InterruptedException{
		lock.lock();
		try{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+">>消费者"+this.name);
			flag = false;
			condition_pro.signal();
		}
		finally
		{
			lock.unlock();
		}
		
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
			res.set("+商品+");
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
			try {
				res.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}