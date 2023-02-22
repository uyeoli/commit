package book_mgm_stru;

import java.util.Scanner;
public class BookMgmSystemArray1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("입력할 도서 개수>");
	int size = sc.nextInt();
	System.out.println("============================");
	System.out.println("\t도서 관리 시스템");
	System.out.println(" 1. 도서 등록");
	System.out.println(" 2. 도서 조회");
	System.out.println(" 3. 도서 검색");
	System.out.println(" 4. 도서 수정");
	System.out.println(" 5. 도서 삭제");
	System.out.println(" 0. 프로그램 종료");
	System.out.println("============================");
	boolean flag = true;
	String[] bookName = new String[size];
	String[] author = new String[size];
	int[] price = new int[size];
	String[] isbn = new String[size];
	int cnt = 0;
	
	while(flag) {
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
	
		switch(menu) {
			case 1 :
				for(int i = cnt; i < size; i++) {
				System.out.println("등록");
				System.out.print("도서명>");
				bookName[i] = sc.next();
				System.out.print("저자>");
				author[i] = sc.next();
				System.out.print("가격>");
				price[i] = sc.nextInt();
				System.out.print("ISBN>");
				isbn[i] = sc.next();
				System.out.println("---등록완료---");
				cnt++;
				
				System.out.println("입력을 계속 하시겠습니까?(y/n)");
				String con = sc.next();
				if(con.equals("n")) {
					i = size;
				}
			}
				break;
			case 2 :
				System.out.println("----------------------------------------------");
				System.out.println("번호\t도서명\t저자\t가격\tISBN");
				System.out.println("----------------------------------------------");
				for(int i = 0; i < cnt; i++) {
					System.out.println((i+1) + "\t" + bookName[i] + "\t" + author[i] + "\t" + price[i] +"원\t" + isbn[i]);
				}
				System.out.println("----------------------------------------------");
				System.out.println("총 " + cnt + "권" + "\n");
				break;
			case 3 :
				System.out.println("검색");
				break;
			case 4 :
				System.out.println("수정");
				break;
			case 5 :
				System.out.println("삭제");
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default :
				System.out.println("다른 메뉴를 선택해주세요");
				}
			}
	System.out.println("---프로그램 종료---");
	}
}
