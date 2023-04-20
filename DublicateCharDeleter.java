package strings;

import java.util.Arrays;

public class DublicateCharDeleter {
	private final static short SHIFT = 97;

	/*
	 * method returns input string without duplicated chars inupt = "animals" output
	 * = "nimls" input = "paper" output = "aer"
	 * створити масив чарів розміром в вхідне слово
	 * створити invertToChar
	 * пробігтись по DubArray поставити унікальні чари в їх позицію у слові (['nul', 'n', 'i', 'm', 'nul', 'l', 's']), паралельно підрахувати скільки унікальних чарів  
	 * створити масив чарів розміром з кількість унікальних чарів
	 * ідемо по цьому масиву, і якщо не nul то ставлю на позицію
	 * створити з останнього масиву стрінг
	 */
	public String charDubDelete(String input) {
		String output = null;
		char[] chOutArr = new char[input.length()];
		short[] dubArr = new short[26];
		System.out.println(Arrays.toString(dubArr));
		for (int i = 0; i < dubArr.length; i++) {
			dubArr[i] = -1;
		}
		System.out.println(Arrays.toString(dubArr));

		for (int chIndex = 0; chIndex < input.length(); chIndex++) {
			int index = convertToIndex(input.charAt(chIndex));
			short prevValue = dubArr[index];
			if(prevValue == -1) {
				dubArr[index] = (short) chIndex;
			} else {
				dubArr[index] = -2;
			}
			
		}
		System.out.println(Arrays.toString(dubArr));
		return output;

	}

	private int convertToIndex(char ch) {
		int i = ch;
		int index = i - SHIFT;
		return index;

	}
}
