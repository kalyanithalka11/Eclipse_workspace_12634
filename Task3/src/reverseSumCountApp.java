
public class reverseSumCountApp {

	

	public int sum(int num) {
		int sum = 0;
		if (num > 0) {
			while (num != 0) {
				int r = num % 10;
				sum = sum + r;
				num = num / 10;
			}
			System.out.println(sum);
		} else {
			System.out.println("Can't reverse it");
		}
		return sum;
	}

	public void count(int num) {
		int count = 0;
		if(num > 0) {
			while(num != 0) {
				int r = num % 10;
				count ++;
				num = num % 10;
			}
		}System.out.println(count);
		
	}

	public void reverse(int num) {
		// TODO Auto-generated method stub
		
	}
}
