import java.util.Scanner;

//「D079:同じ文字」
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 文字列の受け取り
		String word = sc.nextLine();

		String[] wordLsit = word.split("");// 一文字ずつ区切って配列に格納
//		for (String str : wordList) {
//			System.out.print("["+str+"]");
//		}
		boolean chkEqual = isEqual(wordLsit);
		if (chkEqual) {
			// Trueなら「NG」を出力
			System.out.println("NG");
		} else {
			// Falseなら「OK」を出力
			System.out.println("OK");
		}
	}

	private static boolean isEqual(String[] words) {// メソッド、ローカル変数
		for (int i = 1; i < words.length; i++) {// 「1」からはじめる理由は、はじめの自分と比べる必要がないから
			if (!words[0].equals(words[i])) {
				return false;// 終了して返す、returnの後にロジックは書けない、処理が終了
			}
		}
		return true;
	}

}