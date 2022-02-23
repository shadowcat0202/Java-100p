/*
접근제한자 클래스선언 클래스이름{							
	접근제한자 static 반환타입 메서드이름(문자열 배열 변수명){	
		구현할 코드 작성
	}
}
*/

/*
[1] 접근제한자	--> public, private, protected, default
			-->	클래스나 메서드에 접근할 수 있는 범위를 지정	--> 접근제한자, 접근제어자
			--> private > protected > public

[2]클래스선언 	--> class
			--> 객체를 생성하는 틀, 프레임, 공장, 템픞릿
[3]클래스이름	--> 카멜케이스(단어와 단어 사이의 구문 --> 대문자)
[4]메서드이름	--> 메서드란? 함수 --> 어떤 특정한 동작이나 작업, 행위 등을 수행하는 것
*/

//(1) 하나의 파일에 2개 이상의 class를 작성할 수 있다										○
//(2) 3개의 class가 있다면 자바 파일명이 될 수 있는 것은 public 키워드가 붙은 클래스이다.				○
//(3) 하나의 파일에 있는 3개의 class에 모두 public 키워드를 붙일 수 있다.						×
//(4) 한 파일내 3개 이상의 class에 모두 public 키워드를 안붙일 수 있다.							○
//(5) 한 파일내 3개 이상의 class에 모두 public 키워드가 없다면 class중 어느 것이라도 파일명이 될 수 있다.	○
//(6) 자바 파일에 class가 한개 있다면 클래스명이 곧 파일명이 되어야 한다							○


class Person{
	//[1]:속성(Attribute)
	int gender;
	int power;
	
	//[2]:생성자(Constructor)	-> 객채가 생성될때 자동으로 호출되는 메서드
	Person(){
		this.gender = 1;	//1:남성 2:여성
		this.power = 100; 	//기본 파워
	}
	
	//[3]:메서드(Method)
	void walk(){
		System.out.println("걸어가는 중~");
	}	
}

class Hero extends Person{
	//Field
	String name;
	int age;
	
	//Constructor
	Hero(){}
	Hero(String name, int age){	//생성자 오버로딩(같은 이름을 가졌지만 파라미터가 다른경우) 
		super();	//super 클래스의 생성자를 호출 //명시적으로 적어도, 생략해도 무방하다
		this.name = name;
		this.age = age;
	}
	//Method
	void walk(){	//오버라이딩(재정의):Super class에서 상속받았지만 다른 기능으로 재작성 한다
		System.out.println("2배로 빨리 걸어가는 중~");
	}
	void fly(){
		System.out.println("날아가는 중~");
	}
	void displayPerson(){
		System.out.printf("이름:%s, 나이:%d, 성별:%d, 파워:%d\n",name,age,gender,power);
	}
}

public class class_struct{	//클래스명과 파일명은 동일해야한다
//(1)메인메서드	--> public static void main(String[] args)
//			--> 파일은 실행되면 프로그램의 시작을 알려주는 용도(entry point)로 args를 제외한 나머지 부분이 하나라도 다르면 실행 불가
//(2)파라미터스	--> 메서드 호출시 0개 이상의 파라미터 값을 넣어서 호출 가능
//			--> 인수
//			--> args는 변수명일 뿐 다른 이름으로도 가능
//(3)반환타입		--> return type --> 없으면 void 특정 동작만 하는 메서드


	public static void main(String[] args){	//String은 앞에 대문자		
		//-static으로 선언된 메서드나 변수는 JVM에서 인스턴스 객체 생성 없이 호출 가능	-> 객체 생성없이 메서드를 호출해서 사용 가능
		//-자바 프로그램을 Run하면 static으로 지정된 메서드들을 찾아서 먼저 메모리에 할당	-> 할당된 메모리에서 메서드명이 "main"인 메서드를 찾아서 entry point로 실행
		
		System.out.println("Hello World");	//(;)세미콜론은 절대로 잊어버리지 말기, 문자열은 ("")쌍따옴포로 감싸야한다
		
		//[!]:객채생성
		Person p1 = new Person();
		p1.walk();
		//p1.fly();	//Err -> Person 클래스를 생성했기때문에 Hero에 있는 메서드는 사용 불가
		
		//[!]:상속을 통한 객채생성
		Hero h1 = new Hero("슈퍼맨", 20);	//super class에 있는 것들을 먼저 생성(초기화)이 되고 sub class를 다음으로 생성(초기화)한다
		h1.displayPerson();
		h1.walk();
		
		Hero h2 = new Hero("원더우먼", 30);
		h2.displayPerson();
		h2.gender = 2;
		h2.power = 300;
		h2.displayPerson();
	}
}
