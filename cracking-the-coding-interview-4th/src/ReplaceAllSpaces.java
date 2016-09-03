import java.util.Scanner;

public class ReplaceAllSpaces {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string on one line:");
		String str = s.nextLine();
		System.out.println("The string " + str + " with all spaces replaced is " + replaceAllSpaces(str) + ".");
		s.close();
		System.exit(0);
	}

	static String replaceAllSpaces(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str = str.replace(" ", "%20");
			}
		}
		return str;
	}
}
