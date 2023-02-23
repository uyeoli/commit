package score_project;
import java.util.Scanner;

public class ScoreMngProjectArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		boolean sizeFlag = true;
		int size = 0;
		int cnt = 0;
		System.out.println("============================");
		System.out.println("\t성적 관리 시스템");
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

		String[] nameList = new String[size]; // 학생명
		int[] korList = new int[size]; // 국어
		int[] engList = new int[size]; // 국어
		int[] mathList = new int[size]; // 국어
		double[] totList = new double[size]; // 국어
		double[] avgList = new double[size]; // 국어


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
							}

							System.out.print("국어>");
							korList[i] = sc.nextInt();
							System.out.print("영어>");
							engList[i] = sc.nextInt();
							System.out.print("수학>");
							mathList[i] = sc.nextInt();
							totList[i] = korList[i] + engList[i] + mathList[i];
							avgList[i] = totList[i] / 3.0;
							System.out.println();
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
								System.out.print(korList[i] + "\t");
								System.out.print(engList[i] + "\t");
								System.out.print(mathList[i] + "\t");
								System.out.print(totList[i] + "\t");
								System.out.print(avgList[i] + "\t");
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
						int search_idx = -1;
							for(int i = 0; i < cnt; i++) {
								if(student.equals(nameList[i])) {
									search_idx = i;
								}
							}
							if(search_idx != -1) {
								System.out.println("------------------------------------------------------------------");
								System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
								System.out.println("------------------------------------------------------------------");
								System.out.print(nameList[search_idx] + "\t");
								System.out.print(korList[search_idx] + "\t");
								System.out.print(engList[search_idx] + "\t");
								System.out.print(mathList[search_idx] + "\t");
								System.out.print(totList[search_idx] + "\t");
								System.out.print(avgList[search_idx] + "\t");
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
						int update_inx = -1;
						for(int i = 0; i < cnt; i++) {
							if(reviseName.equals(nameList[i])) {
								update_inx = i;
							}
						}
						if(update_inx != -1) {
						System.out.print("국어 점수 수정>");
						int reviseKor = sc.nextInt();
						System.out.print("영어 점수 수정>");
						int reviseEng = sc.nextInt();
						System.out.print("수학 점수 수정>");
						int reviseMath = sc.nextInt();

						korList[update_inx] = reviseKor;
						engList[update_inx] = reviseEng;
						mathList[update_inx] = reviseMath;
						totList[update_inx] = korList[update_inx] + engList[update_inx] + mathList[update_inx];
						avgList[update_inx] = totList[update_inx] / 3.0;
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
							System.out.print(korList[delete_idx] + "\t");
							System.out.print(engList[delete_idx] + "\t");
							System.out.print(mathList[delete_idx] + "\t");
							System.out.print(totList[delete_idx] + "\t");
							System.out.print(avgList[delete_idx] + "\t");
							System.out.println();

							System.out.println("해당 데이터를 삭제하시겠습니까?(y/n)");
							String delete = sc.next();
							if(delete.equals("y")) {

								for(int i = delete_idx; i < size-1; i++) {
									nameList[i] = nameList[i+1];
									korList[i] = korList[i+1];
									engList[i] = engList[i+1];
									mathList[i] = mathList[i+1];
									totList[i] = totList[i+1];
									avgList[i] = avgList[i+1];
								}
								cnt--;
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
	} // class