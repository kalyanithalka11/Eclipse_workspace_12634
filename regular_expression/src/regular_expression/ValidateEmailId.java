package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Only allowed characters a-z, 0-9.
 * should begin with alphabet
 * must contain @ character
 * ends with .com .in .org .edu
 */

public class ValidateEmailId {

	public static void main(String[] args) {
		
		String str = "kavya@gmail.com";
		
		String regex = "[a-z][a-z0-9._]*@[a-z0-9]+[.][a-z]{2,3}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
			
		}
		
	}

}
