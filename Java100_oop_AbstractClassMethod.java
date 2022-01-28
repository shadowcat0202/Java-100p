
abstract class Animal{
	//구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언 --> return 조차도 없이 메서드명만 선언
	abstract void cry();	//이러한 추상메서드를 하나라도 가지고 있다면 추상클래스(abstract class)로 정의가 되어야한다.
	void eat(){System.out.println("먹다");}

}

class Dog extends Animal{
	void cry(){System.out.println("멍멍");}
}

abstract class Cat extends Animal{
	//super 클래스의 추상메서드를 오버라이딩 하지 않고 싶다면 ?
	//해당 sub클래스를 abstract로 정의한다
	//void cry(System.out.println("야옹"));
}

class Animal2{
	void fly(){System.out.println("날다");}
}


public class Java100_oop_AbstractClassMethod{
	public static void main(String[] args){
		
		//[1]:추상 클래스는 구체적인 내용이 없기때문에 객체를 생성할 수 없다
		//Animal dog = new Animal();	// Err
		Animal2 bird = new Animal2();	//에러가 안남
		bird.fly();
		
		
		//★★[2]:추상클래스 사용은? --> 상속(extends)을 받아서 사용
		//즉, 추상(super역할)클래스를 상속받은 sub class에서 해당 메서드를 오버라이딩(재정의)하여 사용한다.
		Dog dog = new Dog();
		//Cat cat = new Cat();		//오버라이딩 되지 않은 sub 클래스도 객체를 만들 수 없다.
		dog.cry();
		
		
		//[3]:Summary
		//추상클래스는 다른 클래스들의 공통적인 특징을 변수나 메서드로 정의만 해놓는 것을 말한다. --> 추상메서드를
		//abstract를 앞에 붙이고 클래스 안에 추상 메서드를 포함하고 있다는 것을 제외하면 사실 일반 클래스와 별반 차이가 없다.
		//Field, Constructor, Method(추상메서드 말고 일만 메서드도 포함할 수 있다.)
		//메서드 선언만 있고 구체적인 내용은 없으므로 객체를 생성할 수 없다.
		//따라서, super 클래스로서의 역할은 하지만, 구체적인 사용은 상속받은 sub 클래스에서 재정의(오버라이딩) 하여 사용해야 한다. --> 강제성
		//추상 클래스에서 선언만 해놓음으로써 이후 새로운 sub 클래스들이 상속받아 구현하므로 새로운 클래스를 작성할때 하나의 틀(Template)이 된다.
		
		
		//왜 쓰는건데???
		//우선 강제하기 위함
		//super 클래스가 선언해놓은 메서드를 상속받은 sub 클래스들이 이름 그대로 재정의해서 구현하라고 강제하는 것이다.
		//상속받은 sub 클래스 입장에서는 자칫 상속만 받고 재정의해서 사용을 안할 수도 있기 때문이다.
		//즉, 일반 메서드로 구현하면 누군가는 해당 메서드를 구현 안 할 수도 있다.
		//무조건 상속받은 sub 클래스 입장에서는 추상 메서드를 재정의해서 구현하도록 강제하기 위함이다.
		//위의 cat 클래스에서 재정의한 cry()메서드를 지워보면 -->> Err(추상 메서드를 재정의 하지 않아서다)
		
		
		//꼭 재정의(override) 해야하는가? --> 일단 YES!!
		//sub 클래스는 일단은 무조건 super(abstract) 클래스로부터 상속받은 추상 메서드는 오버라이딩해서 재정의 해야한다.
		
		
		//만약, 재정의 하고 싶지 않다면?
		//sub 클래스에서 상속받은 추상메서드를 구현하지 않는다면 sub 클래스도 abstract를 붙여서 추상으로 만들어준다.
		
		//결론★★★★★
		//이러한 추상 클래스는 여러 개발자가 작업할때 코드의 확장과 분업을 효율적으로 처리할 수 있게 해준다.
		//분업화된 시스템에서 공통의 프로젝트를 진행할때 많이 사용되어지는 중요한 문법이다.
	
		
	}
}