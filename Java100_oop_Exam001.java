public class Java100_oop_Exam001{
	public static String[] ex1(String _str1, String _str2){
		String str1 = _str1.toLowerCase();
		String str2 = _str2.toUpperCase();
		return new String[] {str1, str2};
	}
	
	public static void main(String[] args){
		System.out.println("ex1:");
		String[] ex1_res = ex1("korea", "USA");
		System.out.println(ex1_res[0] + " - " + ex1_res[1]);
	}
}