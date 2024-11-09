
class Red extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Red");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Yellow extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Yellow");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

	class Blue extends Thread {
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Blue");
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

public class colours {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
	while (true) {
		Red r = new Red();
		r.start();
		r.join();
		
		
		Yellow y = new Yellow();
		y.start();
		y.join();
		
		
		Blue b = new Blue();
		b.start();
		b.join();
	}
	}

}
