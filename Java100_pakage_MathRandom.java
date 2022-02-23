import java.util.Arrays;
public class Java100_pakage_MathRandom{
	public static void main(String[] args){
		//랜덤 숫자 10개 (단 0은 나오면 안된다)
		for(int c = 0; c < 10; c++){			
			for(int i = 0; i < 10; i++){
				System.out.print(((int)(Math.random() * 99) + 1) + "\t");
			}
			System.out.println();
		}
	}
}