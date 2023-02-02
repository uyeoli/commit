package book;
import java.util.Scanner;
public class book10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = sc.nextLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i); 
			
			if(arr[ch - 97] == -1) {
				arr[ch - 97] = i;
		}
	}
			
		for(int val : arr) {
			System.out.print(val + " ");
			}
		
		}

	}
