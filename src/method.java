/*
★메서드(method)란?
(1) 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 ★특정한 동작★이나 처리를 하도록 만들어진 ★코드 단위★
(2) 반복적인 작업을 처리해야 하는 경우 메서드로 만들어 놓으면 이후에 필요할 때 다시 ★재사용 가능★
(3) 메서드는 call(호출)할때 return 값이 존재 할 수도 있고, void 형태로 반환하지 않을 수도 있다.
(4) 메서드 call(호출)할때 파라미터값을 넘겨 줄수도 있지만, 없이 call(호출) 할 수도 있다.
 */

class TestNumber{
    int num;
    TestNumber(int num) {this.num = num;}
}

public class method {
    //return 값이 없고 파라미터 값도 없는 메서드
    public static void methodRvPv(){	//public void method1(){} 로하면 main 메서드에서 call이 불가능하다
        System.out.println("methodRvPv() 호출");
        System.out.println("반환값은 없습니다.\n");
    }

    //return 값이 없고 파라미터 값이 존재하는 메서드
    public static void methodRvPii(int a, int b){
        System.out.println("methodRvPii(int a, int b) 메서드 호출");

        System.out.printf("%d, %d값을 파라미터로 받았습니다.\n", a,b);

        int res = a+ b;
        System.out.println("두 파라미터의 합은 " + res+ "입니다.");
        System.out.println("반환값은 없습니다.\n");
    }

    //return 값이 있고 파라미터 값이 없는 메서드
    public static int methodRiPv(){
        System.out.println("methodRiPv() 호출");
        int res = 10;
        res*=10;
        System.out.println("반환하려는 값:" + res);
        return res;
    }

    //return 값이 있고 파라미터 값도 있는 메서드
    public static String methodRSPS(String str){
        System.out.println("methodRSPS() 호출");
        System.out.println(str+"입력 받음");
        String res = str.toUpperCase();
        System.out.println("반환되려는 값 :" + res);
        return res;
    }

    public void noStatic(){
        System.out.println("noStatic() 함수 호출\n");
    }

    //[!]:Call by value --> 값에 의한 호출(값을 복사해서 넘긴다 라고 생각하면 쉽다)
    public static void sum_Cbv(int a){
        System.out.println("sum_Cbv(int a) 호출 a = " + a);
        a += 400;
        System.out.println(a);	//500
        System.out.println("sum_Cbv(int a) 종료");
    }

    //[!]:Call by Reference --> 주소값을 보낸다
    public static void sum_Call_by_Reference(TestNumber a){
        System.out.println("sum_CbR(sum_CbR(TestNumber a) 호출\na.num = " + a.num);
        a.num += 100;
        System.out.println("a.num += 100");
        System.out.println("sum_CbR(Integer a) 종료");

    }

    //[!]:2개 이상의 return 값을 반환하는 메서드 작성
    public static int[] return_over2(){
        int num1 = 100;
        int num2 = 200;
        return new int[] {num1, num2};	//해당 배열의 주소값 반환
    }
}
