/*
접근제한자 class 클래스이름{
	접근제한자 static 반환타입 메서드이름(문자열 배열 변수명){
		구현할 코드 작성
	}
}
*/ //이건 설명이 main함수가 들어가있는 class설명인데 뭔가 여기에는 안맞네

/*
[1] 접근제한자--> public, private, protected, default
			-->	클래스나 메서드에 접근할 수 있는 범위를 지정	--> 접근제한자, 접근제어자
			--> private > protected > public

[2]클래스선언 --> class
			--> 객체를 생성하는 틀, 프레임, 공장, 템플릿
[3]클래스이름	--> 카멜케이스(단어와 단어 사이의 구문 --> 대문자)
[4]메서드이름	--> 메서드란? = 함수 --> 어떤 특정한 동작이나 작업, 행위 등을 수행하는 것
*/

//깜짝 퀴즈
//(1) 하나의 파일에 2개 이상의 class를 작성할 수 있다										            ○
//(2) 3개의 class가 있다면 자바 파일명이 될 수 있는 것은 public 키워드가 붙은 클래스이다.			        ○
//(3) 하나의 파일에 있는 3개의 class에 모두 public 키워드를 붙일 수 있다.			                    X
//(4) 한 파일내 3개 이상의 class에 모두 public 키워드를 안붙일 수 있다.							        ○
//(5) 한 파일내 3개 이상의 class에 모두 public 키워드가 없다면 class중 어느 것이라도 파일명이 될 수 있다.	○
//(6) 자바 파일에 class가 한개 있다면 클래스명이 곧 파일명이 되어야 한다							        ○

class Person{
    //[1]: 속성(Attribute)(Field)
    int gender;
    int age;

    //[2]: 생성자(Constructor)
    Person(){
        this.gender = 1;
        this.age = 20;
    }

    //[3]: 메서드(Method)
    void walk(){    System.out.println("걸어가는 중~");  }
}

//상속 개념 설명 활용 미완성 Hero class
//http://www.tcpschool.com/java/java_inheritance_concept    참조
class Hero extends Person{
    String hero_name;
    int power;
}

public class class_struct {
    //[1]: 속성(Attribute)
    int variable1;
    String variable2;

    //[2]:생성자(Constructor)  //클래스 객체를 생성할때 가장 먼저 실행되는 메서드 일종의 init이라고 보는게 쉽다
    class_struct() {
        this.variable1 = 2022;
        this.variable2 = "클래스";
    }

    //[3]:메서드(Method)
    void method_info(){
        System.out.println("class_struct의 method_info()입니다");
        System.out.println(variable1 + "년에 만든 " + "class_struct" + variable2 + "입니다.");
    }

}
