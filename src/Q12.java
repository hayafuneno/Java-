import java.util.Scanner;

//https://paiza.jp/career/challenges/581
//1 個の値段が N 円のリンゴがあり、リンゴを3つ買ったとき合計で何円になるかのプログラム
//001_D225:3つ買う [提出済み]
public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 文字列の受け取り
		int triple = sc.nextInt();// キーボードで入力された値を取得する

		System.out.println(triple * 3);
	}

}
