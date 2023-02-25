package book;
import java.util.Scanner;
class plus {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c;
	
	void c() {
		c = a + b;
	}
}
public class Book1000_객체 {

	public static void main(String[] args) {
		plus ab = new plus();
		ab.c();
		System.out.println(ab.c);
	}

}
