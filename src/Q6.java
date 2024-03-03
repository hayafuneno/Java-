import java.util.Scanner;

//「D079:同じ文字」
//すべて同じ文字であった場合、警報を出力する
//001_D079:同じ文字(Part1)[提出済み]
public class Q6 {

	public static void main(String[] args) {// メインメソッド

		Scanner sc = new Scanner(System.in);// 文字列の受け取り
		String word = sc.nextLine();// キーボードで入力された値を取得する
		String[] words = word.split("");// 一文字ずつ配列に格納

		// boolean型の変数を宣言
		boolean same = true;
		for (String i : words) {// 配列の一文字目と各要素を比較
//			if (words[0] != i) {///Heapを見ていない（スタックかも？）
//				same = false;
//				break;
//			}
			if (!words[0].equals(i)) {
				same = false;
				break;
			}
		}
	}
}
