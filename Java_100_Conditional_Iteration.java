public class Java_100_Conditional_Iteration{
	public static void main(String[] args){
		int kor=80, eng=90, math=100;
		
		//[1]:if
		/*
		if(조건식1){}
		//아래의 부분은 필수적인 부분은 아니다
		else if(조건식2){}
		else{ 위의 조건식들에 해당되지 않는 부분 }
		
		//조건문 다음 한줄은 {}를 하지 않아도 인식할수 있다 두줄은 {}를 해야한다
		
		*/
		
		//[2]:swtich
		/*
		swtich(입력변수){	//입력변수 조건은 정수형 ->byte, short, int, char -> long X -> break, default 잊지 말것 
			case 입력값1:
				...
				break;
			case 입력값2:
				...
				break;
			...
			deafult:
				...
				break;
		}
		*/
		int age = 17;
		if(10 < age && age < 20){
			age = 10;
		}
		else if(20 < age && age < 30){
			age = 20;
		}
		else if(30 < age && age < 40){
			age = 30;
		}
		
		//위의 if문은 switch문에서의 중간값들의 예외처리를 위해서 사용
		switch(age){
			case 10:
				System.out.println("10대입니다.");
				break;
			case 20:
				System.out.println("20대입니다.");
				break;
			case 30:
				System.out.println("30대입니다.");
				break;
			default:
				System.out.println("default");
				break;
		}
		
		//[3]:삼항연산자 
		/*
		(condition) ? exprifTrue : exprifFalse
		
		//exprifTrue 	-> condition이 true일때 return 되는 값
		//exprifFalse	-> condition이 false일때 return 되는 값		
		*/
		
		int hour = 10;
		String apm = (hour < 12) ? "오전" : "오후";
		System.out.println(apm);
		hour = (hour <= 10) ? hour * 100 : hour;
		System.out.println("시간이 10보다 크기때문에 100을 곱함:" + hour);
		
		
		
		//[4]:반복문 --> 대표적 4가지
		System.out.println("for문:");		
		//[4_1]for:
		/*
			for(변수초기식; 조건식; 증감식){
				내용
			}			
						 ┌──────<<────────┐
		[순서]:변수초기식 -> 조건식 -(참)> 내용 -> 증감식
						 └───(거짓)──> for문 탈출			
		*/		
		
		
		//ex1
		for(int i = 0; i < 10; i++){
			System.out.print(i+" ");
		}
		System.out.println();
		
		//ex2
		for(int i = 65; i <= 90; i++){
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		
		System.out.println("while:");
		//[4_2]while:
		/*
			while(조건문){
				
			}
			--> 조건문이 ture면 반복한다.
		*/
		
		//ex1(짝수 출력)
		int num = 1;
		
		while(num <= 30){
			if(num % 2 == 0)				
				System.out.print(num + " ");
			
			num++;
		}
		System.out.println();
		
		
		//do~while
		//향상된 for문
	}
}