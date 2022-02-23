public class Java_100_array_Basic001{
	public static void main(String[] args){
		//[1]:배열의 선언
		//DataType[] array_name = new DataType[array_size];	//선호도가 높다
		//DataType array_name[] = new DataType[array_size];
		
		//[1-1]:int형 공간이 5개가 있는 배열을 'arr'라는 이름으로 선언한다
		int[] arr1 = new int[5];	//[0,0,0,0,0]
		arr1[0] = 3;
		arr1[1] = 11;
		arr1[2] = 22;
		arr1[3] = 33;
		arr1[4] = 44;
		
		//[1-2]:배열을 선언과 동시에 초기화
		int[] arr2 = {55,66,77,88,99};
		int[] arr3 = new int[] {100,110,120,130,140};	//위의 방법보다 불편
		
		//[1-3]:배열 선언 후 초기화
		int[] arr4;
		//arr4 = {1,2,3,4,5};	//Err:배열의 시작 주소만 선언했을뿐 크기는 모르기 때문에 컴퓨터가 이해를 못한다
		arr4 = new int[] {1,2,3,4,5};

		
		
		
		System.out.println("arr1:");
		for(int i = 0; i < arr1.length; i++){			
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		
		//[1]:정수형 실수형 배열 선언 및 초기화
		int[] iarr = {3,3,3,3,4};
		double[] darr = {9.8,2.45,5.98,5.11,3.14};
		
		//[2]:각 배열의 마지막 원소 출력
		System.out.println(iarr[iarr.length -1]);
		System.out.println(darr[iarr.length -1]);
		
		//[3]:배열명 자체를 찍어서 출력 -> 주소(참조)값 -> I:정수형, D:실수형 배열
		System.out.println(iarr);	//[I@주소값
		System.out.println(darr);	//[D@주소값
	
	}
}