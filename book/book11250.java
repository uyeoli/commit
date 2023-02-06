package book;
import java.util.Scanner;
public class book11250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i< T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int Y;
			int X;
			if(N % H == 0) {
				Y = H * 100;
				X = N / H;
			}
			else {
				Y = (N % H) * 100;
				X = (N / H) + 1;
			}
			
			int XXYY = Y + X;
			System.out.println(XXYY);
		}

	}

}
