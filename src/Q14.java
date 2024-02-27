
public class Q14 {
//「数値が0以上かどうか」を画面に表示するプログラムを作成する
	public static void main(String[] args) {

		int number = -2;// 変数numberを宣言し、数値を代入
		System.out.println(number+"です。");// 「 です。」と画面に表示

		if (number >= 0) { // もしnumberが0以上の場合、
			System.out.println("0以上です");// 「0以上です」と表示
		} else {// それ以外の場合
			System.out.println("0以下です");
		}

	}

}
