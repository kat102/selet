import jdk.swing.interop.SwingInterOpUtils;

public class Task8 {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[10];

        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i + 1;
        }
        for (int current : arrayOfInts) {
            System.out.print(current + ", ");
        }
        //1
        int maxElement = arrayOfInts[0];
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] > maxElement) {
                maxElement = arrayOfInts[i];
            }
        }
        System.out.println();
        System.out.println("The biggest element is " + maxElement);

        //2
        int minElement = arrayOfInts[0];
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minElement) {
            }
        }
        System.out.println();
        System.out.println("The smallest element is " + minElement);

        //3
        int sum = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            sum = sum + arrayOfInts[i];
        }
        System.out.println();
        System.out.println("The middle number of arrayOfInts is " + (double) sum / arrayOfInts.length);
    }
}






