import java.util.*;

class A06 {
	double avg=0.0;
	public static void main(String[] s){
		new A06().grade();
		}

	void grade(){
		Scanner s = new Scanner(System.in);
		   System.out.println("===============");
		   System.out.print("이름 :");
		   String name = s.next();
		   System.out.print(" 국어점수 입력 :");
		   int kor = s.nextInt();
		   System.out.print("수학점수 입력 :");
		   int math = s.nextInt();
		   System.out.print("영어점수 입력 :");
		   int eng = s.nextInt();
		   System.out.println("===========");
		   System.out.println("이름은 :"+name);
		   this.avg = (kor+math+eng)/3;
		   System.out.println("평균은"+avg+"이고");
		   abcd();
		   }
	void abcd(){
		if (this.avg >= 95.0)
		System.out.print("학점은 A+입니다.");
		else if(this.avg >= 90.0)
		System.out.print("학점은 A0입니다.");
		else if(this.avg >= 85.0)
		System.out.print("학점은 B+입니다.");
		else if(this.avg >= 80.0)
		System.out.print("학점은 B0입니다.");
		else if(this.avg < 80.0)
		System.out.print("당신의 학점은 C+입니다.");
		}
		}

