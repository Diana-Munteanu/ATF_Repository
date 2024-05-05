package md.tekwillacademy.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        Customer marcelCustomer = new Customer();
        marcelCustomer.setId(DataGeneratorUtil.generateRandomInt(9999999));
        marcelCustomer.setName("Marcel");
        marcelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
        marcelCustomer.setAddress("Str. Petricani 100");


        Customer ionelCustomer = new Customer(990, "Ionel Bujorel", "Str. Bucuriei 45");
        ionelCustomer.setId(DataGeneratorUtil.generateRandomInt(9999999));
        ionelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
        ionelCustomer.setName("Istrate");
        ionelCustomer.setAddress("Str. Bucuriei 45");

        System.out.println(marcelCustomer.getId());
        System.out.println(ionelCustomer.getId());
        System.out.println(ionelCustomer.getAge());

        System.out.println(DataGeneratorUtil.generateRandomInt(60));
        System.out.println(DataGeneratorUtil.generateRandomInt(40));
        System.out.println(DataGeneratorUtil.generateRandomInt(10,11));

        System.out.println(DataGeneratorUtil.returnRandomString("gmail.com"));
        System.out.println(DataGeneratorUtil.returnRandomString());

    }
}
