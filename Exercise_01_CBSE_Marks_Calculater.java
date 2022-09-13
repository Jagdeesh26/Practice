import java.util.Scanner;
public class Exercise_01_CBSE_Marks_Calculater {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter Number of Hindi : ");
        int Hindi=src.nextInt();
        System.out.print("Enter Number of English : ");
        int English=src.nextInt();
        System.out.print("Enter Number of Maths : ");
        int Maths=src.nextInt();
        System.out.print("Enter Number of Chemistry : ");
        int Chemistry=src.nextInt();
        System.out.print("Enter Number of Physics : ");
        int Physics=src.nextInt();
        int Total = Hindi+English+Maths+Chemistry+Physics;
        if (Hindi>=33&&English >=33&&Maths>=33&&Chemistry>=33&&Physics>=33){
            System.out.println("Congrats...! You Are Cracked This Exam.");
        }
        else {
        System.out.println("You Are Not Cracked This Exam. Try Again With A Better Fight.");
        }
            System.out.println("Your Total Marks Is : " + Total);
            int Percentage = (Hindi + English + Maths + Chemistry + Physics) / 5;
            System.out.print("Your Total Percentage Is : " + Percentage + "%");
        }
}

