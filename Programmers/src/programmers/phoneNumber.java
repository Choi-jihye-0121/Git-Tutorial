package programmers;

import java.util.Scanner;

public class phoneNumber {

	public String solution(String phone_number) {

		char[] arr = phone_number.toCharArray();
        for(int i = 0; i<arr.length-4; i++) {
           arr[i] ='*';
        }
        return String.valueOf(arr);  
	}

	public static void main(String[] args) {
		phoneNumber p = new phoneNumber();
		Scanner sc = new Scanner(System.in);

		String phone_number = sc.nextLine();
		System.out.println(p.solution(phone_number));
		sc.close();
	}

}
