//[1]:다형성(다양한 형태 또는 특성을 가진다는 의미)
//객체지향 언어에서의 의미는 super 클래스를 상속받은 sub 클래스의 인스턴스가 super의 객체로도 사용되고
//뿐만아니라 sub 클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.

//[2]:예시
//super클래스 bird가 있고, 이를 상속받은 sub클래스 parrot이 있다고 가정하면,
//이때 '앵무새가 말을 하네' 라고 말할 수 있고 '새가 말을 하네' 라고 할 수도 있는 의미

//[3]:sub 클래스의 인스턴스(객체)는 보다 위인 super 클래스의 인스턴스(객체)로도 사용될 수 있다.
//다만! 반대로는 못한다

abstract class Car{
	abstract void run();	
}
class Ambulance extends Car{
	void run(){System.out.println("구급차 지나가요 삐뽀삐뽀");}
}
class Cultivator extends Car{
	void run(){System.out.println("경운기 지나가요 덜컹덜컹");}
}
class sportsCar extends Car{
	void run(){System.out.println("스포츠카 지나가요 쌩");}
}

class Person{
	String str1 = " is super class String";
	void method1(){System.out.println("method1() in Super class");}
	void ppp(){System.out.println("ppp");}
	
}

class Student extends Person{
	String str2 = " is sub class String";
	void method1(){System.out.println("method1() in Sub class");}
	void sss(){System.out.println("sss");}
	void x(){
		System.out.print("method1()→");
		method1();
		System.out.print("super.method1()→");
		super.method1();
	}
	
}



public class Java100_oop_Polymorphism{
	public static void main(String[] args){		
		//super obj = new super();	O
		//super obj = new sub();		O
		//sub obj = new super();		X
		//sub obj = new sub();		O
		
		
		System.out.println("--------------Student s1 = new Student();---------------");
		Student s1 = new Student();	//정상
		System.out.println("s1.str1" + s1.str1);
		System.out.println("s1.str2" + s1.str2);
		System.out.print("s1.method1()→");	
		s1.method1();	//오버라이딩
		System.out.print("s1.sss()→");
		s1.sss();
		System.out.print("s1.ppp()→");
		s1.ppp();
		//[!]:sub 클래스에서 오버라이딩된 super 클래스의 원본 메서드를 호출하고 싶다면 -> super 사용
		System.out.println("s1.x()→");
		s1.x();
		
		
		System.out.println("\n--------------Person s2 = new Student();---------------");
		Person s2 = new Student();	//정상	--> 다형성(super 타입으로 생성)
		System.out.println("s2.str1" + s2.str1);
		System.out.print("s2.ppp()→");
		s2.ppp();
		//System.out.println(s2.str2);	Err --> sub 클래스의 자원은 사용할 수 없다
		//s2.sss();								Err --> sub 클래스의 자원은 사용할 수 없다
		System.out.print("s2.method1()→");	//오버리이딩한거는 sub 클래스의 메서드로 실행
		s2.method1();
		//[!]:sub클래스의 메서드를 바로 호출하고 싶다면? → 캐스트 필요
		System.out.println("-------------------------------[캐스트 사용]");
		((Student) s2).sss();
		System.out.println("-------------------------------[캐스트 사용]");
		
		
		
		//Student s3 = new Person();	//Err 불가능
		
		
		Person s4 = new Person();	//super 클래스의 자원들만 사용 가능
		
		
		System.out.println("\n------------추상클래스 + 상속성------------");
		Car[] cars = new Car[3];	//객체 배열 선언만 함
		cars = new Car[] {new Ambulance(), new Cultivator(), new sportsCar()};	//초기화(선언과 함께 한 라인으로 적어도 괜찮음)
				
		for(Car obj : cars){
			//System.out.print(obj + "\t");
			obj.run();
		}
		
		//[!]:매개변수의 다형성
		//System.out.println() 메서드의 경우 어떠한 타입, 객체를 매개변수로 받더라도 에러없이 출력 가능
		//실제 메서드의 API를 보면 -> public void println(Object x)로 되어있기 때문에 어떠한 타입이 전달되더라도 에러 없이 출력 가능
		//결론적으로, Object는 가상 최상위 조상이므로 어떤 객체를 보내도 그 상위 타입이 된다
		System.out.println("\n------------매개변수의 다형성------------");
		System.out.println(new Person());
		System.out.println(new Student());
		
	}
}