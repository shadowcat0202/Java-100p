import java.util.Arrays;

public class Java100_array_Basic002{
	public static void main(String[] args){
		//[1]:배열 선언
		int[] arr = {238,483,239,442,487,239,873};
		//[2]:for문을 사용하지 않고 배열의 모든 값 출력 -> toString()메서드 사용
		System.out.println("Arrays.toString()");
		System.out.println(Arrays.toString(arr));	//[238,483,239,442,487,239,873]
	
		//다중 배열 선언
		int[] a,b;	//배열 a,b
		int c[],d[];//배열 c,d
		int e[], f;	//배열 e, 정수 f	//베열을 한꺼번에 여러가 하기 위해서는 위의 2가지 방법으로 사용한다
	
	
		//[!]:베열 복사
		//arraycopy()메서드 사용 --> System.arraycopy(원본배열명, 원본시작인덱스, 복사배열명, 복사시작엔덱스, 길이만큼);
		int[] origin, copyarr;
		origin = new int[] {0,1,2,3,4};
		copyarr = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("\nSystem.arraycopy()");
		System.out.println("origin:" + Arrays.toString(origin));
		System.out.println("befor copyarray:" + Arrays.toString(copyarr));		
		System.arraycopy(origin, 2, copyarr, 4, 3);
		System.out.println("after  copyarray:" + Arrays.toString(copyarr));			
	}
	
}