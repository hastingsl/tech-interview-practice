import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two strings, separated by a space.");
		String str1 = s.next();
		String str2 = s.next();
		System.out.println("The strings " + str1 + " and " + str2 + " are " + (isAnagram(str1, str2) ? "" : "not ")
				+ "anagrams of each other.");
		s.close();
	}

	static boolean isAnagram(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return false;
		}
		StringBuilder str2B = new StringBuilder(str2);
		for (int i = 0; i < str1.length(); i++) {
			char currChar = str1.charAt(i);
			int index = str2B.indexOf(currChar + "");
			if (index > -1) {
				str2B.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return true;
	}
}
