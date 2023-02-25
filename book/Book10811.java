package book;
import java.util.Scanner;
public class Book10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a = 0;
		int b = 0;
		int temp = 0;
		int[] bag = new int[N+1]; // 0번부터 5번까지
		for(int i = 1; i <= N; i ++) {
			bag[i] = i; // bag[1] = 1 ... bag[N] = N
		}
		for(int i=0; i < M; i++) { // M=4면 4번 반복해서 a,b입력 받음
			a = sc.nextInt();
			b = sc.nextInt();
				while(a < b) {
					temp = bag[a];
					bag[a] = bag[b]; // a=1, b=4면
					bag[b] = temp;
					a++;
					b--;
				}
		}
		for(int i  = 1; i <= N; i++) {
			System.out.print(bag[i] + " ");
		}

	}

}
