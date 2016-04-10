class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if(flag) {
			synchronized(Mylock.locka) {
				System.out.println("if locka");
				synchronized(Mylock.lockb) {
					System.out.println("if lockb");
				}
			}
		}
		else {
			synchronized(Mylock.lockb) {
				System.out.println("else locka");
				synchronized(Mylock.locka) {
					System.out.println("else locka");
				}
			}
		}
	}
}

class Mylock {
	static Object locka = new Object();
	static Object lockb = new Object();
}
public class deadLock {
	public static void main(String [] args){
		Thread t1 = new Thread(new Test(true));
		Thread t2 = new Thread(new Test(false));
		t1.start();
		t2.start();
	}
}

