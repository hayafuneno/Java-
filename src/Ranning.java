import java.util.Scanner;//インポートする

public class Ranning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//java.util.Scannerをインポートする
		 System.out.println("その日走る距離（ｍ）を数字で入力してください");
		 
		int track =sc.nextInt();//コンソール画面で数字を入力する
		System.out.println(track*4);//コンソール画面で入力した数字「×4」
		System.out.println("その日走る距離は" + track*4 + "（ｍ）です");
	}
}