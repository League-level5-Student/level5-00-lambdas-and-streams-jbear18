package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustomMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String str = "";
			for (int j = s.length(); j > 0; j--) {
				str += s.substring(j - 1, j);
			}
			System.out.println(str);
		}, "Preston is weird!");


	// 3. Call the printCustomMessage method using a lambda so that the String
	// prints with a mix between upper an lower case characters.
	printCustomMessage((s) -> {
		String str="";
		for (int j = 0; j < s.length(); j++) {
			if(s.length[j] % 2==0){
				//use substring
				s.toLowerCase();
		}else{
				s.toUpperCase();			}
		System.out.println(str);
	}, "upperandlowercase");

}
	// 4. Call the printCustomMessage method using a lambda so that the String
	// prints with a period in between each character.
printCustomMessage((s) -> {
	String str= "";
		s.split("");
		for (int i = 0; i < s.length(); i++) {

		}
	}
	// 5. Call the printCustomMessage method using a lambda so that the String
	// prints without any vowels.
	}
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
