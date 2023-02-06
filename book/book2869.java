package book;
import java.util.Scanner;
public class book2869 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
 
		int up = sc.nextInt();		// A
		int down = sc.nextInt();	// B
		int length = sc.nextInt(); 	// C
 
		int day = (length - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}