import java.util.*;

	class A02
	{
	double input_degree;
	String kind;
	double output_degree;
		public static void main(String[] args){
		new A02().temperate();
		}
		void temperate(){
			Scanner s = new Scanner(System.in);
			System.out.print("온도를 입력하세요");
			input_degree = s.nextDouble();
			System.out.print("입력하신 온도가 섭씨면 C를,							화씨온도면 F를 입력하세요");
			kind = s.next();
			temp();
		}
		
		void temp(){
			if(kind.equals("C") ){
			output_degree = input_degree*1.8+32;
			System.out.print("변환된 온도는"+output_degree);}
			if(kind.equals("F")){ 
			output_degree = (input_degree-32)/1.8;
				System.out.print("변환된 온도는"+output_degree);}
				}                      	
		}
