//import 패키지이름.클래스이름;
//import 패키지이름.*;   //패키지에 속한 모든 메서드를 가져오겠다는 의미
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
[1]접근제한자--> public, private, protected, default
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


public class class_struct {
    //접근 제어자=====================================================
    /*
    접근제어자   같은클래스멤버 같은패키지멤버 자식클래스멤버 그외의영역
    public          ○           ○           ○           ○
    protected       ○           ○           ○           X
    default         ○           ○           X           X
    private         ○           X           X           X
     */

    //[1]: 속성(Attribute)
    int variable1;
    private String instance_time;   //private Field
    public String public_str;       //public Field




    //[2]: 생성자(Constructor)
    /*
    this VS this()
    this : 인스턴스가 바로 자기 자신을 참조하는데 사용하는 변수? this에는 해당 인스턴스의 주소를 가지고 있음
    this() : 생성자(constructor) 내부에서만 사용 가능하며, 같은 클래스의 다른 생성자를 호출
              ->(일종의 초기화 작업, 파라미터값을 전달하지 않았을경우 클래스에서 정의한대로 초기화)
    */
    class_struct(int i){
        variable1 = i;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");
        this.instance_time = now.format(formatter);
    }
    class_struct(){
        this(1);
    }


    //[3]:메서드(Method)
    private String getInstance_time(){  return this.instance_time;  }   //private method

    void info(){ System.out.println("생성자로 인한 초기 숫자 " + variable1 + "이며 " + instance_time + "에 만들어진 클래스입니다"); }




    //오버로딩(Overloading)(메서드 시그니처(method signature)가 핵심)======================================
    /*
    두 메서드가 매개변수 개수와 타입, 순서까지 모두 같다면, 이 두 메서드의 시그니처는 같다 라고 정의
    따라서 같은 메서드 이름이라고 해도 메서드의 시그니처가 다르면 호출되는 메서드의 종류가 다르다
    */
    void Overloading_display(int num1){ System.out.printf("(int)%d\n", num1); }
    void Overloading_display(int num1, int num2){   System.out.printf("(int)%d, (int)%d\n",num1,num2);   }
    void Overloading_display(int num1, double num2){    System.out.printf("(int)%d, (double)%f\n",num1,num2);    }

    //재귀 호출=======================================================
    /*
    중단하기 위한 조건문이 없을경우 스택 오버플로우(stack overflow)에 의해 종료될것이다.
    메모리 구조 중 스택(stack) 영역에서 해당 프로그램이 사용할 수 있는 메모리 공간 이상으로 사용하려고 할때 발생

    의사 코드(pseudo code)란 특정 프로그래밍 언어의 문법에 맞춰 작성된 것이 아닌,
    일반적인 언어로 알고리즘을 표현한 코드를 의미합니다.

    시작
    1. n이 1이 아니면, n과 1부터 (n-1)까지의 합을 더한 값을 반환함.
    2. n이 1이면, 그냥 1을 반환함.
    끝
     */
    int recursiveSum(int n){
        if(n == 1)  return 1;
        return n + recursiveSum(n-1);
    }


}
