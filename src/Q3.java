import java.util.Scanner;

//何桁の数字が表示するプログラム
//001_D028:数字の桁数[提出済み]

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// キーボードからの入力を取得する
		int a = 0;
		int b = sc.nextInt();

		while (b != 0) {
			b = b / 10;
			++a;
		}
		System.out.println("桁数は" + a);
	}
}