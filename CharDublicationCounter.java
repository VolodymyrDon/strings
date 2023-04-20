package strings;

import java.util.Arrays;

public class CharDublicationCounter {
	private short[] dubArr = new short[26];
	private final static short SHIFT = 97;

	/*
	 * method returns summary string in the following form :
	 * "char = a, times = 3; char = z, times = 2" summary should ignore single
	 * occurrence of char animals
	 * 
	 */
	public String calculateDublications(String input) {

		for (char ch : input.toCharArray()) {
			// ch = 'a' -> 97, 0
			// ch = 'z' -> 122, 25
			// ch = 'a'
			int index = convertToIndex(ch);
			dubArr[index] = ++dubArr[index];
		}
		System.out.println(Arrays.toString(dubArr));
		for (int i = 0; i < dubArr.length; i++) {
			short value = dubArr[i];
			if(value < 2) {
				continue;
			}else{
				char ch = convertToChar(i);
				String s = String.format("char = %c, times = %d", ch, dubArr[i]);
				System.out.println(s);
			}
		}
		
		return input;
	}

	private int convertToIndex(char ch) {
		int i = ch;
		int index = i - SHIFT;
		return index;

	}
	
	
	private char convertToChar (int index) {
		int i = index + SHIFT;
		char ch = (char) i;
		return ch;
	}
}
