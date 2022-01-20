/*
Primitive Data Type의 byte크기와 bit크기를 출력하는 코드 작성
최소값과 최대값 출력
*/

public class java100_variable_003{
	public static void main(String[] args){
			System.out.print("Byte:\t");
			System.out.println(Byte.BYTES + "byte -> " + Byte.SIZE + "bit\t" + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
			
			System.out.print("short: \t");
			System.out.println(Short.BYTES + "byte -> " + Short.SIZE + "bit\t" + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
			
			System.out.print("int:\t");
			System.out.println(Integer.BYTES + "byte -> " + Integer.SIZE + "bit\t" + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
			
			System.out.print("long:\t");
			System.out.println(Long.BYTES + "byte -> " + Long.SIZE + "bit\t" + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
			
			System.out.print("char:\t");	//Charactoer은 문자형이기때문에 음수가 없다
			System.out.println(Character.BYTES + "byte -> " + Character.SIZE + "bit\t" + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
			
	}
}
//엄청큰 후라이드치킨 순살 1마리
//엄청큰 양념치킨 순살 1마리