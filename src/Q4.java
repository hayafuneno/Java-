import java.util.Scanner;
//D047:メダリストの表示
//入力した値をそのままの順番でインポートから出力させる
//https://paiza.jp/career/challenges/140
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// java.util.Scannerをインポートする

		String gold = sc.nextLine();// キーボードで入力された値を取得する
		String silver = sc.nextLine();// キーボードで入力された値を取得する
		String bronze = sc.nextLine();// キーボードで入力された値を取得する

		System.out.println("Gold " + gold);// 上記9行で入力したモノを出力
		System.out.println("Silver " + silver);// 上記10行で入力したモノを出力
		System.out.println("Bronze " + bronze);// 上記11行で入力したモノを出力
	}
}