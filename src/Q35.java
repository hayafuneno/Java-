import java.util.Scanner;
public class Q35 {
	public static void main(String[] args) {
		// String expression1 = "///+////";
		// String expression2 = "<///////+<<</+////";
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();// 文字をもらう
		String str1 = line;

		int currentNumber = 0;
		char[] cList = str1.toCharArray();
		// for (char c : str1.toCharArray()) {// 拡張For 文字列を分割して格納
		// 定義して、インデックスを取り出す
		// for(int i =0 ; i<X ;i++) {
		for (int i = 0; i < str1.length(); i++) {
			char c = cList[i];//配列から1件ずつ何かを取り出すとき、よく使うのがこのソースコード
			// }
			if ( c == '<') {
				currentNumber = currentNumber + 10;
			} else if ( c == '/') {
				currentNumber++;
			}
		}
		System.out.println(currentNumber);// forの
	}
}