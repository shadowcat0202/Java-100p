public class Java100_variable_DataType1{
	public static void main(String[] args){
		int a_1;
		int a_2; int a_3 = 90;
		double a_4;
		char a_5;
		
		a_1 = 10;
		a_4 = 10.0;	//d = 10도 가능하기는 하다 출력할때는 실수 형태로 출력 10.0
		a_5 = 'A'; //""(쌍따옴표)로 하면 에러 ""는 문자열 처리 할때 사용 ''는 문자 처리
		
		System.out.println(a_1);
		//System.out.println(a_2); //초기화 하지 않아서 Err
		System.out.println(a_3);
		System.out.println(a_4);
		System.out.println(a_5);

		
		int b_1;	//선언 자체는 Err는 아니다 --> 자동화된 tool을 사용할 경우에는 안쓰는데 왜 선언했는지 메시지를 띄워준다
		//System.out.println(b_1);	//선언만 하고 초기화 하지 않은 변수를 사용하려고 하는경우는 Err
		
		int b_2, b_3, b_4 = 900;
		// System.out.println("[b]: " + b_2 + ", " + b_3+ ", " + b_4);	//Err b_4만 초기화 되었다
		
		String c_1, c_2, c_3;
		c_1 = c_2 = c_3 = "korea";
		System.out.println("[c] : " + c_1 +", " + c_2 + ", " + c_3);
	}
}