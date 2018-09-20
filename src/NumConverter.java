/*private static String ToDecimal(char numSysFrom, string numFrom) {
	String newNum;

	switch (numSysFrom) {
		case a: newNum = BinaryToDecimal(numFrom);
				break;
		case b:
	}
}*/

class NumConverter {

	public static void main(String[] args) {
		String binaryNum = "1101";
		
		System.out.println("The binary number to convert is " + binaryNum);

		String decimalNum = BinaryToDecimal(binaryNum);

		System.out.println("The decimal equivalent is " + decimalNum);
	}

	private static String BinaryToDecimal(String numFrom) {
		String newNum;
		double sum = 0;

		int length = numFrom.length();
		for (int index=0; index<length; index++) {
			System.out.println(numFrom.charAt(index));
			System.out.println(Math.pow(2, index));
			sum = (numFrom.charAt(index)) * (Math.pow(2, index));
			System.out.println(sum);
		}

		return Double.toString(sum);
	}
}
