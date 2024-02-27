
public class Q15 {
//「Javaに馴染もう」の問題
//「数値が偶数か奇数かどうか」を画面に表示するプログラムを作成する
	public static void main(String[] args) {
		int number = 11;//変数を宣言
		//for(int i =0 ; i< number.length ; i++) {//For文で回していく
		if(number%2==0) {//もしnumberが2で割った際に「0」であれば・・・
			System.out.println(number+"は偶数です");//該当すれば、「偶数」
		}else{
			System.out.println(number+"は奇数です");//該当しなければ、「奇数」
		}
	}
}