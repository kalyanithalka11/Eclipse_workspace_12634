package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGenerator {
	public static void main(String[] args) {
		String str = "kavyashu";
		
		String regex = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*(){}|/,.`~]))";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		if(m.find()) {
			System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
		}
		
		
	}
}
