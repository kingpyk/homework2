import java.util.*;
	class A03 {
	int m_count = 0;
		public static void main(String[] s){
			new A03().daycalculate();
			}
		void daycalculate()
		{
			Scanner s = new Scanner(System.in);
			System.out.print("일 수를 입력하시오");
			int days = s.nextInt();
			int seconds = days*24*60*60;
			this.m_count = seconds/1000000;
			System.out.println("일수에 해당되는 기간은 모두"+seconds+"초입니다.");
			mil();
			}
			void mil(){
				if(this.m_count > 0)
				System.out.print("100만 초가 모두"+m_count+"번이나 포함됩니다.");
				}
			}

