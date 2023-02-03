package book;
import java.util.Scanner;
public class book1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int cnt = 0;
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if(ch == ' ') {
				cnt++;
				} 

			}
		if (S.charAt(0) == ' ') {
			cnt--;
		}
		if (S.charAt(S.length() - 1) == ' ') { 
			cnt--;
		}
		System.out.println(cnt + 1);
		}
	}


