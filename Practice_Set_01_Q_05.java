import java.util.Scanner;
public class Practice_Set_01_Q_05 {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner src=new Scanner(System.in);
        System.out.println(src.hasNextInt());
        if (src.hasNextInt()==true){
            System.out.println("This Is A Intiger");
        }else {
        System.out.println("This Is Not A Intiger");
    }
}
    }
