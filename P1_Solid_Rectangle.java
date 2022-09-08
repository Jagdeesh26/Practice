import java.util.Scanner;
public class P1_Solid_Rectangle {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Please Enter How Many Rows You Want In Pettern");
        int n=src.nextInt();
        System.out.println("Please Enter How Many coloum You Want In Pettern");
        int m=src.nextInt();
        for (int i = 1 ; i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
