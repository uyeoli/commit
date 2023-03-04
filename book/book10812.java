package book;
import java.util.Scanner;
public class book10812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] bag = new int[N+1]; // 11크기
		int[] arr = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			bag[i] = i;
		}
		
		for(int i = 0; i < M; i++) {
			int begin = sc.nextInt();
			int end = sc.nextInt();
			int mid = sc.nextInt();
			for(int j = 0; j < end - mid + 1; j++) { // begin = 1, end = 6, mid = 3
				arr[begin + j] = bag[mid + j];
			}
			for(int j = 0; j < mid - begin; j++) {
				arr[begin+end-mid+1+j] = bag[begin + j];
			}
			for(int j = begin; j <= end; j++) {
				bag[j] = arr[j];
			}


		}
		for(int i = 1; i <= N; i++) {
			System.out.print(bag[i] + " ");
			}
	}
}

