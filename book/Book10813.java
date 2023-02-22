package book;
import java.util.Scanner;
public class Book10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		int [] bag = new int[n+1]; // n = 5라면 6크기의 배열 선언
		for(int i=1;i<=n;i++) // bag[1] 부터 넣고 bag[0]은 안넣음
			bag[i]=i; // bag[1] = 1, bag[2] = 2.... bag[n] = n 삽입
		for(int i=0;i<m;i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			int temp=bag[a]; // a가 1이라면 temp에 bag[1]을 넣어둠.
			bag[a]=bag[b]; // a=1, b=2라면 bag[1]에 bag[2]번값을 넣음.
			bag[b]=temp; // b=2니까 bag[2]에 temp(bag[1])값을 넣음.
		}
		for(int i=1;i<=n;i++)
			System.out.print(bag[i]+ " ");
	}

}
