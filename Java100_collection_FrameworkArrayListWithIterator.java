//[!]: Iterator(반복자)
//사전적의미 --> Collection에 대한 반복자 이다
//컬렉션 프레임워크내에 는 다양한 컬렉션들이 있는데 요소(원소)를 읽어올 때 Iterator 인터페이스로 표준화 하고 있다.
//인덱스를 요소로 순회하는 for문과 달리 Iterator(반복자)를 사용하면 조금 더 편리하게 할 수 있다.

//hasNext(), next(), remove() -> 반환타입은 boolean, Object(제네릭), viod
//hasNext()		--> 다음 요소가 있는지 검사하여 true 리턴
//next()				--> 다음 요소를 리턴 --> 다음 위치로 커서 이동 --> Iterator에서는 삭제하지 않고 커서만 이동
//remove()			--> 제거

//next() 메서드의 경우 		--> 배열에 값이 없을떄 사용하면 당연히 오류 발생(주의)
//따라서 사전에 hasNext() 메서드를 사용하여 다음 요소 존재 여부 확인 후 next() 메서드로 안전하게 가져온다.

//사용 이유
//보통 컬렉션 List 요소를 반복문 안에서 돌리면서 값을 삭제혹은 추가할때 발생
//List 배열의 size(length)나 index 정보등이 변경되면서 -> 순회시 정보가 맞지 않아 오류 발생

import java.util.ArrayList;
import java.util.Iterator;

public class Java100_collection_FrameworkArrayListWithIterator{
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<>();	//뒤쪽의 제네릭 타입을 생략해도 문제없음(버전이 낮은 경우는 오류가 날 수 있다.)
		
		list1.add("악어");
		list1.add("하마");
		list1.add("기린");
		list1.add("당나귀");		
		
		System.out.println("\n-------------------------Iteraotr를 이용한 출력---------------------------");
		//Iterator 객체 생성 --> 생성 과정도 중요
		//Iterator<Tyep> valuable = List.iterator();
		Iterator<String> it = list1.iterator();
		while(it.hasNext()){
			String str = it.next();
			if("하마".equals(str))	{		
				it.remove();
				System.out.println(str+"삭제");
			}
		}
		
		System.out.println("\n-------------------------Iteraotr 사용 이유---------------------------");
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			list2.add(i);
		}		
		Iterator<Integer> it2 = list2.iterator();
		
		System.out.println("요소 삭제전");
		for(Integer num : list2){
			System.out.print(num + " ");
		}	
		System.out.println("\n요소 삭제후");
		// for(Integer i : list2){
			// if(i == 2){
				// list2.remove(i);
			// }
		// }
		//위와 같은 에러 상황을 해결하기 위해
		
		while(it2.hasNext()){
			Integer i = it2.next();
			if(i == 2){
				it2.remove();
				System.out.print(i+ "번 삭제");
			}
		}
		System.out.println();		
		
		it2 = list2.iterator();
		while(it2.hasNext()){
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		
		
	}
}