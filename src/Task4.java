import java.io.InputStream;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("write the number of the rows");
        int a = scanner1.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

