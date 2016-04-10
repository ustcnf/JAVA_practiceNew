
class Ticket implements Runnable //extends Thread {
{
	private int tick = 100;	
	Object obj = new Object();
	public void run() {
	
	while(true){
		synchronized(obj)
		{
			if(tick > 0)
			{
				try{Thread.sleep(10);}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"sale:"+tick--);
			}
				
		}
	}
}

static class TicketDemo
{
	public static void main (String[] args) {
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}