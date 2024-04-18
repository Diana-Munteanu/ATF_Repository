package md.tekwillacademy.classesandobjects.autoservicetask;
public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str. Calea Orheiului 147", 3, 220);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        autoLux.address = "Str. Stefan cel Mare";
        autoLux.dimensionSqFt = 250.6;
        autoLux.numberOfBoxes = 5;
        System.out.println("Informatii despre obiectul autoLux de pe adresa " + autoLux.address + " cu dimensiunea " + autoLux.dimensionSqFt + " si numarul de boxe " + autoLux.numberOfBoxes);

        Tool hummer012 = new Tool("Hummer");
        System.out.println(hummer012.nameOfTheTool);

        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTheTool);

        Worker ionel = new Worker("Ion");
        System.out.println(ionel.pricePerHour);
        ionel.yearsOfExperience = 5;
        System.out.println(ionel.yearsOfExperience);

        Worker marcel = new Worker();

        Car NicoletasCar = new Car("Ferrari", "red", 3, 4500);
        System.out.println(NicoletasCar.make);

        Car AdriansCar = new Car ("Mercedes", "black", 3, 5000);
        System.out.println(AdriansCar.colorOfTheCar);
    }
}
