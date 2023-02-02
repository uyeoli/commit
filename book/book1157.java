package book;
import java.util.Scanner;
public class book1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26]; // 영문자 26개
		String a = sc.nextLine();
		
		for (int i = 0; i < a.length(); i++) {
			
			if (65 <= a.charAt(i) && a.charAt(i) <= 90) { // 대문자 범위
				arr[a.charAt(i) - 65]++;
			}
			else {
				arr[a.charAt(i) - 97]++; 
			}
		}
		int max = -1;
		char ch = '?';
		
		for(int i =0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}
