import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

		System.out.println("数字を入力");

		int a = 0;
		Scanner sc = new Scanner(System.in);// キーボードからの入力を取得する

		int b = sc.nextInt();

		while (b != 0) {
			b = b / 10;
			++a;

		}
		System.out.println("桁数は" + a);

	}
}