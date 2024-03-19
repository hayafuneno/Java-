import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		// String expression1 = "///+////";
		// String expression2 = "<///////+<<</+////";

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();// 文字をもらう

		String str1 = line;

		int currentNumber = 0;

		for (char c : str1.toCharArray()) {// 文字列を分割して格納

			if (c == '<') {
				currentNumber = currentNumber + 10;

			} else if (c == '/') {
				currentNumber++;
			}
		}

		System.out.println(currentNumber);

	}

}
