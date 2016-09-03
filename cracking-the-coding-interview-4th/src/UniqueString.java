import java.util.Scanner;

public class UniqueString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string.");
		String inputString = s.next();
		System.out.println("String " + inputString + " is " + (isUnique(inputString) ? "unique" : "not unique") + ".");
		s.close();
	}

	static boolean isUnique(String str) {
		// Determines whether or not all characters in a string are unique
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				return false;
			}
		}
		return true;
	}
}
