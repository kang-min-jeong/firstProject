package operator;

public class IfElseExample {
	public static void main(String[] args) {

		int score = 55;
		// 60보다 크면 console "합격입니다";
		// 60보다 작으면 console "불합격입니다";
		if (score >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		System.out.println("-----------------");
		// 95점 이상 A학점.
		// 85점 이상 B학점.
		// 70점 이상 C학점.
		// 60점 이상 D학점.
		// 이하 F학점.
		if (score >= 95) {
			System.out.println("A학점");
		} else if (score >= 85) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	} // end of main()
} // end of class 
