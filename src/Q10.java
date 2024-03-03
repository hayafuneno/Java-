import java.util.Scanner;
//https://paiza.jp/challenges/193/show
//D072:データのバックアップ
//

public class Q10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 文字列の受け取り Scannerクラスのインスタンスscを作成

		// String next = numbers.next();
		String inputStr = sc.nextLine();// 1行目を見る
		String[] numberList = inputStr.split(" ");// 一文字ずつ区切って配列に格納

//		int numbers = Integer.parseInt();//Stringからintに変更する
//	
		String[] numbers = new int[2];// int型の要素を代入する配列numbersを用意
//
//		for (int i = 0; i < numbers.length; i++) {// forループを回して、nextInt()でスペースの直前の数字をnumbersに代入していく
//			numbers[i] = sc.nextInt();
//		}
//		System.out.println((numbers[0] % numbers[1]) + (numbers[2] * numbers[1]));

	}
}
