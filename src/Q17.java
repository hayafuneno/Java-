import java.util.Scanner;

public class Q17 {
	// D272:お菓子の重さ
	// 001_D272:お菓子の重さ【提出済み】
	public static void main(String[] args) {
		// お菓子が N 個用意されています。お菓子 1 個の重さは a です。
		// N と a が改行区切りで与えられるので、全体の重さを出力してください。
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();// キーボードで入力された値を取得する
		int a = sc.nextInt();// キーボードで入力された値を取得する

		System.out.println(n * a);
	}
}
