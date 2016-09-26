import java.util.*;

	class A04{
		int kor;
		int eng;
		int math;
			public static void main(String[] s){
				new A04().gradecal();}
		
		void gradecal(){
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요");
		kor = s.nextInt();
		System.out.print("영어점수를 입력하세요");
		eng = s.nextInt();
		System.out.print("수학점수를 입력하세요");
		math = s.nextInt();
		int total = kor+eng+math;
		System.out.println("입력하신 점수의 총점은"+total);
		double avg = (double)total/3;
		System.out.println("평균은"+avg);
		exellent();
		}
		void exellent(){
			if (kor > 90)
			System.out.println("국어점수가 우수합니다.");
			if (eng > 90)
			System.out.println("영어점수가 우수합니다.");
			if (math > 90)
			System.out.println("수학점수가 우수합니다.");
			}
			}






