public class type_IntString {
    Integer i = 12345;  //생성자에서 변수의 class 이름을 확인하고 싶어서 Wrapper 클래스로 선언함 -> 궁금하면 variable.java를 둘러보자
    String str = "12345";

    public type_IntString(){
        System.out.println("i=" + i + " " + i.getClass().getName());
        System.out.println("str=" + str + " " + str.getClass().getName());
    }
    
    //정수 출력
    public void print_string_length(){
        //System.out.println(i.length());	//Error
        System.out.println("str.length()="+str.length());	//5
    }

    //정수 --> 문자열로 변환 --> 자릿수 구하기
    public void print_intDigit(){
        String str_i = String.valueOf(i);	//정수 --> 문자열 변환
        System.out.println("(String.valueOf(i)).length"+str_i.length());	//5
    }

    //문자열 + 정수
    public void string_plus_int(){
        System.out.println("i + 1 ="+12345+1);	//12346     연산이 된다
        System.out.println("str + 1 ="+str+1);	//123451	그냥 옆에 붙는다
    }

    //문자열-->정수 변환
    public void string_to_int(){
        System.out.println("Integer.valueOf(str) + 1="+Integer.valueOf(str) + 1);	//12346
    }
}
