//1. 변수란 무엇인가?
//2. 변수 선언이란 무엇인가?
//3. 변수의 용도는 무엇이고 왜 필요한가?

/*
[1]:변수란 -> data를 저장하는 메모리 공간

[2]:변수 선언이란? -> 변수의 타입(데이터타입(자료형))에 맞는 선언을 해야한다

[3]:변수의 용도?	-> 저장 -> 연산을 할때 값을 저장, 활용하기 위해 사용
*/


/*
자바의 데이터타입(자료형)에 대해서 설명

[1]:크게 봤을때 --> 기본형, 참조형 타입

[2]:기본형 타입(Primitive Data Type) --> 8개
정수형-->	byte(1byte), short(2), int(4), long(8)
실수형-->	float(4), double(8)
문자형-->	char(2byte)	--> 문자한개, 문자열을 다루는 타입은 없다.
부울형-->	논리형: 참 or 거짓 --> boolean(1byte) --> true, false

[3]:참조형 타입(Reference Data Type) --> 기본형에 속하지 않는 테이터타입
class, array, interface, String/immutable
★특징	-->	데이터가 저장된 메모리의 주소값을 저장하는 변수

*/
public class java100_variable_001{
	public static void main(String[] args){
		System.out.println(3+4);	//휘발성 데이터
	
		int a;	//정수가 저장될 변수 이름을 a로 만든다
		int b;
		int sum;
		
		a = 3;
		b = 4;
		sum = a + b;
		System.out.println(a+b);
	}
}