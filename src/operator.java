public class operator {
    class A{}
    class B extends A{}

    //산술 연산자
    public void Arithmetic_Operator(){
        //[!]:연산의 결과-->정수끼리라도 나누기의 경우 소수점 형태가 나올 수 있다
        int a = 60, b = 8;
        int res_i; double res_d1, res_d2, res_d3;


        res_i = a/b;
        System.out.println(res_i);	//7.5가 아니라 7 출력 --> res1 타입은 정수형이므로 --> 실수형으로 변환
        System.out.println((double)res_i);	//리턴 받는 변수를 실수형으로 하더라도 a와 b가 이미 정수형으로 계산되었으므로 리턴값은 정수형으로 나온다


        res_d1 = (double)a / b;	//어느 한쪽의 피연사자 타입을 double타입으로 변환
        System.out.println(res_d1);


        res_d2 = 100/(double)3;
        res_d3 = 100/3.0;	//피연산자를 실수형으로 명시해준다
        System.out.printf("res3:%f\nres4:%.2f\n",res_d2,res_d3);
    }

    //[!]:관계연산자 --> ==, !=, >, >=, <, <=
    public void Relational_Operator(){

        //리턴값으로는 참(true), 거짓(false)로 반환된다.-->리턴 타입은 boolean

        int kor=70, eng=40, math=70;
        boolean res1, res2, res3, res4, res5, res6;

        res1 = kor == eng;  //같은가
        res2 = kor != eng;  //다른가
        res3 = kor > eng;   //초과
        res4 = kor >= math; //이상
        res5 = kor < eng;   //미만
        res6 = kor <= math; //이하

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
    }

    //[!]:논리 연산자 --> &&(AND)(이항연산자), ||(OR)(이항연산자), !(NOT)(단항연산자)
    public void Logical_Operator(){


        int a = 10, b = 20, c = 30;
        boolean res1 = a < b && c > b;
        System.out.println(res1);

        boolean res2 = a < b || c < b;
        System.out.println(res2);

        boolean res3 = a > c || c != b;
        System.out.println(res3);

        boolean res4 = !res3;
        System.out.println(res4);
    }

    //비트연산자
    public void Bit_Operator(){
        int num1 = 11, num2 = 25;
        System.out.println("bit 수=" + Integer.toBinaryString(num2).length());
        System.out.println(num1 +"=\t"+ String.format("%32s", Integer.toBinaryString(num1).replace(" ", "0")));  //int = 4byte = 32bit
        System.out.println(num2 +"=\t"+ String.format("%32s", Integer.toBinaryString(num2).replace(" ", "0")));
        System.out.println();

        System.out.println((num1 & num2) + "=\t" + String.format("%32s", Integer.toBinaryString(num1 & num2).replace(" ", "0")) + " AND(&)");
        System.out.println((num1 | num2) + "=\t" + String.format("%32s", Integer.toBinaryString(num1 | num2).replace(" ", "0")) + " OR(|)");
        System.out.println((num1 ^ num2) + "=\t" + String.format("%32s", Integer.toBinaryString(num1 ^ num2).replace(" ", "0")) + " XOR(^)");
        System.out.println((num2) + "=\t" + String.format("%32s", Integer.toBinaryString(num2).replace(" ", "0")) + " 보수(~)");
    }

    //instanceof 연산자
    public void Instanceof_Operator(){
        //인스턴스이름 instanceof 클래스또는인터페이스이름
        //->왼쪽 피연사자의 인스턴스가 오른쪽 피연산자인 클래스나 인터페이스로부터 생성되었으면 ture 아니면 false
        A a = new A();
        B b = new B();
        System.out.println("A a = new A();");
        System.out.println("B b = new B();");

        System.out.println("a instanceof A=" + (a instanceof A)); // true
        System.out.println("b instanceof A=" + (b instanceof A)); // true   //상속의 개념 이해 필요 나중에 배움
        System.out.println("a instanceof B=" + (a instanceof B)); // false
        System.out.println("b instanceof B=" + (b instanceof B)); // true
    }
}
