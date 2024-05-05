package md.tekwillacademy.methodstask;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;

    //Definim Setters pentru proprietatile clasei Customer
    public void setId(int idFormalParam) {
        id = idFormalParam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int ageInput) {
        if ((ageInput > 0) && (ageInput <= 115)) {
            age = ageInput;
        } else {
            System.out.println("The age is invalid, please add another age");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // O alta tehnica de atribuirea valorilor proprietatilor private este prin constructor cu parametri
    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer() {
    }

    //Definim Getters pentru proprietatile clasei Customer

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
