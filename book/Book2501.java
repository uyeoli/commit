package book;
import java.util.Arrays;
import java.util.Scanner;
public class Book2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N+1];
		int cnt = 1;
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				arr[i] = i;
			}
		}
		Arrays.sort(arr);
		
		for(int i = 1; i <= N; i++) {
			if(arr[i] == 0) {
				cnt++;
			}
		}
		try {
			System.out.println(arr[cnt + K - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(0);
		}

	}
}
