import java.util.Scanner;
public class P6_Half_Pyramid_With_Numbers {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=src.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
