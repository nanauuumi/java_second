package second_java;

public class second {

	public static void main(String[] args) {
		// 【課題1】if文の使用
		//任意の整数型の変数 score を宣言し、任意の値で初期化してください。
		//score が80以上ならば「合格」と表示し、それ未満ならば「不合格」と表示してください。
		int score = 60;
		if(score >= 80) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		//【課題2】switch文の使用
		//1から7までの整数型の変数 dayOfWeek を宣言し、任意の値で初期化してください。
		//dayOfWeek の値に応じて、それぞれの曜日名を表示してください。
		int dayOfweek = 6;
		String dayName;
		
		switch (dayOfweek) {
			case 1:
				dayName = "月曜日";
				break;
			case 2:
				dayName = "火曜日";
				break;
			case 3:
				dayName = "水曜日";
				break;
			case 4:
				dayName = "木曜日";
				break;
			case 5:
				dayName = "金曜日";
				break;
			case 6:
				dayName = "土曜日";
				break;
			case 7:
				dayName = "日曜日";
				break;
			default:
				dayName = "不明";
		}
		System.out.println(dayName);
		
		//【課題3】条件演算子の使用
		//任意の整数型の変数 num1 と num2 を宣言し、任意の値で初期化してください。
		//num1 が num2 より大きい場合は「num1が大きい」と表示し、それ以外の場合は「num2が大きい」と表示してください。
		int num1 = 20;
		int num2 = 60;
		String num = (num1 > num2) ? "num1が大きい" : "num2が大きい";
		System.out.println(num);
	}
}
