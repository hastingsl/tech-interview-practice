import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string.");
		String str = s.next();
		System.out.println(
				"The string " + str + " with all duplicate characters removed is " + removeDuplicateChars(str) + ".");
		s.close();
	}

	static String removeDuplicateChars(String str) {
		// Removes duplicate characters in a string
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			int j = i + 1;
			while (j < str.length()) {
				if (currChar == str.charAt(j)) {
					str = str.substring(0, j) + str.substring(j + 1);
				} else {
					j++;
				}
			}
		}
		return str;
	}
}
