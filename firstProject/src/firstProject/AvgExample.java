package firstProject;

public class AvgExample {
	public static void main(String[] args) {
		// ����, ����, ���� 0 ~ 100
		// ���� : 85, ���� : 88, ����: 83
		// �հ�, ��� 
		int  kor;
		int  eng;
		int  math;
		kor = 85;
		eng = 83;
		math = 88;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		String name = " ������ ";
		System.out.println(name + "�� �����հ��" + sum + ", ����� " + avg + " �Դϴ� ");
	}

}
