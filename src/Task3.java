import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("write the number of the rows");
        int a = scanner1.nextInt();
        System.out.println("write the number of the symbols in the row");
        int b = scanner1.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
     }
 }




