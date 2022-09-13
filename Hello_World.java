import java.util.*;
public class Hello_World {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Please Enter Your Good Name");
        String Name=src.next();
        System.out.println("Please Enter Your Age");
        int age=src.nextInt();
        System.out.println("Hello "+ Name+" Good Morning!"+ " How Are You..?");
        System.out.println("Your Age Is: "+ age+" Years");
        if (age>=18){
            System.out.println("Wow...Your Are Mechured!");
        }
        else {
            System.out.println("Sorry Your Are Not Mechured!");
            System.out.println("Please Try After Some Time");
        }
    }
}

