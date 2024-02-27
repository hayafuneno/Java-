import java.util.Scanner;

//D278:徒歩何分
//徒歩は分速 80mの速さとし、目的地までの距離をXメートルとしたとき徒歩何分かを計算し出力
//https://paiza.jp/career/challenges/705
public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// java.util.Scannerをインポートする
		int lineInt = sc.nextInt();// 数字であるからString型ではなく、int型となる
		System.out.println(lineInt / 80);// 変数に入っている数字を80で割る解を出力背売る（小数点はなし）
	}
}