import java.util.Scanner;
public class loopsDemo {
	public static void alphabets() {
		int i = 97;
		
		while(i<123) {
			char c = (char)i;
			System.out.println(c+ " ");
			i++;
		}
		System.out.println();
		 
	}
	public static void printTables(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabets();
		Scanner in = new Scanner(System.in);
		System.out.println("Which table do you want?");
		int num = in.nextInt();
		loopsDemo.printTables(num);
	}

}
