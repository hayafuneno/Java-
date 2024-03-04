import java.util.Scanner;
//001_D098:ボーナスの計算【提出済み】
public class Q18 {

	public static void main(String[] args) {
		//D098:ボーナスの計算
		//夏のボーナスを算出する仕組みを以下のルールで作成することにしました。
		//1ヶ月あたりの給与にボーナス計算のための係数1〜6を掛け算したものをボーナスの額とする。
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// キーボードで入力された値を取得する
		int b = sc.nextInt();// キーボードで入力された値を取得する

		System.out.println(a * b);
	}

}
