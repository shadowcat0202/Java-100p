class Super_class{
	//Field
	private String name;
	private int age;
	private int hight;
	private int weight;	
	
	//Constructor
	Super_class(){}
	Super_class(String name, int age, int hight, int weight){
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
	}
	
	//Method
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public int getAge(){return age;}
	public void setAge(int age){this.age = age;}
	
	public int getHight(){return hight;}
	public void setHight(int hight){this.hight = hight;}
	
	public int getWeight(){return weight;}
	public void setWeight(){this.weight = weight;}
	
	public void move(){
		System.out.println("이동중");
	}
	
}

class Sub_class1 extends Super_class{
	private String unique_key;
	private int weapon;
	private double power;

	Sub_class1(){}
	Sub_class1(String name, int age, int height, int weight, String unique_key, int weapon, double power){
		super(name, age, height, weight);
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;		
	}
	
	public String getUnique_key(){return unique_key;}
	public void setUnique_key(String unique_key){this.unique_key = unique_key;}
	
	public int getWeapon(){return weapon;}
	public void setWeapon(int weapon){this.weapon = weapon;}
	
	public double getPower(){return power;}
	public void setPower(double power){this.power = power;}
	
	public void printInfo(){
		System.out.println("-------------------------------------");
		System.out.println("악당 이름:\t" + getName());
		System.out.println("악당 나이:\t" + getAge());
		System.out.println("악당 키:\t\t" + getHight());
		System.out.println("악당 체중:\t" + getWeight());
		System.out.println("악당 넘버:\t" + getUnique_key());
		System.out.println("악당 무기:\t" + getWeaponName(getWeapon()));
		System.out.println("악당 파워:\t" + getPower());
		System.out.println("-------------------------------------");
	}
	
	public String getWeaponName(int weapon_num){
		String weapon;
		switch(weapon_num){
			case 1:
				weapon = "창";
				break;
			case 2:
				weapon = "방패";
				break;
			case 3:
				weapon = "총";
				break;
			default:
				weapon = "---";
				break;			
		}
		return weapon;
	}
	
}
class Sub_class2 extends Super_class{
	
}

public class Java100_oop_Exam003{
	public static void main(String[] args){
		Sub_class1 zombi = new Sub_class1("좀비", 20, 180, 80,"20220127", 2, 99.5);
		zombi.printInfo();		
		System.out.print(zombi.getName() + " ");
		zombi.move();
	}
}