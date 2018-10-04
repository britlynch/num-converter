package numconverter;

/** 
 * The NumConverterApp asks user for a value and the number system to convert 
 * to. The conversion is performed and the result is displayed to the user.
 * 
 * @author Brittany Lynch
 * @since 2018-10-03
 * 
 */

import java.util.Scanner;

public class NumConverterApp {

	public static void main(String[] args) {
		String number;
		int numSystem;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What number would you like to convert?");
		number = keyboard.next();
		
		System.out.println("What number system would you like to convert to? (1=binary, 2=decimal)");
		numSystem = keyboard.nextInt();
		
		if (numSystem == 1) {
			System.out.println(number + " in binary is " + decimalToBinary(number));
		} else if (numSystem == 2) {
			System.out.println(number + " in decimal is " + binaryToDecimal(number));

		} else {
			System.out.println("Invalid selection");
		}
	}

	private static double binaryToDecimal(String numFrom) {
		double decimalNum = 0;
		int binaryNum = 0;
		Stack thisStack = new Stack(20);
		
		for (int i=0; i<numFrom.length(); i++) {
			String sub = numFrom.substring(i, i+1);
			thisStack.push(sub);
		}
		
		
		for (int i=0; i<numFrom.length(); i++) {
			binaryNum = Integer.parseInt(thisStack.pop());
			decimalNum = decimalNum + (binaryNum*Math.pow(2,i));
		}
		return decimalNum;
		
		
		
	}
	
	public static String decimalToBinary(String numFrom) {
		int quotient = Integer.parseInt(numFrom);
		int divisor = 2;
		Stack numStack = new Stack(20); //creates stack
		String newNum = "";
		
		while (quotient != 0) {
			numStack.push(Integer.toString(quotient%divisor));
			quotient = quotient / divisor;
		}
		while (!numStack.isEmpty()) {
			newNum += numStack.pop();
		}
		return newNum;
	}
}
