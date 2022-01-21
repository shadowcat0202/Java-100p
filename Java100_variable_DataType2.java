public class Java100_variable_DataType2{
	public static void main(String[] args){
		long l = 100L;	//long type은 초기화 뒤에 L을 붙여주어야한다
		float f = 30.57135F; //float type은 초기화 뒤에 F를 붙여주어야한다
		
		System.out.println("l:" + l + "\nf:" + f);
		
		int b = 15;
		int y = 2022;
		//%d(정수), %f(소수점형식) , %c(문자), %s(문자열), %b(부울), %n(줄바꿈?)
		System.out.printf("올해는 %d년이고 나는 %d살 입니다.\n", y, b);
		
		//실수형 데이터 포멧은 %.소수점밑개수f
		System.out.printf("단순 출력:%f\n소수점 1번째:%.1f\n소수점 3번째 %.3f\n",f,f,f);
		
		//%e(지수), %o(8진수), %x(16진수)
		System.out.printf("%d의 8진수는 %o, 16진수는 %x\n", b,b,b);
	
	}
}