/*
[1]:Q. 변수란?
    A. Data를 저장하는 메모리 공간

[2]:Q.  변수 선언이란?
    A.  변수의 타입(데이터타입(자료형))에 맞는 선언을 해야한다

[3]:Q.  변수의 용도?
    A.  연산을 할때 값을 저장, 활용하기 위해 사용
*/

/*
★ JAVA의 DataType(자료형)=========================
[1] Primitive type(기본형 타입)
    정수타입 -->	byte(1byte) -2^7 ~ (2^7 - 1)
                char(2)     0 ~ (2^16 -1), 유니코드(문자)
                short(2)    -2^15 ~ (2^15 -1)
                int(4)      -2^32 ~ (2^31 - 1)
                long(8)     -2^63 ~ (2^63 - 1)
    실수타입 -->	float(4), double(8)
    논리타입 -->  참 or 거짓 --> boolean(1byte) --> true, false
    
    [1-1] Wrapper class(래퍼 클래스)
    -> 프로그램에 따라 Primitive type(기본형 타입)의 데이터를 class 취급해야하는 경우가 생긴다
        byte    ->  Byte
        Short   ->  Short
        int     ->  Integer
        long    ->  Long
        float   ->  Float
        double  ->  Double
        char    ->  Character
        boolean ->  Boolean

[2] Reference type(참조형 타입) = 기본형에 속하지 않는 데이터타입
    class, array, interface, String/immutable
    ★특징	-->	데이터가 저장된 메모리의 주소값을 저장하는 변수
*/
public class variable {
    variable(){}

    //기본적인 사용법
    void basic(){
        System.out.println(3 + 4);  //휘발성 데이터
        
        //datatype 변수이름;
        int v1; //int v1 = 3; 과 같은 방식으로 선언과 동시에 초기화도 가능하다
        int v2;
        int sum;

        v1 = 3;
        v2 = 4;
        sum = v1 + v2;
        
        System.out.printf("v1(%d) + v2(%d) = sum(%d)", v1, v2, sum);
    }
    
    //Primitive Data Type의 byte크기와 bit크기를 출력하는 코드 작성, 최대, 최소값 출력
    void dataType_size(){
        //Wrapper클래스 -> Integer, Byte, Short, Long, Character
        System.out.println("Byte:\t");
        System.out.println(Byte.BYTES + "byte ->\t" + Byte.SIZE + " bit\t" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);

        System.out.println("short:\t");
        System.out.println(Short.BYTES + "byte ->\t" + Short.SIZE + " bit\t" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);

        System.out.println("int:\t");
        System.out.println(Integer.BYTES + "byte ->\t" + Integer.SIZE + " bit\t" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

        System.out.println("long:\t");
        System.out.println(Long.BYTES + "byte ->\t" + Long.SIZE + " bit\t" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);

        System.out.println("char:\t");  //Character은 문자타입이기 때문에 음수가 없다
        System.out.println(Character.BYTES + "byte ->\t" + Character.SIZE + " bit\t" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);

        System.out.println("float:\t");
        System.out.println(Float.BYTES + "byte ->\t" + Float.SIZE + " bit\t" + Float.MIN_VALUE + "~" + Float.MAX_VALUE);

        System.out.println("double:\t");
        System.out.println(Double.BYTES + "byte ->\t" + Double.SIZE + " bit\t" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);

    }

    void dataType(){
        int v1;
        int v2; int v3 = 90;
        double v4;
        char v5;
        long l = 100L;          //long type은 초기화 뒤에 L을 붙여주어야 한다
        float f = 30.57135F;    //float type은 초기화 뒤에 F를 붙여주어야 한다


        v1 = 10;
        v4 = 10.0; //a_4 = 10도 가능하다 print해보면 10.0(실수)형태로 출력
        v5 = 'A';  //""(쌍따옴표)로 하면 Err "" = String(문자열), '' = char(문자) 처리
        System.out.println(v1);
        //System.out.println(a_2);  //Err(초기화 하지 않아서)
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(l);
        System.out.println(f);

        int b = 15;
        int y = 2022;
        //%d(정수), %f(소수점형식), %c(문자), %s(문자열), %b(부울)
        System.out.printf("올하는 %d년이고, %d살 입니다.\n", y, b);

        //실수형 데이터 포멧은 %.소수점밑개수f
        System.out.printf("단순 출력:%f\n소수점 1번째:%.1f\n소수점 3번째 %.3f\n",f,f,f);

        //%e(지수), %o(8진수), %x(16진수)
        System.out.printf("%d의 8진수는 %o, 16진수는 %x\n", b,b,b);


        int un_use;     //선언 자체는 Err가 아님 -> 자동화된 tool을 사용할 경우에는 사용하지 않는데 왜 선언했는지 메시지를 띄워준다
        //System.out.println(un_use);   //선언만 하고 초기화(할당)하지 않는 변수를 사용하려고 하는 경우 Err

        String s1, s2, s3;          //문자열로 선언
        s1 = s2 = s3 = "korea";     //3개 동시 초기화(할당)
        System.out.println("[S]:" + s1 + ", " + s2 + ", " + s3);
    }
}
