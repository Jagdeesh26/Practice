import java.util.Scanner;
public class Practice_Set_01_Q_04 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter Value In Kilometer : ");
        double km = src.nextFloat();
        double mi = km * 0.6214;
        System.out.println("After Converting Kilometers To Miles");
        System.out.println(mi+" Mile In "+km+" Kilometers");
    }
}
