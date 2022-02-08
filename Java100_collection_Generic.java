//모든 타입을 다 받는 클래스 작성 Object
class Sample_G<T>{	//제네릭의 개념이해
	private T obj;	//T(ype)의 약어 포괄적인 의미
	Sample_G(T x){	this.obj = x;	}
	T getObj(){	return obj;	}	
	void printinfo(){	System.out.println(obj.getClass().getName());	}
}

class Sample{
	private Object obj;
	
	Sample(Object x){	this.obj = x;	}
	
	public Object getObj(){	return obj;	}
	
	void printinfo(){	System.out.println(obj.getClass().getName());	}
}
public class Java100_collection_Generic{
	public static void main(String[] args){		
		System.out.println("문자열로 받기");
		Sample s1 = new Sample("안녕하세요");
		System.out.println(s1.getObj());
		s1.printinfo();
		
		System.out.println("\n숫자로 받기");
		Sample s2 = new Sample(100);
		System.out.println(s2.getObj());
		s2.printinfo();
		
		System.out.println("\n오브젝트로 받기");
		Sample s3 = new Sample(new Object());
		System.out.println(s3.getObj());
		s3.printinfo();
		
		//위와 같은 파라미터 타입에 대한 문제(클래스 내부의 타입 수정을 할 필요 없게)를 해결하기 위해
		//Object-->모든 타입의 super클래스로 받아버림
		
		//받을때는 제네릭 Object로 사용하는건 문제가 크지 않지만 return할때는 생성한 변수의 타입으로 형변환 해서 return받아야한다
		String str = (String)s1.getObj();	//return시 반환 타입이 Object이므로 형변환 해야함
		int num = (int)s2.getObj();
		//Object str = s1.getObj(); 로 받아도 간단한 출력은 크게 문제가 없지만
		//str.length()를 사용할때 Err가 뜬다, int 는 연산을 못한다
		//★이러한 문제들은 super sub 클래스의 기본 개념을 이해하면 왜 형변환을 해야 정상적으로 사용할수 있는지 알 수 있다.
		//super 클래스로 생성하면 sub 클래스의 메서드는 사용할 수 없다
		
		
		//Class<T> var = new Class<T>();
		System.out.println("\n--------------------제네릭 기본-------------------");
		Sample_G<String> g1 = new Sample_G<String>("안녕하세요");			
		System.out.println(g1.getObj());
		g1.printinfo();
		
		System.out.println("------------------------------------------");
		Sample_G<Integer> g2 = new Sample_G<Integer>(100);
		g2.printinfo();
		
		System.out.println("--------------------형번환 없이----------------");
		System.out.println(g1.getObj().length());
	}
}