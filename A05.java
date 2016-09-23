import java.util.*;
	class A05 {
	int age=0;
	public static void main(String[] s){
		new A05().ages();}

	void ages(){
		Scanner s = new Scanner(System.in);
			System.out.print("태어난 년도를 입력하세요");
			int birth_year = s.nextInt();
			this.age = 2012 - birth_year +1;
			age();}
	void age(){
	if(this.age < 7)
	 	System.out.print("유아입니다.");
	else if(this.age <13)
		System.out.print("어린이입입니다.");
	else if(this.age <20)
		System.out.print("청소년입입니다.");
	else if(this.age <30)
		System.out.print("청년입니다.");
	else if(this.age <60)
		System.out.print("중년입니다.");
	else
		System.out.print("노년입니다.");

	}
}
