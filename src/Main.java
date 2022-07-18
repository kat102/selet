import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("j");

        //тип переменной строка ( всегда в двойных кавычках)
        String newVariable = "New string";
        //тип переменной  целочисленное число
        int newInt = 5;
       //тип переменной символ (всегда в одинарных кавычках)
        char newChar = '!';
        //тип переменной число с точкой ( точка вместо запятой/больше чем float)
        double newDouble = 3.5;
        //тип переменной БАААЛЬШОЕ число
       long newLong = 990;
       //тип переменной  "а не врешь ли ты мне?"
       boolean newBooLean = true;
       boolean isPrime = 7 % 2 == 0;//== = равняется ли
       boolean isntPrime = 7 % 2 != 0;//!= = не равняется ли

        //логический блок
        if (7 > 2) {
            System.out.println("DA.");
        } else {
            System.out.println("NET.");
        }

        Random random = new Random();
        int amountOfYears = random.nextInt(20);
        System.out.println(amountOfYears);
         if  (amountOfYears > 9 && amountOfYears < 19) {
            System.out.println("DA.");
        } else {
            System.out.println("NET.");
        }















    }
}
