import java.util.Scanner;
public class Practice_Set_05 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num= src.nextInt();
        // q.1
//        for (int i=num;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    // q.2 write a program to sum first n even numbers using for loop.
//        int sum=0;
//        System.out.print("Your First "+num+" Even Numbers are: ");
//        for (int i=0;i<num;i++) {
//            int even=2*i;
//            System.out.print(" "+even);
//            sum=sum+(2*i);
//        }
//        System.out.println();
//        System.out.print("Your first even number sum is : " +sum );

        // q.3 wtite a program to print multipilaction table of given number
//        System.out.println("Table Of "+num);
//        for (int i=1;i<=10;i++){
//            int table=i*num;
//            System.out.printf("%d * %d = %d\n",i,num,table);
//        }
        //q.4 wtite a program to print multipilaction table of given number in reverse order
//                System.out.println("Table Of "+num);
//                for (int i=10;i>=1;i--){
//                    int table=i*num;
//                    System.out.printf("%d * %d = %d\n",i,num,table);
//                }
        // Q. 5 find factorial of given number
//        int fact=1;
//        for (int i=num;i>=1;i--){
//            System.out.print(i+" * ");
//            fact =fact*i;
//        }
//        System.out.print("= "+fact);
        // Q. 6 repet 5 using while loops
//        int loop=1;
//        while (loop<=6){
//            System.out.println("Reapet");
//            loop++;
//        }
        //q.7
//          int i=1;
//            while (i<=num){
//                System.out.print("*");
//                i++;
//            }    while (i<=num-1){
//            System.out.print("*");
//            i++;
//        } while (i<=num-2){
//            System.out.print("*");
//            i++;
//        } while (i<=num-3){
//            System.out.print("*");
//            i++;
//        }
        //

        // q. 9
//        int sum=0;
//        System.out.println("Table Of "+num);
//        for (int i=1;i<=10;i++){
//            int table=i*num;
//             sum+=table;
//            System.out.printf("%d * %d = %d\n",i,num,table);
//        }
//        System.out.printf("Sum Of All %d Table number is : %d ",num,sum);

        // q.10
//        int a=1;
//        do {
//            System.out.println("Jagdeesh");
//            a++;
//        }while (a<=2);
        // q.11
//         int sum=0;
//         int i=1;
//        while (i<=10){
//            int table=i*num;
//           sum+=table;
//            System.out.println(table);
//            i++;
//        }
//        System.out.println("sum " +sum);
        // q 12
       /* int sum=0;
         int i=1;
        while (i<=num){
            int table=i;
           sum+=table;
            System.out.println(table);
            i++;
        }
        System.out.println("sum " +sum);*/
        // q. 14
        int i=1,j=1;
        while (num>=i){
            System.out.print("*");
            num--;
            }

    }
        }


