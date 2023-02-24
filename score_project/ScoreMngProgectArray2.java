package score_project;

import java.util.Scanner;

public class ScoreMngProgectArray2 {

	public static void main(String[] args) {

		/** 2차원 배열을 활용한 성적관리 시스템 */

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		boolean sizeFlag = true;
		int size = 0;
		int cnt = 0;
		System.out.println("============================");
		System.out.println("\\t성적 관리 시스템");
		System.out.println(" 1. 성적 등록");
		System.out.println(" 2. 성적 조회");
		System.out.println(" 3. 성적 검색");
		System.out.println(" 4. 성적 수정");
		System.out.println(" 5. 성적 삭제");
		System.out.println(" 0. 프로그램 종료");
		System.out.println("============================");

		while(sizeFlag) {
			System.out.print("학생 수 입력>");
			size = sc.nextInt();
			if(size > 0) {
					sizeFlag = false;
				} else {
					System.out.println("학생 수는 1명이상 입력해주세요.");
				}
			}
		String[] subjectList = {"국어", "영어", "수학"};
		String[] nameList = new String[size]; // 학생명
		int slength = subjectList.length;
		int[][] scoreList = new int[size][slength + 2];

		while(flag) {
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					if(cnt < size) {
						for(int i = cnt; i < nameList.length; i++) {
							boolean check = true;
							while(check) {
								System.out.print("학생명>");
								String uname = sc.next();
								boolean nameCheckResult = false;

									for(int j = 0; j < nameList.length; j++) {
										if(uname.equals(nameList[j])) {
											nameCheckResult = true;
											j = nameList.length;
										} else {
											nameCheckResult = false;
										}
									}
									if(nameCheckResult) {
										System.out.println("--학생명 중복--");
									} else {
										System.out.println("--사용 가능--");
										nameList[i] = uname;
										check = false;
									}
									for(int j = 0; j < subjectList.length; j++) { // 입력받은 학생의 점수
										System.out.print(subjectList[j] +"점수>");
										scoreList[i][j] = sc.nextInt();
										scoreList[i][slength] += scoreList[i][j];//총점
										scoreList[i][slength+1] = scoreList[i][slength]/3;
									}
							}
							cnt++;
							System.out.println("계속 입력할까요?(y/n)");
							String regCon = sc.next();
							if(regCon.equals("n")) {
								i = nameList.length;
							}else {
								if(cnt == size) {
									System.out.println("저장공간이 부족합니다.");
								}
							}
						}
					} else {
						System.out.println("저장공간이 부족합니다.");
					}
					break;
				case 2 :
					if(cnt > 0) {
						System.out.println("------------------------------------------------------------------");
						System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
						System.out.println("------------------------------------------------------------------");
						for(int i = 0; i < cnt; i++) {
							System.out.print(nameList[i] + "\t");
							for(int j = 0; j < scoreList[i].length; j++) {
								System.out.print(scoreList[i][j] + "\t");
							}
							System.out.println();
						}
						System.out.println("------------------------------------------------------------------");
					} else {
						System.out.println("데이터가 존재하지 않습니다.");
					}
					break;
				case 3 :
					if(cnt > 0) {
						System.out.println("검색할 학생명>");
						String student = sc.next();
						int search_idx = -1; //
							for(int i = 0; i < cnt; i++) {
								if(student.equals(nameList[i])) { //hong -> nameList[2]
									search_idx = i;
								}
							}
							if(search_idx != -1) {
								System.out.println("------------------------------------------------------------------");
								System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
								System.out.println("------------------------------------------------------------------");
								System.out.print(nameList[search_idx] + "\t");
								for(int i = 0; i < slength+2; i++) {
									System.out.print(scoreList[search_idx][i] + "\t");
								}
								System.out.println();

							}else {
								System.out.println("데이터가 존재하지 않습니다.");
							}
					} else {
						System.out.println("데이터가 존재하지 않습니다.");
					}
					break;
				case 4 :
					if(cnt > 0) {
						System.out.print("수정할 학생명>");
						String reviseName = sc.next();
						int update_idx = -1;
						for(int i = 0; i < cnt; i++) {
							if(reviseName.equals(nameList[i])) {
								update_idx = i;
							}
						}
						if(update_idx != -1) {
							scoreList[update_idx][slength] = 0; // 평균값 0으로 초기화

							for(int i = 0; i < slength; i ++) {
								System.out.print(subjectList[i] +"점수 수정>");
								scoreList[update_idx][i] = sc.nextInt();
								scoreList[update_idx][slength] += scoreList[update_idx][i];
							}
							scoreList[update_idx][slength+1] = scoreList[update_idx][slength]/3;

							System.out.println("수정이 완료되었습니다.");
						} else {
							System.out.println("데이터가 존재하지 않습니다.");
						}
					}else {
						System.out.println("데이터가 존재하지 않습니다.");
					}
					break;
				case 5 :
					if(cnt > 0) {
						System.out.print("삭제할 학생명>");
						String reviseName = sc.next();
						int delete_idx = -1;
						for(int i = 0; i < cnt; i++) {
							if(reviseName.equals(nameList[i])) {
								delete_idx = i;
							}
						}
						if(delete_idx != -1) {
							System.out.println("------------------------------------------------------------------");
							System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
							System.out.println("------------------------------------------------------------------");
							System.out.print(nameList[delete_idx] + "\t");
							for(int i = 0; i < slength+2; i++) {
								System.out.print(scoreList[delete_idx][i] + "\t");
							}
							System.out.println();
							System.out.println("해당 데이터를 삭제하시겠습니까?(y/n)");
							String delete = sc.next();
							if(delete.equals("y")) {
								for(int i = delete_idx; i < size-1; i++) {  //size = 3, delete_idx = 0
									nameList[i] = nameList[i+1]; // [0],[1] <- [1],[2]
										scoreList[i] = scoreList[i+1]; //[0][0] < [1][1]
								}
								cnt--;
								nameList[size-1] = "";
								scoreList[size-1] = new int[slength+2]; // 새로운 객체 생성

								System.out.println("데이터를 삭제하였습니다.");
							} else {
								System.out.println("삭제를 취소하겠습니다.");
							}
						} else {
							System.out.println("데이터가 존재하지 않습니다.");
						}
					}else {
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
		System.out.println("--프로그램 종료--");
	} // main
}