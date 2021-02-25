package _01_Lambda_Methods;

import java.util.Locale;

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
            String str = "";
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.println((s.charAt(j) + "").toLowerCase());
                } else {
                    System.out.println((s.charAt(j) + "").toUpperCase());
                }
                System.out.println(str);
            }

        }, "upperandlowercase");
        // 4. Call the printCustomMessage method using a lambda so that the String
        // prints with a period in between each character.
        printCustomMessage((s) -> {
            String str = "";
            for (int j = 0; j < s.length(); j++) {
                if (j != s.length()-1) {
                    System.out.println(s.charAt(j) + ".");
                } else {
                    System.out.println(s.charAt(j));
                }
            }

        }, "upperandlowercase");

                // 5. Call the printCustomMessage method using a lambda so that the String
                // prints without any vowels.

        printCustomMessage((s) -> {
            String str = "";
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u') {

                } else {
                    System.out.println(s.charAt(j));
                }
            }

        }, "upperandlowercase");
    }

    public static void printCustomMessage(SpecialPrinter sp, String value) {
        sp.printSpecial(value);
    }
}
