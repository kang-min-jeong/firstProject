package operator;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int vall = 10;
		vall++;
		vall = vall + 2;
		vall += 2;
		vall--;
		vall = vall - 3;
		vall -=3;
		vall = vall * 2;
		vall *= 2;
		
		System.out.println(vall);
		
		String str1 = "A";
		str1 = str1 + "B";
		str1 += "C";
		System.out.println(str1);
		
		String msg = "";
		if(vall % 2 == 0) {
			msg = "짝수";
			System.out.println("짝수");
		} else {
			msg = "홀수";
		}
		System.out.println(vall + "은 " + msg + "입니다.");
		
		msg = (vall % 2 == 0) ? "짝수" : "홀수";
		System.out.println(vall + "은 " + msg + "입니다.");
}
	
