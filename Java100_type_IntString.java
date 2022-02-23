public class Java100_type_IntString{
	public static void main(String[] args){
		int a = 12345;
		String str = "12345";
		
		//[1]:정수선언
		//System.out.println(a.length());	//Error
		System.out.println("[1]-->"+str.length());	//5
		
		//[2]:정수 --> 문자열로 변환 --> 자릿수 구하기
		String str_a = String.valueOf(a);	//정수 --> 문자열 변환
		System.out.println("[2]-->"+str_a.length());	//5
		
		//[3]:문자열 + 정수형
		System.out.println("[3]-->"+12345+1);	//12346
		System.out.println("[3]-->"+str+1);	//123451	그냥 옆에 붙어진다
		
		//[4]:문자열 --> 정수로 변환
		System.out.println("[4]-->"+Integer.valueOf(str) + 1);	//12346
		
		
		
		
	}
}