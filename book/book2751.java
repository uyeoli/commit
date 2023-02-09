package book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class book2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list); // 리스트 오름차순정렬
		
		for(int value : list) {
			sb.append(value).append('\n'); // sb에 value값을 붙이고 엔터 붙임
		}
		System.out.println(sb);

   }
}
