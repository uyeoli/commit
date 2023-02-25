package book;
import java.util.Scanner;
class operands {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c,d,e,f,g;
	
	void addition() {
		c = a + b;
	}
	
	void subtraction() {
		d = a - b;
	}
	
	void multiplication() {
		e = a * b;
	}
	
	void division() {
		f = a / b;
	}
	
	void division_rest() {
		g = a % b;
	}
}
public class Book10869_객체 {

	public static void main(String[] args) {
		operands op = new operands();
		op.addition();
		op.subtraction();
		op.multiplication();
		op.division();
		op.division_rest();
		System.out.println(op.c);
		System.out.println(op.d);
		System.out.println(op.e);
		System.out.println(op.f);
		System.out.println(op.g);
		
	}

}
