public class Java100_variable_DataType1{
	public static void main(String[] args){
		int a;
		int b; int c = 90;
		double d;
		char e;
		
		a = 10;
		d = 10.0;	//d = 10도 가능하기는 하다 출력할때는 실수 형태로 출력 10.0
		e = 'A'; //""(쌍따옴표)로 하면 에러 ""는 문자열 처리 할때 사용 ''는 문자 처리
		
		System.out.println(a);
		//System.out.println(b); //초기화 하지 않아서 Err
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	
	}
}