package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePanID {
	public static void main(String[] args) {
		String str = "KEYNO1805M";
		
		String regex = "[A-Z]{5}[0-9]{4}[A-Z]";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		if(m.find()) {
			System.out.println("Correct");
		}else {
			System.out.println("Wrong");
		}
	}
}
