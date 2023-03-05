package book;
import java.util.Scanner;
public class book10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 0;
			for(int j = 0; j < str.length()/2; j++) {
				if(str.charAt(j) == str.charAt(str.length()-1-j)) {
					cnt++;
				}
			}
		if(cnt == str.length()/2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
