import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Your availeble choise");
        System.out.println("1. Choise 1");
        System.out.println("2. Choise 2");
        System.out.println("Enter your choise fro, above these");
        // int n=src.nextInt();
        double area1;
        // while (n-->0){
        int choice = src.nextInt();

        switch (choice) {
            case 1:
                System.out.println("please enter redius of a circule");
                int R = src.nextInt();
                area1 = Math.PI * R * R;
                System.out.println("Area of a cicule is :");
                System.out.println(area1);
                break;
            case 2:
                System.out.println("Enter Rectangal Length");
                int L = src.nextInt();
                System.out.println("Enter Rectangal Width");
                int B = src.nextInt();
                int Area2 = L * B ;
                System.out.println("Reactangal Area is :");
                System.out.println(Area2);

        }
    }
}

