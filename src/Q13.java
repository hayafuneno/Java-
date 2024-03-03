
public class Q13 {
	// 002_「名前、年齢、身長、体重の出力」【提出済み】
	public static void main(String[] args) {
		String name = "タロウ";
		int age = 20;
		double height = 170.0;
		double weight = 60.5;
//		boolean healty = true;

		System.out.println("私は" + name + "です" + age + "歳です");

		String result1 = ("私は" + name + "です。私は" + age + "歳です");
		String result2 = ("身長は" + height + "cmです。体重は" + weight + "kgです");

		System.out.println(result1);
		System.out.println(result2);
	}

}
