import java.util.Scanner;

public class Java100_array_TwoArrayUserInput{
	public static void main(String[] args){
		//[1]: 사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		//2차원 배열 행 열 선언 -- >> 사용자 입력 처리
		System.out.print("행의 갯수 입력하고 [Enter]:");
		int row = sc.nextInt();
		System.out.print("열의 갯수 입력하고 [Enter]:");
		int col = sc.nextInt();
		
		char[][] gameMap = new char[row][col];
		
		String[] strArr = new String[row];
		for(int i = 0; i < row; i++){
			System.out.print((i+1)+"번째 행에 입력할 문자" + col + "개를 자례대로 입력하고 [Enter]:");
			strArr[i] = sc.next();
			for(int j = 0; j < col; j++){
				gameMap[i][j] = strArr[i].charAt(j);
			}			
		}
		
		System.out.println(strArr);
	}
}