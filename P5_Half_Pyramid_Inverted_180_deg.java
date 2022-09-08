import java.util.Scanner;
public class P5_Half_Pyramid_Inverted_180_deg {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = src.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
