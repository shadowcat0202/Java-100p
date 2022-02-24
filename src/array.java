import java.util.Arrays;    //배열을 가지고 놀수 있는 메서드들이 많이 들어있는 class? 라고 해야하나? ㅋ

public class array {
    //속성(Attribute)(Field)
    //[1]:배열의 선언
    /*
        1.
        DataType[] array_name = new DataType[array_size];	//선호도가 높다
        2.
        DataType array_name[] = new DataType[array_size];
        3.
        DataType[] array_name                               //선언
        array_name = new DataType[array_size]               //new 연산자로 할당
     */

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
        int[] i_arr2 = {55,66,77,88,99};                //아래의 방법(int[] i_arr3)보다는 편함(결과는 같음)
        int[] i_arr3 = new int[] {100,110,120,130,140};
        
        //[1-3]: 배열 선언 후 초기화
        int[] i_arr4;
        //i_arr4 = {1,2,3,4,5}; //Err: 배열의 시작 주소만 선언했을뿐 크기는 모르기 때문에 컴퓨터가 이해 못함
        i_arr4 = new int[] {1,2,3,4,5};


        //=======================깨알 Tip=========================================================================
        double[] d_arr1 = {9.8,2.45,5.98,5.11,3.14};    //당연하겠지만 다른 데이터 타입도 가능하다

        //각 배열의 마지막 원소 출력(원소의 개수를 알 필요없다 왜냐 배열의 길이를 반환하는 메서드를 사용으로 해결)
        System.out.println(i_arr1[i_arr1.length-1]);    //여기서 .length -1을 한 이유는 앞에서 설명 했듯이 array index의 끝은 array_size - 1이기 때문이다
        System.out.println(d_arr1[d_arr1.length-1]);

        //배열 이름 자체를 출력하게 되면 주소값을 출력한다
        System.out.println(d_arr1); //[D@주소값
    }
    
    //이후 추가할 내용 아래 사이트 부터
    //http://www.tcpschool.com/java/java_array_memory
    
}
