package multithreading;

class BahubaliThread extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		System.out.println("2. BahubaliThread begins calculaion");
		for(int i=1; i<=50; i++) {
			total += i;
		}
		//connecting network or database connection
		System.out.println("3. BahubaliThread gives notification");
		synchronized(this) {
			//this.notify();
			this.notifyAll();
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		BahubaliThread b = new BahubaliThread();
		b.start();
		
		//main Thread
		//Thread.sleep(1);
		//b.join();
		System.out.println("1. Main thread calling wait()...");
		synchronized(b) {
			b.wait();
		}
		System.out.println("4. Main thread gets notification.");
		System.out.println("The Sum of 1 to 50 is : "+b.total);
	}

}
