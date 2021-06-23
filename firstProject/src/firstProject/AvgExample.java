package firstProject;

public class AvgExample {
	public static void main(String[] args) {
		// 국어, 영어, 수학 0 ~ 100
		// 국어 : 85, 수학 : 88, 영어: 83
		// 합계, 평균 
		int  kor;
		int  eng;
		int  math;
		kor = 85;
		eng = 83;
		math = 88;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		String name = " 강민정 ";
		System.out.println(name + "의 점수합계는" + sum + ", 평균은 " + avg + " 입니다 ");
	}

}
