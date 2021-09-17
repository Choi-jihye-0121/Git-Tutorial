package programmers;

import java.util.Scanner;

public class phoneNumber {

	public String solution(String phone_number) {

		String answer = "";
		int len = phone_number.length();

		for (int i = 0; i < len; i++) {
			String a = phone_number.charAt(i) + "";
			answer = (i < len - 4) ? answer + a.replace(a, "*") : answer + a;
		}
		return answer;
	}

	public static void main(String[] args) {
		phoneNumber p = new phoneNumber();
		Scanner sc = new Scanner(System.in);

		String phone_number = sc.nextLine();
		System.out.println(p.solution(phone_number));
		sc.close();
	}

}
