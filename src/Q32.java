
public class Q32 {
	// 占いプログラム
	public static void main(String[] args) {
		// ①待ち時間がある
		// ②実行する度に結果が変わる
		String[] color = { "黄", "黄緑", "青", "赤", "紫", "黒", "白"};// 文字列型の配列カラー

		System.out.println("あなたの今日の運勢は");//
		try { // 例外処理
			for (int i = 0; i < 3; i++) {// iが0～3まで3回繰り返される
				System.out.print(" .");// ...を表示する
				Thread.sleep(1000);// 1000ミリ 秒停止（1秒）
				// APIドキュメントで確認できる
				// sleepメソッドは現在実行中のスレッドを指定されたミリ秒数停止させる
				// long型を受け取る
			}

			double n1 = Math.random();// 0.0～1.0の乱数
			if (n1 >= 0.7) {
				System.out.println("大吉！");

			} else if (n1 >= 0.4) {
				System.out.println("中吉！");
			} else if (n1 >= 0.1) {
				System.out.println("小吉！");
			} else {
				System.out.println("凶");
			}

			int n2 = ((int) (n1 * 100)) % 10;// 小数第2位の値
			System.out.println("ラッキーカラーは" + color[n2]);

			// System.out.println("n1= "+n1);
			// System.out.println("n2= "+n2);

		} catch (InterruptedException e) {//

			System.out.println("割り込みが発生しました。");
		}
	}
}