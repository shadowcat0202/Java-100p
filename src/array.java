import java.util.Arrays;    //배열을 가지고 놀수 있는 메서드들이 많이 들어있는 class? 라고 해야하나? ㅋ

public class array {
    //속성(Attribute)(Field)
    //[1]:배열의 선언
    //DataType[] array_name = new DataType[array_size];	//선호도가 높다
    
    //DataType array_name[] = new DataType[array_size];

    //DataType[] array_name                   //선언
    //array_name = new DataType[array_size]   //new 연산자로 할당


    //생성자(Constructor)
    array(){}

    //메서드(Method)
    void I_arr(){
        //[1-1]:    int형 공간이 5개 있는 배열을 'i_arr'라는 이름으로 (선언+)할당 한다
        int[] i_arr1 = new int[5];
        i_arr1[0] = 3;   //배열의 시작 index는 0부터 출발한다
        i_arr1[1] = 11;
        i_arr1[2] = 22;
        i_arr1[3] = 33;
        i_arr1[4] = 44;  //index의 끝은 array_size - 1 이다

        System.out.println(i_arr1);  //그냥 print해버리면 배열의 주소값이 나옴(내가 원하는건 이게 아닌데)
        System.out.println(Arrays.toString(i_arr1)); //그래서 Arrays class가 준비 했다! toString() 메서드를 통해 인자 값들을 보기 좋게 출력해준다
        
        //[1-2]: 선언과 동시에 초기화
        int[] i_arr2 = {55,66,77,88,99};
        int[] i_arr3 = new int[] {100,110,120,130,140}; //위의 방법보다 불편하기는 함
        
        //[1-3]: 배열 선언 후 초기화
        int[] i_arr4;
        //i_arr4 = {1,2,3,4,5}; //Err: 배열의 시작 주소만 선언했을뿐 크기는 모르기 때문에 컴퓨터가 이해 못함
        i_arr4 = new int[] {1,2,3,4,5};
        
        
        
    }
}
