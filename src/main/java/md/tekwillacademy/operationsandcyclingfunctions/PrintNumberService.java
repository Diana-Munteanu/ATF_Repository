package md.tekwillacademy.operationsandcyclingfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        // sum of the odd number

        int totalSum = 0;

        for (int i = 0; i <= 10000; i++) {
            System.out.println("Iterator: " + i);
            if (i % 2 == 1) {
                totalSum = totalSum + i; // totalSum = totalSum + iterator
            }
        }
        System.out.println("Total sum last one: " + totalSum);

        for (int i = 1; i <= 10; i= + 2) {
            System.out.println("i: " + i);
        }

        int a = 0;
        for (; a< 10; a++) {
            System.out.println(a+ "");
        }

        int b = 0;
        for (; b > a;) {
            System.out.println(b + "");
            b += 2;
        }
    }
}
