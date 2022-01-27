public class Java100_oop_ParseInt1{
	public static void main(String[] args){
		//[1]:숫자끼리 연산
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);	//3
		
		//[2]:문자열끼리 연산
		String s1 = "1";
		String s2 = "2";
		String s3 = s1 + s2;
		System.out.println(s3);	//12 -> 문자열끼리 붙어버린다
		System.out.println(s3.getClass().getName());	//s3는 String형 이라는것을 잊지말자
		
		//[3]:문자열 -> 숫자로 변환후 연산
		//parseInt() --> Integer 클래스의 static으로 지정 --> 객체의 생성없이 바로 클래스명.parseInt()로 호출 가능
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println(n1 + n2 + "\n");	//String -> int형으로 변환했기 때문에 연산이 가능하다
		
		//[4]:진수 지정	.parseInt("(String)숫자", 진수) -> 숫자(진수)를 10진수로 바꿔준다
		System.out.println("-------------------------[진수지정]");
		System.out.println(Integer.parseInt("2022"));		//2022
		System.out.println(Integer.parseInt("2022",10));	//2022
		System.out.println(Integer.parseInt("1100",2));		//2진수	12
		System.out.println(Integer.parseInt("1001",8));		//8진수	513
		System.out.println(Integer.parseInt("1004",16));	//16진수	4100
		System.out.println(Integer.parseInt("A",16));		//16진수	10
		
		System.out.println("-------------------------[진수지정]");
		
	}
}