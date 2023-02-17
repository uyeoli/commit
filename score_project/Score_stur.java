package score_project;
import java.util.Scanner;

class Name{
	public String name;
	
	public void setName(String name) { // 이름을 입력받음
		this.name = name;
	}
	public String getName() { 
		return name; // 받은 이름을 name에 넣어줌
	}
}

class Score {
	public int kor, eng, math;
		
	public void setKor(int kor) { // 국어점수를 입력받음
		this.kor = kor;
	}
	public int getKor() {
		return kor; // // 국어점수를 kor에 넣어줌
	}
	
    public void setEng(int eng) {//영어점수
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
	
}

class Student {
	Name name;
	Score score;
	
	public Student() {
		name = new Name();
		score = new Score();
	}
	
	public int getSum() {
		return score.getKor() + score.getEng() + score.getMath();
	}
	
	public double getAvg() {
		return getSum() / 3;
	}
	
	public String toString() {
		return "이름: " + name.getName() + "국어: " + score.getKor() + "영어: " + score.getEng()
				+ "수학: " + score.getMath() + "총점: " + this.getSum() + "평균: " + this.getAvg();
	}
}

public class Score_stur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[50];
		int i =0;
		int j;
		int menu = 0;
		while(menu != 6) {
		System.out.println("1.등록 2.조회 3.검색 4.수정 5.삭제 6.종료");
		menu = sc.nextInt();
		switch(menu) {
		case 1:
			st[i] = new Student();
			System.out.println("이름 입력 : ");
			st[i].name.setName(sc.next());
			System.out.println("국어점수 입력 : ");
			st[i].score.setKor(sc.nextInt());
			System.out.println("영어점수 입력 : ");
			st[i].score.setEng(sc.nextInt());
			System.out.println("수학점수 입력 : ");
			st[i].score.setKor(sc.nextInt());
			i++; // st[]의 인덱스0에 한명의 정보를 등록 후 다음인덱스에 저장공간을 만든다.
			break;
		case 2:
			Student temp = new Student();
			for(int a = 0; a < st.length; a++) {
				if(st[a] == null) {
					break;
				}
				for(int k = 0; k < a; k ++) {
					System.out.println(st[k].toString());
				}
				break;
				}
 			}
		}
	}

}
