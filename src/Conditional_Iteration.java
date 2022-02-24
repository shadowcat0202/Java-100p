public class Conditional_Iteration {
    int age = 17;

    Conditional_Iteration(){}

    //[1]:if
     void if_Conditional(){
		/*
		if(조건식1){}
		//아래의 부분은 필수적인 부분은 아니다
		else if(조건식2){}
		else{ 위의 조건식들에 해당되지 않는 부분 }

		//조건문 다음 한줄은 {}를 하지 않아도 인식할수 있다 두줄은 {}를 해야한다

		*/
         if(10 < age && age < 20){
             age = 10;
         }
         else if(20 < age && age < 30){
             age = 20;
         }
         else if(30 < age && age < 40){
             age = 30;
         }
        System.out.println("if문을 통해 age를 처리 age=" + age);
    }

    //[2]:switch
    void switch_Conditional(){
		/*
		switch(입력변수){	//입력변수 조건은 정수형 ->byte, short, int, char -> 실수형 안됨
			case 입력값1:
				...
				break;      //break; 잊어버리지 말기!
			case 입력값2:
				...
				break;
			...
			default:        //default: 잊어버리지 말기!
				...
				break;
		}
		*/

        //위의 if_Conditional()은 switch문에서의 중간값들의 예외처리를 위해서 사용
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
                System.out.println("default(40대 이상입니다)");
                break;
        }
    }
    
    void ternary_operator(){    //삼항연산자
        int hour = 10;
        String apm = (hour < 12) ? "오전" : "오후";
        System.out.println(apm);

        hour = (hour <= 10) ? hour * 100 : hour;
        System.out.println("시간이 10보다 크기때문에 100을 곱함:" + hour);
    }

    //반복문 내용 추가 요망

}
