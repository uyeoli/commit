package book_mgm_stru;
import java.util.Scanner;
public class BookMgmSystemArray2 {
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
int[] number = new int[size];
String[] bookInf = {"도서명", "저자", "	isbn"};
int slength = bookInf.length;
String[][] bookList = new String[size][slength];
int[] price = new int[size];
int cnt = 0;

while(flag) {
	System.out.print("메뉴 선택 : ");
	int menu = sc.nextInt();

	switch(menu) {
		case 1 :
			if(cnt < size) {
				for(int i = cnt; i < size; i++) {
					boolean check = true;
					while(check) {
						System.out.print("도서명>");
						String uname = sc.next();
						boolean check2 = false;
						for(int j = 0; j < bookList.length; j ++) {
							if(uname.equals(bookList[j][0])) {
								j = bookList.length;
								check2 = true;
							} else {
								check2 = false;
							}
						}
						if(check2) {
							System.out.println("--중복된 도서명 입니다.--");
						} else {
							System.out.println("--등록 가능한 도서 입니다.--");
							bookList[i][0] = uname;
							check = false;
						}
					}
					for(int k = 1; k < slength; k++) {
						System.out.print(bookInf[k] + ">"); // 저자> -> isbn
						bookList[i][k] = sc.next(); // 저자입력
					}
					System.out.print("가격>");
					price[i] = sc.nextInt();

					System.out.println("---등록완료---");
					cnt++;
					number[i] = cnt;

					System.out.println("입력을 계속 하시겠습니까?(y/n)");
					String con = sc.next();
					if(con.equals("n")) {
						i = size;
						}else if(cnt == size){
							System.out.println("저장공간이 부족합니다.");
						}
					}
			} else {
				System.out.println("저장공간이 부족합니다.");
			}
			break;
		case 2 :
			if(cnt > 0) {
				System.out.println("----------------------------------------------");
				System.out.println("번호\t도서명\t저자\tISBN\t가격");
				System.out.println("----------------------------------------------");
				for(int i = 0; i < cnt; i++) {
					System.out.print(number[i] + "\t");
					for(int j = 0; j < slength; j++) {
						System.out.print(bookList[i][j] + "\t");
					}
					System.out.print(price[i]);
					System.out.println();
				}
				System.out.println("----------------------------------------------");
				System.out.println("총 " + cnt + "권" + "\n");
			} else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
			break;
		case 3 :
			if(cnt > 0) {
				System.out.print("검색할 도서명>");
				String searchBook = sc.next();
				int search_idx = -1;
				for(int i = 0; i < size; i++) {
					if(searchBook.equals(bookList[i][0])) {
						search_idx = i;
					}
				}

				if(search_idx != -1) {
					System.out.println("----------------------------------------------");
					System.out.println("번호\t도서명\t저자\tISBN\t가격");
					System.out.println("----------------------------------------------");
					System.out.print(number[search_idx] + "\t");
						for(int j = 0; j < slength; j++) {
							System.out.print(bookList[search_idx][j] + "\t");
						}
						System.out.print(price[search_idx]);
						System.out.println();
				} else {
					System.out.println("데이터가 존재하지 않습니다.");
				}
			}else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
			break;
		case 4 :
			if(cnt > 0) {
				System.out.print("수정할 도서명>");
				String updateBook = sc.next();
				int update_idx = -1;
				for(int i = 0; i < size; i++) {
					if(updateBook.equals(bookList[i][0])) {
						update_idx = i;
					}
				}
				if(update_idx != -1) {
					for(int i = 0; i < slength; i ++) {
						System.out.print(bookInf[i] +"수정>");
						bookList[update_idx][i] = sc.next();
					}
					System.out.print("가격 수정>");
					price[update_idx] = sc.nextInt();
					System.out.println("수정이 완료되었습니다.");
				} else {
					System.out.println("데이터가 존재하지 않습니다.");
				}

			} else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
			break;
		case 5 :
			if(cnt > 0) {
				System.out.print("삭제할 도서명>");
				String deleteBook = sc.next();
				int remove_idx = -1;

				for(int i = 0; i < bookList.length; i++) {
					if(deleteBook.equals(bookList[i][0])) {
						remove_idx = i;
					}
				}

				if(remove_idx != -1) {
					System.out.println("----------------------------------------------");
					System.out.println("번호\t도서명\t저자\tISBN\t가격");
					System.out.println("----------------------------------------------");
					System.out.print(number[remove_idx] + "\t");
						for(int j = 0; j < slength; j++) {
							System.out.print(bookList[remove_idx][j] + "\t");
						}
						System.out.print(price[remove_idx]);
						System.out.println();

					System.out.println("해당 데이터를 삭제하시겠습니까?(y/n)");
					String con = sc.next();

					if(con.equals("y")) {

						for(int i = remove_idx; i < size-1; i++) {
							bookList[remove_idx][i] = bookList[remove_idx][i+1];
							price[i] = price[i+1];
						}
						System.out.println("데이터가 삭제되었습니다.");
						cnt--;
						price[size-1] = 0;
						bookList[size-1] = new String[slength+2]; // 새로운 객체 생성
					} else {
						System.out.println("삭제를 취소하였습니다.");
					}
				}
			} else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
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