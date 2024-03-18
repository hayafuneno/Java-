import java.util.ArrayList;

public class Q31 {

	//YouTube学習　ArrayListクラス
		public static void main(String[] args) {

			ArrayList<String> list = new ArrayList<String>();//<>の意味
			list.add("Java入門講座");
			list.add("ここまで");
			list.add("よく頑張りました");

			list.remove(1);//2つめの格納が消える（remove）
			
			for (int i = 0; i < list.size(); i++) {//（）の意味
				System.out.println(list.get(i));//list.get(i)の意味
			
			}

		}

}
