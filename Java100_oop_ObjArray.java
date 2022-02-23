class Person{
	//Field
	private String name;
	private int age;
	//Constructor
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Method
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public int getAge(){return age;}
	public void setAge(int age){this.age = age;}
	
	
}

public class Java100_oop_ObjArray{
	public static void main(String[] args){
		Person[] peoples = new Person[5];
		peoples[0] = new Person("홍길동", 20);
		peoples[1] = new Person("이순신", 30);
		peoples[2] = new Person("장발장", 24);
		peoples[3] = new Person("정약용", 55);
		peoples[4] = new Person("이사부", 43);
		
		
		for(int i = 0; i < 5; i++){
			//System.out.println(peoples[i]);
			System.out.printf("이름:%s\t나이:%d\n",peoples[i].getName(), peoples[i].getAge());
		}
	}
}