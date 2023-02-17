package Day4;

import java.util.Scanner;

class Name {// 이름 클래스 
    private String name;
 
    public void setName(String name) {// ex)김선영을 받는 다. 
        this.name = name;//this.name= 받은  김선영을 넣어 주겠다.
    }
    public String getName() {
        return name;//얻어낸 이름을 돌려 받겠다.
    }
}

class Score {
    private int kor, eng, math;
    
    public void setKor(int kor) {//국어점수
       this.kor = kor;
    }
    public int getKor() {
       return kor;
    }
    
    public void setEng(int eng) {//영어점수
       this.eng = eng;
    }
    public int getEng() {
       return eng;
    }
    
    public void setMath(int math) {//수학점수
       this.math = math;
    }
    public int getMath() {
       return math;
    }
 }

class Student {//Student 생성자 를 찯기위해 Student클래스로 옴 
    // 근데 Name객체를 만남  Name 생성자를 찾으러감 
    Name name ; 
    Score score;
   // String total;
    

     
     public Student () {
          name=new Name();
          score=new Score();
         /* total= new String("이름: "+name.getName()+" 국어: "+score.getKor()+"  영어: "+score.getEng()+
                     " 수학: "+score.getMath()+" 총점: "+this.getSum()+
                     " 평균: "+this.getAvg()+"\n");*/
     }
    
    public int getSum() {// 합산 
       return score.getKor()+score.getEng()+score.getMath();
    }
    
    public double getAvg() {
       return this.getSum() / 3.0;
    }
    @Override
    public String toString() {
        return  "이름: "+name.getName()+" 국어: "+score.getKor()+"  영어: "+score.getEng()+
                 " 수학: "+score.getMath()+" 총점: "+this.getSum()+
                 " 평균: "+this.getAvg();
   }
 }


public class Test {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);//컴퓨터에게  입력 해달라 
        Student[] st = new Student[50];//Student타입의 배열 을 생성  
        String who;//String who를 선언 
        int i=0, j;// int i=0(선언 과 동시에 i에 초기값을 설정), j(j 를 선언 );
        int num=0;//int num=0; 선언과 동시에 초기 값으로  0을 설정
 
        while(num!=6) {//num을 적용한 조건 
            System.out.print("1.입력  2.전체출력  3.검색  4.수정  5.삭제  6.종료 : ");//실행을 하게되면 첫번째로 나오는 것 
            num = sc.nextInt();// num의 값으로 sc.nextInt()을 넣어 줘서  
            switch(num) {//switch에서num을 조건 문으로 넣어준다. 
            case 1:// 입력 해서 저장하는 기능
                st[i] = new Student();//st[i]에 new Student(); 객체를 넣어 준다.
                System.out.print("이름 입력 : ");// 출력  next=입력?
                st[i].name.setName(sc.next());// ex)김선영을 던져 준다.//생성자를 찾으러간다.
                System.out.print("국어점수 입력 : ");//출력
                st[i].score.setKor(sc.nextInt());//ex) 국어 점수 입력 :10을 던져 준다.//생성자를 찾으러간다.
                System.out.print("영어점수 입력 : ");//출력
                st[i].score.setEng(sc.nextInt());//ex) 영어 점수 입력 :20을 던져 준다.//생성자를 찾으러간다.
                System.out.print("수학점수 입력 : ");//출력
                st[i].score.setMath(sc.nextInt());//ex) 수학 점수 입력 :30을 던져 준다.//생성자를 찾으러간다.
                i++;// i를 더해주므로써 인덱스 0공간에  입력한 부분을 저장하고 입력으로 다시  들어오게되면 후증가로 해서[i] 0에서1이됨  ,so 인덱스 1공간이 생긴다. 다른 공간에 입력  
                break;// 탈출하게된다.
 
            case 2:// 전체 출력 하는 기능  다물어 보기
                Student temp = new Student();//Student를 만나서 Student생성자를 찾게 된다. 
 
                for(j=0; j<st.length; j++) {// 배열
                    if(st[j]==null)
                        break;//입력 한것 에서
                }
                // 2번재
                for(int a=0; a<j-1; a++) {// bubble sort  공부
                    for(int b=0; b<j-1; b++) {
                        if(st[b].getSum() < st[b+1].getSum()) {//getSum() 점수 합계
                            temp = st[b];//swap
                            st[b] = st[b+1];
                            st[b+1] = temp;
                        }
                    }
                }
 
                for(int p=0; p<j; p++) {//p= 새로 정의 입력 횟수
                    System.out.println(st[p].toString());//printAll()이 출력문을 반환 해주는 함 수 ;
                }
                break;//탈출하게 된다.
 
            case 3:// 검색 기능 
                System.out.print("검색할 사람의 이름 : ");//출력 
                who = sc.next();// 누구 것을 수정 할지 위에 선언 한 who에 sc.next();를 넣어 준다.  
                for(j=0; j<st.length; j++) {//
                    if(st[j].name.getName().equals(who)) {//equals(who) 문자 열을 비교 할때씀 
                        break;// 탈출하게 된다.
                    }
                }//탈출 해서 내려 옴 
                System.out.println(st[j].toString());// 인덱스에 맞는 정보를 출력 
                break;//탈출하게 된다.
 
            case 4:// 수정 기능 
                System.out.print("수정할 사람의 이름 : ");//출력// 어렵다.
                who = sc.next();// 위에 선언 한 who에 sc.next();를 넣어 준다.  
                for(j=0; j<st.length; j++) {
                    if(st[j].name.getName().equals(who))
                        break;//탈출하게 된다.
                }
                System.out.print("수정할 내용은? 1.국어  2.영어  3.수학 : ");//출력 
                int k = sc.nextInt();//K에sc.nextInt() 숫자 입력 하게 하는 기능 넣어줌 
                //여기서 부터 조건문 
                if(k==1) {//k가 1과 같다면  조건에 만족해서 국어 점수 수정으로 들어오게된다.
                    System.out.print("국어점수 수정 : ");
                    st[j].score.setKor(sc.nextInt());
                }
                else if(k==2) {
                    System.out.print("영어점수 수정 : ");
                    st[j].score.setEng(sc.nextInt());
                }
                else if(k==3) {
                    System.out.print("수학점수 수정 : ");
                    st[j].score.setMath(sc.nextInt());
                }
                else
                    System.out.println("잘못된 입력입니다.");
                break;
            case 5://삭제 
                System.out.print("삭제할 사람의 이름 : ");//
                who = sc.next();
                for(j=0; j<st.length; j++) {
                    if(st[j].name.getName().equals(who)) {
                        break;
                    }
                }
                st[j] = null;//null 로 만든다
                for(int shift=j; shift<st.length-1-j; shift++) {//shift
                    st[shift] = st[shift+1];
                }
                st[st.length-1] = null;
                //i--;
                break;
            case 6:
                System.out.println("종료!!");
                break;
            }
        }
        sc.close();
    }
 
}