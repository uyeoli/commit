package book;
import java.util.Scanner;
public class Book2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = 10000;
		for(int i = M; i <= N; i++) {
			boolean isPrime = true;
			if(i == 1) {
				continue;
			}
			for(int j = 2; j <=Math.sqrt(i); j++) { 
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				sum += i;
				if(min > i) {
					min = i;
				}
			}
		}
		if(min == 10000) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
