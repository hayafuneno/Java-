import java.util.Scanner;//インポートする

public class Sakura {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Paizaのサクラの問題
		// https://paiza.jp/challenges/236/show
		Scanner sc = new Scanner(System.in);// .java.util.Scannerをインポートする

		String n = sc.nextLine();// キーボードで入力された値を取得する
		String[] nList = n.split(" ");// 空欄区切りで、nListに格納されている文字を区切る
		String m = sc.nextLine();// nextLine()は入力された1行分の文字列を取得するメソッド
		String[] mList = m.split(" ");// 空欄区切りで、mListに格納されている文字を区切る

		int number = Integer.parseInt(nList[0]);// 文字列を整数にする
		int number1 = Integer.parseInt(nList[1]);
		int number2 = Integer.parseInt(nList[2]);

		int number3 = Integer.parseInt(mList[0]);// 文字列を整数にする
		int number4 = Integer.parseInt(mList[1]);
		int number5 = Integer.parseInt(mList[2]);

		int ans1 = number2 / (number1 * number);// 整数ans1=上記number2÷（number1×number）
		int ans2 = number5 / (number4 * number3);// 整数ans2=上記number5÷（number4×number3）

		int ans1Amari = number2 % (number1 * number);// 整数ans1=上記number2÷（number1×number）
		int ans2Amari = number5 % (number4 * number3);// 整数ans2=上記number5÷（number4×number3）

		if (ans1 == ans2) {// もしans1とans2が同じ答えであれば、「DRAW」を出力する
			if (ans1Amari == ans2Amari) {// もしans1とans2が同じ答えであれば、「DRAW」を出力する
				System.out.println("DRAW");
			} else if (ans1Amari < ans2Amari) {// もしans1がans2より小さかったらnに入っている方を出力する
				System.out.println(n);

			} else { // もしans2がans1より小さかったらnに入っている方を出力する
				System.out.println(m);

			}
		} else if (ans1 < ans2) {// もしans1がans2より小さかったらnに入っている方を出力する
			System.out.println(n);

		} else { // もしans2がans1より小さかったらnに入っている方を出力する
			System.out.println(m);
			
		}
	}

}
