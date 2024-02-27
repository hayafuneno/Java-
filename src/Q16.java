import java.util.Scanner;

//https://paiza.jp/challenges/122/show
public class Q16 {
	//N 人の選手で総当り対戦を行う場合、何回の対戦が行われるか出力して下さい。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 文字列の受け取り
		
		int number = Integer.parseInt(sc.nextLine());//数字であるからString型ではなく、int型, キーボードからの入力を取得する
													//（例）4人いたら、4×（4-1）÷2＝「6回」の対戦が行われる
													//（例）5人いたら、5×（5-1）÷2＝「10回」の対戦が行われる
		System.out.println(number *(number-1)/2);//自分から見た結果と相手側から見た結果で、【N×(N-1)/2】で求められる
	}
}