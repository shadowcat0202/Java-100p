//컬렉션(Collection) 프레임워크란 무엇인가?

//[0]: 컬렉션 사전학습
//OOP, sbstract class, Interface, Generic 등

//[1]: Collection Framework란?
//"수집품" 이라는 사전적 의미 → "데이터 값들을 담는 여러 그릇"
//작성할 프로그램의 데이터 처리를 어떻게 할지 그 특징을 잘 파악하여 컬렉션 내 맞는 그릇(클래스)을 잘 골라 써야한다.
//컬렉션 프레임워크는 크게 봤을때 → Collection과 Map → 이 둘은 모두 Interface로 되어있다.

//Collection은 List와 Set으로 나누어진다 → 이들도 Interface → 이들을 상속받아 다양한 형태의 배열로 사용된다.

//[2]: Collection
//Collection(인터페이스) → 상속 → List와 Set 으로 구분 → 상속 → List 계열 구현 클래스 VS Set 계열 구현 클래스
//List 계열 구현 클래스 → ArrayList, LinkedList, Vector, Stack
//Set 계열 구현 클래스 → HashSet, SortedSet, TreeSet

//[3]: List vs Set
//List → 1.인덱스 2.저장 순서 유지 3.데이터 중복 허용
//Set → 1.데이터 중복 비허용


//[!]: ArrayList
//기본 배열과 달리 ArrayList는 동적이다(원하는 만큼 추가, 삭제 가능)
//저장 순서 유지, 데이터 중복 가능
//제너릭 문법 사용 가능 → 제네릭을 사용하지 않는다면 내부적으로 Object타입으로 처리 된다
//import 가 필요하다

import java.util.ArrayList;

class Person{}

public class Java100_collection_FrameworkBasic{
	public static void main(String[] args){
		//[1]:제네릭이 아닌 Object 타입으로 사용하는 경우(타입이 명확하지 않으므로 경고가 나올 수 있다)
		ArrayList list1 = new ArrayList();
		
		//데이터 추가 → add();
		list1.add("문자열");
		list1.add(20);
		list1.add("홍길동");
		list1.add(20);		//중복가능
		list1.add(new Person());		
		
		//[3]:데이터 가져오기
		String str = (String)list1.get(0);		//Object타입으로 사용하는 중이기 때문에 형변환이 필요하다
		int num = (int)list1.get(1);				//Object타입으로 사용하는 중이기 때문에 형변환이 필요하다
		
		
		//[1]:제네릭으로 사용하는 경우
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("이순신");
		list2.add("강감찬");
		list2.add("을지문덕");
		list2.add("김유신");
		str = list2.get(0);							//형변환 없이 바로 사용 → 타입 안정성 상승
		System.out.println(str);
		//int test = (int)list2.get(0);				//컴파일 단계에서 오류 발견 가능
		
		//[2]:삽입 --> set(인덱스, 수정값);
		list2.set(2,"와우");

		//[3-1]:삭제 --> remove(인덱스);
		list2.remove(1);		
		
		//[4]:출력
		for(String name : list2){
			System.out.println(name);
		}
		
		//[3-2]: 한꺼번에 삭제 -->ArrayListName.removeAll(ArrayListName); -->앞쪽 ArrayLIstName은 안적어도 문제는 없지만 경고 뜸(불안정함)
		list2.removeAll(list2);
		System.out.println(list2.size());
		
		
		
		//[5]:ArrayLIst 기반의 2D array
		System.out.println("\n-----------------------ArrayList 의 2차원 배열--------------------");
		ArrayList<Integer[]> arr2d = new ArrayList<Integer[]>();	//객체 생성
		arr2d.add(new Integer[] {11,12,13,14});
		arr2d.add(new Integer[] {21,22,23,24});
		arr2d.add(new Integer[] {31,22,33,34});
		
		for(int i = 0; i < arr2d.size(); i++){
			System.out.println(arr2d.get(i)[0]);	//각 배열의 첫번째 값
		}
		
		//전체 요소 출력 -> 2중 반복문 -> 안쪽 배열의 사이즈 사전 체크[!]주의
		//System.out.println(arr2d.get(0).size());		//Err --> 컬렉션 프레임워크 타입의 길이를 알고 싶을때
		//System.out.println(arr2d.get(0).length());	//Err	--> 문자열의 길이를 알고 싶을때
		//System.out.println(arr2d.get(0).length);		//Err	--> 배열(int[], Integer[], String[])의 길이를 알고 싶을때
	
		System.out.println("\n-----------------------ArrayList 의 2차원 배열 전체의 요소 출력----------------------------");
		for(int i = 0; i< arr2d.size(); i++){
			for(int j = 0; j < arr2d.get(i).length; j++){
				System.out.print(arr2d.get(i)[j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n-----------------------ArrayList 의 2차원 배열 전체의 요소 출력(향상된 for문)----------------------------");
		for(Integer[] arr : arr2d){
			for(Integer Element : arr){
				System.out.print(Element + " ");
			}
			System.out.println();
		}
	
	}
}