import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter A Number");
        int remender;
        int num=src.nextInt();
        while (num>1){
            remender=num%10;
            System.out.print(remender);
            num=num/10;
        }
    }
}
