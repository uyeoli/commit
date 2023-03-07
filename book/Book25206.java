package book;
import java.util.Scanner;
public class Book25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double doublesum = 0;
		String[] grade = {"A+", "A0", "B+", "B0", "C+",
						"C0", "D+", "D0", "F", "P"};
		double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		for(int i = 0; i < 20; i++) {
			String name = sc.next();
			double num = sc.nextDouble();
			String st = sc.next();
			for(int j = 0; j < 10; j++) {
				if(st.equals(grade[j])) {
					sum += num * score[j];
					if(j != 9) {
						doublesum += num;
					}
				}
			}
		}
		System.out.println(sum / doublesum);
	}

}
