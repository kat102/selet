public class Task7 {
    public static void main(String[] args) {

        //1
        int[] arrayOfInts = new int[10];

        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i + 1;
        }

        for (int current : arrayOfInts) {
            System.out.print(current + ", ");
        }
        System.out.println();

        //2
        int[] arraOfInts = new int[10];

        for (int i = 0; i < arrayOfInts.length; i++) {
            arraOfInts[i] = (i + 1) * 2;
        }

        for (int current : arraOfInts) {
            System.out.print(current + ", ");
        }
        System.out.println();

        // 3
        int[] arrOfInts = new int[10];
        int b = 1;// присвоение

        for (int i = 0; i < arrOfInts.length; i++) {
            arrOfInts[i] = b;
            b += 2;
        }

        for (int current : arrOfInts) {
            System.out.print(current + ", ");
        }
        System.out.println();

        //4
        int[] arOfInts = new int[10];

        for (int i = 0; i < arOfInts.length; i++) {
            arOfInts[i] = (i + 1) * (i + 1);
        }

        for (int current : arOfInts) {
            System.out.print(current + ", ");
        }
        System.out.println();

        //5
        int[] aOfInts = new int[10];

        for (int i = 0; i < aOfInts.length; i++) {
            if (i % 2 == 0) {
                aOfInts[i] = 1;
            } else {
                aOfInts[i] = -1;
            }
        }
        for (int current : aOfInts) {
            System.out.print(current + ", ");
        }
        System.out.println();

        //6
        int[] ofInts = new int[10];


        ofInts[0] = 1;
        for (int i = 1; i < ofInts.length; i++) {
            ofInts[i] = (i + 1) * ofInts[i - 1];
        }

        for (int current : ofInts) {
            System.out.print(current + ",  ");
        }
        System.out.println();

        //7
        int[] fInts = new int[10];

        fInts[0] = 1;
        fInts[1] = 1;
        fInts[2] = fInts[0] + fInts[1];
        fInts[3] = fInts[1] + fInts[2];
        for (int i = 2; i < fInts.length; i++) {
            fInts[i] = fInts[i-1] + fInts[i-2];
        }

        for (int current : fInts) {
            System.out.print(current + ", ");
        }
        System.out.println();

    }
}








