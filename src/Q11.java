import java.util.Scanner;

//https://paiza.jp/challenges/471/show
public class Q11 {
	// 1 センチメートルは 10 ミリメートルに変換される
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 文字列の受け取り
		
		int lineInt = Integer.parseInt(sc.nextLine());

//		int lineInt = sc.nextInt();// 数字であるからString型ではなく、int型, キーボードからの入力を取得する

		System.out.println(lineInt * 10);

	}
}
