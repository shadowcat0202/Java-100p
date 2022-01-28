//[!]:인터페이스란 무엇인가?
//사전적 의미 --> 결합부, 접속기 --> 사용자간 또는 컴퓨터 통신이 가능하도록 해주는 디바이스나 프로그램
//큰 틀에서 본다면 자바에서의 인터페이스 개념도 사전적 의미와 비슷하다.
//상호 통신에서는 '규격'이 중요하다 '규격'을 인터페이스라 할 수 있고, 인터페이스는 하나의 '표준화'를 제공하는 것이라고 할 수 있다.
//일종의 '설계도' 개념도

//abstract VS Interface?
//거의 비슷하다. -->> 그러나 그 추상화 정도가 더 높다.(더 엄격하다) -->따라서, 일반 메서드 멤버 필드(변수)를 가질 수 없다.
//이러한 점들이 추상과 인터페이스간 가장 큰 차이점 중 하나이다.


//Java에서의 인터페이스 문법?
//표준화 및 규격을 인터페이스로 제공
//따라서 어떤 클래스가 해당 인터페이스를 사용(상속)한다면 인터페이스에 선언되어 있는 메서드를 오버라이딩 해야한다.
//인터페이스는 class 키워드를 사용하지 않고 -->> 별도의 interface 키워드를 사용한다
//class --> extends		interface --> implements


//상속 VS 구현
//클래스와 인터페이스간의 가장 큰 차이점 중 하나는 '상속' 이다. --> 클래스(단일 상속), 인터페이스(다중상속 가능)
//인터페이스에서는 상속이라는 표현을 쓰지 않고 '구현'의 의미를 강조하는 implements 카워드를 사용하여 다중 상속을 구현한다.


//우선순위 (extends VS implements)
//extends키워드와 implements 키워드가 동시에 쓰일때 --> extends키워드를 항상 먼저 쓰인다.
//ex) class Student extends Person implements A, B

//Person 클래스 (super)
class Person{
	String  name;
	int age;
	int weight;
	
	Person(){}
	Person(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void wash(){System.out.println("씻다");}
	void study(){System.out.println("공부하다");}
	void play(){System.out.println("놀다");}
	
}
//A 인터페이스(super)
interface Allowance{
	//Filed
	//인터페이스에는 상수만 가능 public static final, 변수는 불가능
	//인터페이스 내 모든 멤버 필드(변수)는 반드시!!! public static final 이여야 함--> 생략 가능 ㅋㅋ
	
	public static final int aaa = 100;
	/*public static final*/ String title = "입출금 내역";	
	
	//Abstract Method
	//일반 메서드는 사용할수 없기 때문에 추상 메서드를 사용해야한다.
	//인터페이스 내 모든 메서드는 반드시!!! public abstract 이여야함 -->>생략 가능 ㅋㅋ
	public abstract void in(int price, String name);	//일반적으로 abstract 를 적어주는게 추상 메서드와 일반 메서드를 구분하기 편하기 때문에 적는걸 추천
	void out(int price, String name);
}
//B 인터페이스(super)
interface Train{
	//Abstract Method
	abstract void train(int training_pay, String name);
}

//Student 클래스(sub)
class Student extends Person implements Allowance, Train{
	Student(){}
	Student(String name, int age, int weight){
		super(name, age, weight);	
	}
	
	public void in(int price, String name){System.out.printf("+%,d\t[%s 용돈]\n", price, name);}
	public void out(int price, String name){System.out.printf("-%,d\t[%s]\n", price, name);}
	public void train(int training_pay, String name){System.out.printf("+%,d\t[%s 입금]\n", training_pay, name);}
}
//main클래스
public class Java100_oop_Interface{
	public static void main(String[] args){
		//[1]:객체생성
		Student s1 = new Student("홍길동", 22, 70);
		
		//Person에서 extends해서 받은 메서드
		s1.wash();
		s1.study();
		s1.play();
		//interface에서 implements해서 오버라이딩한 메서드
		s1.in(1000, "엄마");
		s1.out(500, "편의점");
		s1.train(50000, "아빠");
		
		//[3]:인터페이스 내의 상수 필드 사용하기
		//static 으로 정의되었기 때문에 객체 생성 없이 호출 가능
		System.out.println(Allowance.title);
		System.out.println(Allowance.aaa);
		
	}
}