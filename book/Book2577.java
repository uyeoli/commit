package book;
import java.util.Scanner;

public class Book2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int cnt = 0;
		int operation = A * B * C;
		String str = String.valueOf(operation);
		for(int i = 0; i < 10; i++) {
			cnt = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) - '0' == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}