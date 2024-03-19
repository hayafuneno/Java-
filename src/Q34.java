import java.util.Scanner;

public class Q34 {
	//--PA-I---ZA
	//-PA-I-ZA【〇】
	public static void main(String[] args) {
        // 「-」が1つずつ出力されるコード
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();//文字をもらう
        String[] kkk = line.split("");//1文字ずつ確認していく、この宣言はfor文の前にくる
        for(int i = 0 ; i < kkk.length; i++){//文字の長さをみる
        	
               
        	if (kkk[i].equals("-")) {//もし-があれば、出力しない
 
        	} else {
    			System.out.println(kkk[i]);//カプセル化＝中身がわからくなくてもいい
    		}
        	
        	
        }
        
        System.out.println();
    }

}
