package book;
import java.util.Scanner;
public class book8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()]; // 테스트케이스 문자열
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt ++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}

}
