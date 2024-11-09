//1. Using Thread Class
class JavaThread extends Thread{
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Java");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
//2. by Using Runable Interface
class PythonThread implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Python");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class Test {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		JavaThread j= new JavaThread();
		j.start();//to begin user defined thread(start() method shoud not be called more than once- java.lang.IllegalThreadStateException)
		j.join();
		
		PythonThread p = new PythonThread();
		//p.run();
		Thread t = new Thread(p);
		t.start();
		t.join();
		//new thread won't be created. executed like a normal method.
		//j.run();
		for(int i = 1; i <= 5; i++) {
			System.out.println("Main");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
