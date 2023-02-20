package coffee_machine_project;
import java.util.Scanner;
public class Coffee_machine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========메뉴=========");
		System.out.println("1.밀크커피(300원)");
		System.out.println("2.아메리카노(400원)");
		System.out.println("3.유자차(300원)");
		System.out.println("4.우유(200원)");
		System.out.println("=====================");
		System.out.println("동전을 넣어주세요.");
		int coin = sc.nextInt();
		int cnt = 0;
		System.out.println("메뉴 >");
		boolean flag = true;
		boolean flag2 = true;
		while(flag) {
			int menu = sc.nextInt();
			if(coin == 100) { //100원짜리 동전을 넣은 경우
				System.out.println("금액이 부족합니다.");
				while(flag2) {
					if(menu == 1) {
						cnt +=100;
						System.out.println("현재 넣은 금액 : " + cnt);
						if(cnt == 300) {
							System.out.println("=====================");
							System.out.println("밀크커피를 제조중 입니다.");
							System.out.println("주문하신 커피 드리겠습니다.");
							flag2 = false;
						}
					} else if(menu == 2) {
						cnt +=100;
						System.out.println("현재 넣은 금액 : " + cnt);
						if(cnt == 400) {
							System.out.println("=====================");
							System.out.println("아메리카노를 제조중 입니다.");
							System.out.println("주문하신 커피 드리겠습니다.");
							flag2 = false;
						}
					} else if(menu == 3) {
						cnt +=100;
						System.out.println("현재 넣은 금액 : " + cnt);
						if(cnt == 300) {
							System.out.println("=====================");
							System.out.println("유자차를 제조중 입니다.");
							System.out.println("주문하신 음료 드리겠습니다.");
							flag2 = false;
						}
					} else if(menu == 4) {
						cnt +=100;
						System.out.println("현재 넣은 금액 : " + cnt);
						if(cnt == 200) {
							System.out.println("=====================");
							System.out.println("우유를 제조중 입니다.");
							System.out.println("주문하신 음료 드리겠습니다.");
							flag2 = false;
						}
					} else {
						System.out.println("없는 메뉴입니다.");
					}
					
				}
			
			}else if(coin == 500) { // 500원짜리 동전을 넣은 경우
				switch(menu) {
				case 1:
					System.out.println("밀크커피를 제조중 입니다.");
					System.out.println("----------------------------------");
					System.out.println("주문하신 커피와 거스름돈 200원 드리겠습니다.");
					break;
				case 2:
					System.out.println("아메리카노를 제조중 입니다.");
					System.out.println("----------------------------------");
					System.out.println("주문하신 커피와 거스름돈 100원 드리겠습니다.");
					break;
				case 3:
					System.out.println("유자차를 제조중 입니다.");
					System.out.println("----------------------------------");
					System.out.println("주문하신 음료와 거스름돈 200원 드리겠습니다.");
					break;
				case 4:
					System.out.println("우유를 제조중 입니다.");
					System.out.println("----------------------------------");
					System.out.println("주문하신 음료와 거스름돈 300원 드리겠습니다.");
					break;
				case 0:
					System.out.println("주문을 종료하겠습니다.");
					System.exit(0);
				default :
					System.out.println("없는 메뉴입니다.");
					System.out.println("다른 메뉴를 선택해주세요.");
					}

			}
		}

	}

}
