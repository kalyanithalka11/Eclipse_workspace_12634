package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNo3 {
	public static void main(String[] args) {
		String str = "This is yashu. My contact No. 7893597301, 8008652203";
		
		String regex = "[6-9]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println("Found");
			System.out.println(m.group());
			
		}
	
	}
	
}
