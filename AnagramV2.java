package anagram;

public class AnagramV2 {
	static int counter = 0;
	static char[] temp;

	public static void main(String[] args) {
		String s = "bear";
		anagram("", s);
		
		System.out.println(counter);
//		temp = new char[s.length()];
//		temp = s.toCharArray();
//		System.out.print(temp);

	}

	private static void anagram(String prefix, String remain) {
		{
			if (remain.length() == 0) {
				System.out.println(prefix);

			}

			for (int i = 0; i < remain.length(); i++) {
				String newWord = prefix + remain.charAt(i);

				String nextRemaining = remain.substring(0, i) + remain.substring(i + 1, remain.length());

				counter += 4;
				anagram(newWord, nextRemaining);

			}

		}

	}

}
