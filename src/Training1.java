import java.util.Scanner;

public class Training1 {
    private int get_int(Object o){
        String str = String.valueOf(o);

        if(str.contains("."))
            System.out.println("실수는 반올림되어 계산됩니다");
        
        return Integer.parseInt(str);
    }

    public void Training1_1(){
        Scanner sc = new Scanner(System.in);
        float score;
        while(true){
            System.out.print("점수를 입력하세요:");
            score = Float.parseFloat(sc.nextLine());

            if(score > 100){
                System.out.println("0 <= 점수 <= 100");
                continue;
            }
            if(score >= 0)  break;
            System.out.println("[warning]점수는 음수가 될수 없습니다.");
        }

        String grade;
        if(score >= 90) grade = "A";
        else if(score >= 80) grade = "B";
        else if(score >= 70) grade = "C";
        else if(score >= 60) grade = "D";
        else    grade = "F";

        System.out.println(grade + "학점");
    }
    public void Training1_2(){  //Training1_1의 응용
        Scanner sc = new Scanner(System.in);
        float score;
        while(true){
            System.out.print("점수를 입력하세요:");
            score = Float.parseFloat(sc.nextLine());

            if(score > 100){
                System.out.println("0 <= 점수 <= 100");
                continue;
            }

            if(score >= 0)  break;
            System.out.println("[warning]점수는 음수가 될수 없습니다.");
        }

        String grade;
        if(score < 60)  grade = "F";
        else if(score < 70) grade = "D";
        else if(score < 80) grade = "C";
        else if(score < 90) grade = "B";
        else grade = "A";

        System.out.println(grade + "학점");
    }

    public void Training1_3(){
        //Tip: BMI는 [!]실수[!] 이다
        Scanner sc = new Scanner(System.in);
        System.out.print("BMI를 입력하세요:");
        float bmi = sc.nextFloat();

        String w;
        if(bmi < 18.5){
            if(bmi < 16)    w = "깡마름";
            else if(bmi < 17)   w = "마름";
            else    w = "저체중";
        }else{
            if(bmi < 25)    w = "보통 체중";
            else if(bmi < 30)   w = "비만 위험군";
            else    w = "비만";
        }

        System.out.println(w);
    }
    public void Training1_4(){  //Training1_3의 응용
        Scanner sc = new Scanner(System.in);
        System.out.print("BMI를 입력하세요:");
        float bmi = sc.nextFloat();

        String w;
        if(bmi >= 18.5){
            if(bmi >= 30)    w = "비만";
            else if(bmi >= 25)   w = "비만 위험군";
            else    w = "보통 체중";
        }else{
            if(bmi >= 17)    w = "저체중";
            else if(bmi >= 16)   w = "마름";
            else    w = "깡마름";
        }

        System.out.println(w);
    }
}
