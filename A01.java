import java.util.*;

class A01 {
	public static void main(String[] s){
	new A01().born();
	}

	void born()
	{
	Scanner s = new Scanner(System.in);
	System.out.print(" 태어난 년도를 입력하시오.:");
	int year = s.nextInt();
	this.age = 2016 - year +1;
	adult();
	}
	void adult()
	{
	if(this.age <20)
	System.out.print("미성년자입니다.");
	else
	System.out.print("미성년자가 아닙니다.");
	}
}

