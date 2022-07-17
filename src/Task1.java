import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write random number");
        int a = scanner1.nextInt();
        if (a <= 31) {
            System.out.println("January");
        } else if (a <= 59) {
            System.out.println("February");
        } else if (a <= 90) {
            System.out.println("March");
        } else if (a <= 120) {
            System.out.println("April");
        } else if (a <= 151) {
            System.out.println("May");
        } else if (a <= 181) {
            System.out.println("June");
        } else if (a <= 212) {
            System.out.println("July");
        } else if (a <= 243) {
            System.out.println("August");
        } else if (a <= 273) {
            System.out.println("September");
        } else if (a <= 304) {
            System.out.println("October");
        } else if (a <= 334) {
            System.out.println("November");
        } else if (a <= 365) {
            System.out.println("December");
        } else if (a > 365) {
            System.out.println("Incorrect date");
        }
    }
}












