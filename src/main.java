
public class main {
    public static void isStatic_method(){
        System.out.println("main class안에 같이 작성된 public static void method()");
    }

    public static void main(String[] args) {
        //=============class variable=======================================
//        variable va = new variable();
//        va.dataType();


        //============class method==========================================
        //[1]:메서드 호출(static으로 정의된 메서드 호출)
        System.out.println("[1]:");
        isStatic_method();     //main 클래스 안에 같이 작성된 메서드는 [method_name();] 과 같은 방식으로 호출하지만
        method.methodRvPv();	//다른 파일에 작성된 메서드는 [class_name.method_name();] 과 같은 방식으로 호출해야한다
        method.methodRvPii(3,5);
        System.out.printf("methodRiPv()에서 반환된 값 :%d\n\n", method.methodRiPv());
        System.out.printf("methodRSPS(\"kor\")에서 반환된 값:%s\n\n", method.methodRSPS("korea"));


        //[2]:static이 없는 메서드 호출 방법
        System.out.println("[2]:");
        method obj = new method();	//obj(이름은 마음대로)라는 객체 생성
        obj.noStatic();	//static으로 정의하지 않은 메서드 호출
        //obj.methodRvPv();   //물론 static 메서드도 객체를 생성해서 호출 가능()

        //[3]:파라미터 전달시 기본형, 참조형 타입의 다양한 메서드 호출 방식
        //[3-1]:Call by value
        System.out.println("[3-1]:");
        int a = 100;
        method.sum_Cbv(a);
        System.out.println(a+"\n");	//100

        //[3-2]:Call by Referenc
        System.out.println("[3-2]:");
        TestNumber b = new TestNumber(100);
        method.sum_Call_by_Reference(b);
        System.out.println(b.num + "\n");


        //[4]:return 값의 처리 방법
        System.out.println("[4]:");
        int result[] = method.return_over2();
        System.out.println(result);	//[I@주소값
        System.out.println(result[0]+", "+ result[1] + "\n");
    }
}
