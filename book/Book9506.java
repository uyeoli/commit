package book;
import java.util.Arrays;
import java.util.Scanner;
public class Book9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			int n = sc.nextInt();
			if(n == -1) {
				flag = false;
			} else {
				int[] arr = new int[n+1];
				int sum = 0;
				int cnt = 0;
				for(int i = 1; i <= n; i ++) {
					if(n%i == 0) {
						cnt++;
						sum += i;
						arr[i] = i;
					}
				}
				if((sum - n) == n) {
					System.out.print(arr[n] + " = " + arr[1]);
					for(int i = 2; i < n; i++) {
						if(arr[i] != 0) {
							System.out.print(" + " + arr[i]);
						}
					}
					System.out.println();
				} else {
					System.out.print(n + " is NOT perfect.");
					System.out.println();
				}
			}
		}
	}
}