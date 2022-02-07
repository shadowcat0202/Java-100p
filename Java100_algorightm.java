import java.util.Arrays;	//Arrays.toString(), Arrays.sort()
import java.util.Collections;	//reverseOrder()

public class Java100_algorightm{
	public static void init_iarr(int[] arr, int maximum){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * maximum);	//무작위로 숫자(double type)로 변환하기 때문에 캐스팅이 필요하다
		}
	}
	
	public static int[] minmax_iarr(int[] arr){
		//Integer.MAX_VALUE, Integer.MIN_VALUE로 초기화가 가능하지만 
		//배열의 0번째로 초기화 하면 배열을 0번부터 확인할 필요가 없어진다
		int[] result = {arr[0], arr[0]};	
		for(int i = 1; i < arr.length; i++){
			result[0] = (result[0] > arr[i]) ? arr[i]: result[0];	//최소값
			result[1] = (result[0] < arr[i]) ? arr[i]: result[1];	//최대값			
		}
		return result;
	}
	public static void main(String[] args){
		int[] arr = {1,13,15,17,-2};
		System.out.println(Math.max(10,4));	//최대값
		System.out.println(Math.min(10,4));	//최소값
		
		//최대값 최소값 확인
		int[] minmax = minmax_iarr(arr);
		System.out.printf("arr 배열에서 최소값은 %d 최대값은 %d 입니다.\n", minmax[0], minmax[1]);
		
		//+랜덤수 생성
		int[] randarr = new int[10];
		init_iarr(randarr, 20);
		System.out.println(Arrays.toString(randarr));
		minmax = minmax_iarr(randarr);
		System.out.printf("randarr 배열에서 최소값은 %d 최대값은 %d 입니다.\n", minmax[0], minmax[1]);
		
		//정렬
		Arrays.sort(randarr);
		System.out.println("오름차순 정렬후" + Arrays.toString(randarr));
		
		Integer[] score = {55,66,7,2,44,18,35,49};	//Collections의 메서드(정렬 조건)을 사용하기위해 래퍼클래스로 만들어서 적용하면 된다
		System.out.println("\n내림차순 정렬전" + Arrays.toString(score));
		Arrays.sort(score, Collections.reverseOrder());	//정렬의 조건을 설정해서 하고자 할때->기본형(Primitive Type)의 배열에는 적용이 안된다.
		System.out.println("내림차순 정렬후" + Arrays.toString(score));
		
		//순위	
		System.out.println("\n--------------순위--------------");
		int [] score1 = {88,50,38,100,90,100,99,75};
		int [] ranking = new int[score1.length];
		
		for(int i = 0 ; i < ranking.length; i++){
			ranking[i] = 1;
			for(int j = 0; j < score1.length; j++){
				if(score1[i] < score1[j])	ranking[i]++;
			}
		}
		System.out.println("점수:" + Arrays.toString(score1) + "\n순위:" + Arrays.toString(ranking));
		
		
		
		//빈도수(자격증 관련 코딩문제에서도 많이 나오는 유형 패턴)
		System.out.println("\n--------------빈도수--------------");
		int[] target = {1,3,3,2,1,1,3,0,1,2};
		int[] ar = new int[4];	//new 를 사용하는 순간 초기값 0으로 셋팅됨
		for(int i = 0; i < target.length; i++){
			ar[target[i]]++;
		}
		System.out.println("0번부터 3번 숫자 빈도 수" + Arrays.toString(ar));
		
		//홀짝 (while과 continue의 의미를 알고있는가)
		System.out.println("\n--------------홀짝--------------");
		int a = 1;
		while(a++ <= 30){
			if(a%2 != 0)	continue;
			System.out.print(a + " ");
		}
		System.out.println();
		
		//중첩 반복문
		System.out.println("\n--------------중첩 반복문--------------");
		
		outerloop:	//continue lable
		for(int i =0; i < 4; i++){
			for(int j = 0; j < 10; j++){
				int output = i * 10 + j;
				if(output % 2 != 0){					
					// if(j == 1){
						// System.out.println();
						// continue outerloop;	//바깥 반복문으로 돌아가고 싶을때 lable을 사용한다
					// }						
				continue;
				}
				else
					System.out.print(output +"\t");
			}
			System.out.println();
		}
		
		//2차원 배열
		System.out.println("\n--------------2차원 배열--------------");
		int R = 5, C = 5;
		char[][] arr_2d = new char[][]{
			{'□','□','□','□','□'},
			{'□','□','□','□','□'},
			{'□','□','★','□','□'},
			{'□','□','□','□','□'},
			{'□','□','□','□','□'}				
		};
		
		for(int i = 0; i < R; i++){
			for(int j = 0; j < C; j++){
				System.out.print(arr_2d[i][j]);
			}
			System.out.println();
		}
		
	}
}