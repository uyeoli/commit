package book;
import java.util.Scanner;
public class book9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			String a = sc.next(); // abc
			int num = a.length(); // 3
			String st = String.valueOf(a.charAt(0)); // a, b, c -> a
			String st2 = String.valueOf(a.charAt(num-1)); // a, b, c -> c
			System.out.println(st + st2);
		}
	}

}
