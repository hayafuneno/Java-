import java.util.Scanner;
//D040:連休の天気
//001_D040:連休の天気【提出済み】
public class Q21 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		int count =0;
		for (int i = 0; i < 7; i++) {
			int date = sc.nextInt();
			if(date<=30) {
				count++;
			}
		}
			System.out.println(count);
	}
}
