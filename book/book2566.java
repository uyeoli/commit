package book;
import java.util.Scanner;
public class book2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[9][9];
		int max = 0;
		int x = 0;
		int y = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				A[i][j] = sc.nextInt();
				if(max < A[i][j]) {
					max = A[i][j];
							x = i;
							y = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((x + 1) + " " + (y +1));
	}

}
