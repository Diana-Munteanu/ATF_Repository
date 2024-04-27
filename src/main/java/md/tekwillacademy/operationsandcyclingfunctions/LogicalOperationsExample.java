package md.tekwillacademy.operationsandcyclingfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        System.out.println(((877 % 5) > 1) && (true));

        System.out.println(!(((877 % 5) > 1) && (true)));

        System.out.println(false || (366 % 5) <= 0);
    }
}
