package strings;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortByLenght {
	static void printArrayString(String str[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
	}

	public static void main(String[] args) {
		String arr[] = { "sorted", "I", "string", "am" };
		int n = arr.length;

		// Function to perform sorting
		Arrays.sort(arr, new Comparator<String>() {

			public int compare(final String s1, final String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				return s1.length() < s2.length() ? -1 : 1;
			}
		});

		// Calling the function to print result
		printArrayString(arr, n);
	  }

	
	}


