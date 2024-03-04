import java.util.Scanner;

public class Q20 {
//D032:充電時間
//001_D032:充電時間【処理中】
	public static void main(String[] args) {
	// 1 分間で 1 % の充電が可能なスマートフォンの充電器があります。
	//現在のスマートフォンのバッテリーの残量n%からこの充電器で 100%まで充電するのに何分かかるか。
		Scanner sc = new Scanner(System.in);// 文字列の受け取り
		int a = sc.nextInt();// キーボードで入力された値を取得する
		
		System.out.println(100-a);
	}
}
