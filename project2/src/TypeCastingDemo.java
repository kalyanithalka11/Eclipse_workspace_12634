
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=130;
		byte b = (byte)i;//there is a loss of information when we want to store the large datatype into a small data type.
		System.out.println(b);
		
		long l = 123456L;
		int i2 = (int)l;
		System.out.println(l);
		System.out.println(i2);
		
		double d = 123.456;
		int i3 = (int)d;
		System.out.println(d);
		System.out.println(i3);
		
		String s = "10";
		int num = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(num);
		
		int i4 = 100;
		String s5 = String.valueOf(i4);
		System.out.println(s5);
		
		
	}
	

}
