package strings;

public class StringExercise {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder("b");
		swap(sb1, sb2);

		System.out.printf("Main : sb1 = %s, sb2 = %s%n", sb1, sb2);

	}

	
	
	
	
	private static void swap(StringBuilder sb1, StringBuilder sb2) {
		System.out.printf("Before : sb1 = %s, sb2 = %s%n", sb1, sb2);
		StringBuilder temp = sb1;
		sb1 = sb2;
		sb2 = temp;
		System.out.printf("After : sb1 = %s, sb2 = %s%n", sb1, sb2);
	}





	private static int multiply(int value) {
		value *= 2;
		return value;
	}
}
