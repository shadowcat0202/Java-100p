import java.util.Arrays;

public class Java100_array_Basic003{
	public static void main(String[] args){
		String[] Sarr1 = new String[3];	//String 3칸 짜리 배열 생성;
		System.out.println(Arrays.toString(Sarr1));	//null 출력
		
		
		String[] Sarr2 = {"한국","미국","일본"};	//배열 선언과 동시에 초기화
		//String[] Sarr2 = new String[] {"한국","미국","일본"};			
		System.out.println(Arrays.toString(Sarr2));
	
		//[!]:향상된 for문
		for(String nation:Sarr2){
			System.out.print(nation + " ");
		}
		System.out.println();
	
	
		//[!]:2차원 배열 만들기
		String[][] Sarr_2d = {
			{"한국","미국","일본"},
			{"태국","베트남","필리핀"}
			};
		
		System.out.println(Sarr_2d[0]);	//1차 배열에 대한 주소값 출력
		System.out.println(Sarr_2d[1]);
		
		System.out.println(Sarr_2d.length + "×" + Sarr_2d[0].length + "\n");	//행×열
		
		System.out.println("향상된 for문:");
		for(String[] low:Sarr_2d){
			for(String nation:low){
				System.out.print(nation + " ");
			}
			System.out.println();
		}
		
		//[!]:charAt()메서드 -> 해당 인덱스에 있는 값을 반환 -> 단어를 char 배열에 한글자씩 저장 가능
		System.out.println("charAt()메서드 사용 '베트남'에서 charAt(1)=" + Sarr_2d[1][1].charAt(1));	//트
		
	}
		
}