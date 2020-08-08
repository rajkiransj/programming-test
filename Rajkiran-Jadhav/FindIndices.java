import java.io.IOException;
import java.util.Scanner;

public class FindIndices {

	@SuppressWarnings("unlikely-arg-type")
	public static void findInd(String str, char input) {

		int length = str.length();
		StringBuilder sb = null;
		for (int i = 0; i < length; i++) {
			if (input == str.charAt(i)) {

				if (sb == null) {
					sb = new StringBuilder();
					sb.append("" + (i + 1));
				} else {
					sb.append("," + (i + 1));
				}
				System.out.println(sb.toString());
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = scanner.nextLine();
		System.out.println("Enter Charactor to find");
		char ch = (char) System.in.read();

		FindIndices.findInd(str, ch);
	}

}
