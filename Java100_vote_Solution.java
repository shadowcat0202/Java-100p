import java.util.Arrays;
class Election{	//선거
	//field
	
	//Constructor
	Election(){}
	//Method
	public void Election_init(int n, int[] vote_box){
		int[] candidate = new int[n+1]; 
		
		for(int vote : vote_box){
			candidate[vote]++;
		}
		
		for(int i = 1; i < candidate.length; i++){
			System.out.printf("%d번 후보 --> %d표\n", i,candidate[i]);
		}
		
		int res_candidate = 0;
		int max = candidate[0];
		for(int i = 1; i < candidate.length; i++){
			if(candidate[i] > max){
				max = candidate[i];
				res_candidate = i;
			}
		}
		
		Arrays.sort(candidate);
		
		System.out.println("가장 적은 득표수는" + candidate[1]);
		System.out.println("가장 많은 득표수는" + candidate[candidate.length-1]);
		
		
		System.out.println("가장많은 득표 수 --> " + max +"표이고, 후보자는 " + res_candidate + "번 후보자 입니다.");
		
		boolean majority = max > (vote_box.length / (double)2);
		
		if(majority)	System.out.println("과반수 이상 득표했습니다 --> 당선");
		else			System.out.println("과반수 이상 실패했습니다 --> 미당선");
		
	}
	
	
}
public class Java100_vote_Solution{
	public static void main(String[] args){
		Election s1= new Election();
		
		int[] vote_box = {1,3,1,3,3,2,2};
		
		s1.Election_init(3, vote_box);
		
	}
}