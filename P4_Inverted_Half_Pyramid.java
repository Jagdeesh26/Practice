import java.util.Scanner;
public class P4_Inverted_Half_Pyramid {
    public static void main(String[] args) {
                Scanner src=new Scanner(System.in);
                System.out.println("Enter The Number Hown Many Row You Are Want In Half Pyramid");
                int n=src.nextInt();

                for (int i=n; i>=1; i--){
                    for (int j=1;j<=i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }

    }

