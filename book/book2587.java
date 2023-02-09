package book;
import java.util.Scanner;
import java.util.Arrays;
public class book2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i ++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(sum / 5);
		Arrays.sort(arr);
		
		System.out.println(arr[2]);
	}

}
