class FarmMachine{
	int price;
	int year;
	String color;
	
	void move(){
		System.out.println("Farm_machine is mvoe");
	}
	void dig(){
		System.out.println("Farm_machine is digging");
	}
	
	void grind(){
		System.out.println("Farm_machine is grinding");
	}
}


public class Java100_oop_Exam002{
	public static void main(String[] args){
		//[1]:객채 생성
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		
		//[2]:속성값 입력
		fm.price = 1000000;
		fm.year = 2020;
		fm.color = "red";
		
		//[3]:속성값 출력
		System.out.println(String.format("%,d",fm.price));	//1000단위로 ,찍기
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		//[4]:동작(메서드) 수행
		fm.move();
		fm.dig();
		fm.grind();
	}
}