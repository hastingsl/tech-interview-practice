import java.util.Scanner;

public class ReverseCString {
	public static void main(String[] args) {
		// Accepts a string as input and shows output of reverseCString
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string.");
		String str = s.next();
		System.out.println("The string " + str + " reversed is " + reverseCString(str) + ".");
		s.close();
	}

	static String reverseCString(String str) {
		// Reverses a C-style string
		StringBuilder strB = new StringBuilder(str);
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char temp = strB.charAt(i);
			strB.setCharAt(i, strB.charAt(j));
			strB.setCharAt(j, temp);
		}
		return strB.toString();
	}
}
