class MyMath{
	public void printMulTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class NTR extends Thread{
	MyMath m;
	
	public NTR(MyMath m) {
		this.m = m;
	}
	@Override
	public void run() {
		m.printMulTable(10);
	}
}
class Ram extends Thread{
	MyMath m;
	public Ram(MyMath m) {
		this.m = m;
	}
	public void run() {
		m.printMulTable(11);
	}
}
class SaiPallavi extends Thread{
	MyMath m;
	
	public SaiPallavi(MyMath m) {
		this.m = m;
	}
	public void run() {
		m.printMulTable(12);
	}
}
public class Synchronization {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		MyMath m = new MyMath();
		
		NTR ntr = new NTR(m);
		ntr.start();
		ntr.join();
		
		Ram r = new Ram(m);
		r.start();
		r.join();
		
		SaiPallavi sp = new SaiPallavi(m);
		sp.start();
		sp.join();
	}

}
