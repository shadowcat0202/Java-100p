public class Java100_operator_RelationalOperators{
	public static void main(String[] args){
		
		//[!]:관계연산자 --> ==, !=, >, >=, <, <=
		//리턴값으로는 참(true), 거짓(false)로 반환된다.-->리턴 타입은 boolean
		
		int kor=70, eng=40, math=70;
		boolean res1, res2, res3, res4, res5, res6;
		
		res1 = kor == eng;
		res2 = kor != eng;
		res3 = kor > eng;
		res4 = kor >= math;
		res5 = kor < eng;
		res6 = kor <= math;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
	}
}