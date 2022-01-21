public class Java100_operator_LogicalOperators{
	public static void main(String[] args){
		
		//[!]:논리 연산자 --> &&(AND), ||(OR)(이항연산자), !(NOT)(단항연산자)
		
		
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
}