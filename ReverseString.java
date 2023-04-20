package strings;

public class ReverseString {
	public static void main(String[] args) {
		String reversed = reverseString("animals");
		System.out.println(reversed);
		//reverseLikeStringBuilder("animals");
	}

	private static void reverseLikeStringBuilder(String input) {
		char ch;
// "", "a", "an"
		System.out.println("Original word: " + input);
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			//newStr = ch + newStr;
		}
		//System.out.println("Reversed word: " + newStr);
	}

	private static String reverseString(String input) {
		char[] chArrayInput = input.toCharArray();
		char[] chArrayOutput = new char[input.length()];
		String output = null;
		for (int i = 0; i < chArrayInput.length; i++) {
			chArrayOutput[i] = chArrayInput[chArrayInput.length - i - 1];// animals slamina
		}
		output = new String(chArrayOutput);
		return output;
	}

}
