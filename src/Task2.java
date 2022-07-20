import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("napishite vremya");
        double a = scanner1.nextInt();
        if (a >= 8.00 && a <= 8.29) {
            System.out.println("podyom");
        } else if (a >= 8.30 && a <= 8.59) {
            System.out.println("zaryadka");
        } else if (a >= 9.00 && a <= 9.39){
            System.out.println("zavtrak");
        } else if (a >= 9.40 && a <= 9.59){
            System.out.println("turi tayak");
        }else if (a >= 10.00 && a <= 12.59){
            System.out.println("uroki");
        }else if (a >= 13.00 && a <= 13.59){
            System.out.println("obed");
        }else if (a >= 14.00 && a <= 15.59){
            System.out.println("master class");
        }else if (a >= 16.00 && a <= 16.29){
            System.out.println("poldnik");
        }else if (a >= 16.30 && a <= 18.29){
            System.out.println("otryadnoe vremya");
        }else if (a >= 18.30 && a <= 19.59){
            System.out.println("uzhin");
        }else if (a >= 20.00 && a <= 22.59){
            System.out.println("vechernee meropriyatiye");
        }else if (a == 23.00) {
            System.out.println("otboy");

        }
    }
}

