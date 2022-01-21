public class Java100_operator_ArithmeticOperator2{
	public static void main(String[] args){
		//[!]:연산의 결과-->정수끼리라도 나누기의 경우 소수점 형태가 나올 수 있다
		int a = 60, b = 8;
		int res1; double res2, res3,res4;
		
		
		res1 = a/b;
		System.out.println(res1);	//7.5가 아니라 7 출력 --> res1 타입이 정수형이므로 --> 실수형으로 변환
		System.out.println((double)res1);	//리턴 받는 변수를 실수형으로 하더라도 a와 b가 이미 정수형으로 계산되었으므로 리턴값은 정수형으로 나온다
		
		
		res2 = (double)a / b;	//어느 한쪽의 피연사자 타입을 double타입으로 변환
		System.out.println(res2);
		
		
		res3 = 100/(double)3;
		res4 = 100/3.0;	//피연산자를 실수형으로 명시해준다
		System.out.printf("res3:%f\nres4:%.2f\n",res3,res4);
	}
}