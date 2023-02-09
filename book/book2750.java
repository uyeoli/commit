package book;
import java.util.Scanner;
import java.util.Arrays;
public class book2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // arr의 값을 오름차순으로 정렬
		for(int i : arr) { // 변수 i에 arr값을 저장
			System.out.println(i);
		}
	}

}
