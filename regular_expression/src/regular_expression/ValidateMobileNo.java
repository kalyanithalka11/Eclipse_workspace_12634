package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {
	public static void main(String[] args) {
		String str = "9121831652";
		String regex1 = "[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		String regex2 = "[6-9][0-9]{9}";
		String regex3 = "[6-9]\\d{9}";
		
		Pattern p = Pattern.compile(regex1);
		
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)) {
			System.out.println("Valid mobile Number");
		}
		else {
			System.out.println("Invalid Mobile Number");
		}
		
				
	}
}
