package book;

import java.util.Scanner;
public class book1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			boolean isPrime = true;
			
			int num = sc.nextInt();
			if(num == 1) {
				continue;
			}
			// 1일경우 continue이므로 2부터 시작
			// Math.sqrt(num) -> num의 제곱근
			for(int j = 2; j <=Math.sqrt(num); j++) { // 2부터시작
				if(num % j == 0) {
					isPrime = false; // 소수가 아니므로 false로 바꿔줌
					break;
				}
			}
			if(isPrime) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}