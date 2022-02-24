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
    
    //[3]:삼항연산자
    void ternary_operator(){
        int hour = 10;
        String apm = (hour < 12) ? "오전" : "오후";
        System.out.println(apm);

        hour = (hour <= 10) ? hour * 100 : hour;
        System.out.println("시간이 10보다 크기때문에 100을 곱함:" + hour);
    }

    //[4]:반복문

    //[4-1]:for 문
    void for_loop() {
        /*
        for(초기식; 조건식; 증감식){
            조건식의 결과가 참인동안 반복되는 명령문
        }
                        ┌───────←──────────┐
        [절차]: 초기식 → 조건식 -(참)→ 반복 → 증감식
                        └─────(거짓) → for문 탈출
         */

        //ex1(0 ~ 9 출력)
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //ex2(A ~ z 출력)
        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();
    }

    //[4_2]:while문
    void while_loop(){
		/*
			while(조건문){
                조건식의 결과가 참인동안 반복되는 명령문
			}
			--> 조건문이 참이면 반복한다.
		*/

        //ex1(짝수 출력)
        int i = 1;
        while(i <= 30){
            if(i % 2 == 0)  System.out.print(i + " ");
            i++;    //조건식에 영향을 주는 변수의 변화가 없다면 무한루프에 빠지게 되므로 주의!
        }
        System.out.println();
    }

    //[4-3]:do~while문
    void do_while_loop(){
        /*
			do{
                조건식의 결과가 참인동안 반복되는 명령문
			}while(조건문);
			--> 조건문이 참이면 do로 올라가서 반복한다. -> while문에서 조건문을 확인하는게 뒤에 있다고 보면 쉽다
		*/
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        }while(i < 1);
        System.out.println();
    }

    //[4-4]:향상된 for문
    void enhanced_for(){
        //자주 사용되는 상황(1.ArrayList 원소 출력 2.배열 원소 출력)
        //속도: for문 == 향상된 for문
        //장점: 간편, 가독성 좋은 코드, 배열 인덱스 문제 해결(ArrayIndexOutOfBoundsException 에외 피할수 있음)
        //단점: index를 사용하지 못한다, 값을 사용 할 수는 있지만 절대로 수정은 할 수 없다
        String[] arr = new String[] {"1-1","1-2","1-3","1-4","1-5"};
        for(String s : arr){
            System.out.println(s);
        }
    }
    
    //[5]:제어문(continue, break, label(c언어에서는 goto문))
    void continue_in_loop(){
        for(int i = 1; i <= 50; i++){   //1~50 사이에서
            if(i % 5 == 0 || i % 7 == 0)    System.out.print(i + " ");  //5의 배수 7의 배수 출력
            else    continue;
        }
    }

    void break_in_loop(){
        int i = 1, sum = 0;
        while(true){    //무한루프
            sum += i;
            if(i == 10)   break;
            i++;
        }
        System.out.println(sum);
    }

    void label_in_loop(){
        iLoop:
        for(int i =2; i< 10; i++){
            for(int j = 2; j < 10; j++){
                if(i == 5)  break iLoop;    //i가 4단까지만 나옴
                System.out.println(i + "*" + j +"=" + String.format("%2d",(i*j)));
            }
        }
    }
}
