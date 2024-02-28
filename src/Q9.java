import java.util.Scanner;

//https://paiza.jp/challenges/331/show
public class Q9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 文字列の受け取り

		int money = sc.nextInt();// キーボードで入力された値を取得する
		int before = sc.nextInt();// キーボードで入力された値を取得する
		int after = sc.nextInt();// キーボードで入力された値を取得する

		// 株の購入前と株の売却後を比較していくら利益を上げることができたか整数で出力する
		// 上昇前の株価 A 円と上昇後の株価 B 円が与えられるので、いくら利益を上げることができたか計算してください。
		// ただし、株は 1 単位ごとにしか購入できないことに注意してください。

		// System.out.println(money/before);//購入した株数
		// 括弧のつけ方で優先順位が変わる
		System.out.println(((money / before * after) + (money % before)) - money);// 現在持っている額-

	}
}