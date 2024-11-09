
public class MyMathTest {
    public static void main(String[] args) {
        int num = 123456;
        
        int reverse = MyMath.reverseNumber(num);        
        System.out.println(reverse);
        
        int sum = MyMath.sumOfDigits(num);
        System.out.println(sum);
        
        int count = MyMath.noOfDigits(num);
        System.out.println(count);        
    }
}

 