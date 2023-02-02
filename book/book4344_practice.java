package book;
import java.util.Scanner;
public class book4344_practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			int N = sc.nextInt(); // 학생 수
			arr = new int[N];
			
			double sum = 0; // 성적 누적 합 변수 선언
			
			// 성적 입력부분
			for(int j = 0; j < N; j++) {
				int score = sc.nextInt(); // 성적 입력
				arr[j] = score;
				sum += score; // 성적 누적 합
			}
			double avg = (sum / N);
			double count = 0; // 평균 넘는 학생 수 변수 선언
			
			for (int j = 0; j < N; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%3f%%\n", (count/N)*100);
		}
	}

}
