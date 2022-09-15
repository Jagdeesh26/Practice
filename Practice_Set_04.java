import java.time.Year;
import java.util.Scanner;
public class Practice_Set_04 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        //Q.1 error in this question
        /*int a=10;
        if (a=11){
            System.out.println("I Am 11");
        }else {
            System.out.println("I Am Not 11");
        }
         */
        //Q.2
        /*System.out.println("Enter Your Hindi Marks");
        float Hindi=src.nextFloat();
        System.out.println("Enter Your English Marks");
        float English=src.nextFloat();
        System.out.println("Enter Your Maths Marks");
        float Maths=src.nextFloat();
        float Total=Hindi+English+Maths;
        float Total_In_Per=(Hindi+English+Maths)/3;
        System.out.println("Your Total Marks Is: "+Total);
        System.out.println("Your Total Percentage Is: "+Total_In_Per+"%");
        if (Total_In_Per>40 && Hindi>33&&English>33&& Maths>33){
            System.out.println("You Are Passed");
        }else {
            System.out.println("Youn Are Failed");
            if (Hindi<33){
                System.out.println("Beacuse...Your Hindi Marks Is Less Than 33");
            } else if (English<33) {
                System.out.println("Beacuse...Your English Marks Is Less Than 33");
            }else if (Maths<33){
                System.out.println("Beacuse...Your English Marks Is Less Than 33");
            }
        }

         */
        //Q.3
      /*  System.out.println("Enter Your Income");
        float income=src.nextFloat();
         float tax= 0;
         if (income<=2.5f){
             tax=tax+0;
         } else if (income> 2.5f && income<=5.0f) {
                tax=tax+0.05f*(income-2.5f);
         } else if (income>5.0f && income<=10.0f) {
             tax=tax+0.05f*(5.0f-2.5f);
              tax=tax+0.2f*(income-5.0f);
         } else if (income>10.0f) {
             tax=tax+0.05f*(5.0f-2.5f);
             tax=tax+0.2f*(10.0f-5.0f);
             tax=tax+0.3f*(income-10.0f);
         }
        System.out.println("Tax Paid By You: "+tax);

       */
        // Q.4
       /* System.out.print("Enter A Number Of Find Out Day: ");
        int day=src.nextInt();
        if (day<7){
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednusday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Suturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }}else {
            System.out.println("Enter A Valid Number");
        }

        */
        //Q. 5
    /*
        System.out.println("Enter A Year");
        int Year= src.nextInt();
        if ((Year%400==0)||((Year%4==0)&&(Year%100!=0))){
            System.out.println(Year+" Is A Leap Year");
        }else {
            System.out.println("This Is Not A Leap Year");
        }

     */
        //Q.6
       /* System.out.println("Enter Your Website");
        String Website=src.next();
        if (Website.endsWith(".com")){
            System.out.println("This Is A Commercial Website");
        } else if (Website.endsWith(".in")) {
            System.out.println("This Is A Indian Website");
        } else if (Website.endsWith(".org")) {
            System.out.println("This Is A Organization Website");
        }else {
            System.out.println("Please Enter Valid Input");
        }

        */

    }


}
