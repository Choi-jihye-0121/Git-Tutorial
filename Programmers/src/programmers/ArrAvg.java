package programmers;

public class ArrAvg {

	public double solution(int[] arr) {
		double answer = 0.0;
		for(int x : arr) {
			answer += x;
		}
		
		return answer/arr.length;
	}
	
	public static void main(String[] args) {
		ArrAvg a = new ArrAvg();
		int[] arr = {1,2,3,4};
		System.out.println("평균값: " + a.solution(arr));

	}

}
