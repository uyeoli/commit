package book;

import java.util.Scanner;

public class book5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a != 0 && b != 0) {
				if(a > b) {
					if(b * (a/b) == a) { // a = 17, b = 5
						System.out.println("multiple");
					} else {
						System.out.println("neither");
					}
				} else {
					if(a * (b/a) == b) {
						System.out.println("factor");
					} else {
						System.out.println("neither");
					}
				}
			} else {
				check = false;
			}
		}
	}
}
