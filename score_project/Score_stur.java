package score_project;
import java.util.Scanner;

//
class Name{
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
class Score{
	int kor,eng,math;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	
	public int sum() {
		return this.kor + this.eng + this.math;
	}
	
	public int avg() {
		return this.sum() / 3;
	}
}
	class Student{
		Name name;
		Score score;
		
		public String information() {
			return "1.이름 : " + name.getName() + "국어성적 : " + score.getKor() + "영어성적 : " + score.getEng() + 
					"수학성적 : " + score.getMath() + "총점 : " + score.sum() + "평균 :" + score.avg();
		}
	}
public class Score_stur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================");
		System.out.println("1.등록 2.조회(전체) 3.검색 4.수정 5.삭제 6.종료");
		System.out.println("=======================================");

		int menu = sc.nextInt();
		Student[] student = new Student[3];
		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("프로그램을 종료하겠습니다");
			break;
		}

		
	}

}

