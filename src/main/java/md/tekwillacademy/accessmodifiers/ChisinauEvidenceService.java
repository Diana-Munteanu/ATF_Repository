package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

import java.sql.SQLOutput;

public class ChisinauEvidenceService {
    public static void main(String[] args) {

        Person Diana = new Person();
        Person Andrei = new Person("Diana Munteanu", 79404504, 65, "Unknown");
        System.out.println(Andrei.getAge());

        Diana.name = "Diana Munteanu";
        Andrei.name = "Oniscenco Andrei";

        Person raisaPacalo = new Person( "Raisa Pacalo", "F");
        System.out.println(raisaPacalo.getGender());
        System.out.println(raisaPacalo.toString());
        System.out.println("Numele obiectului raisaPacalo: " + raisaPacalo.name);

        System.out.println(Person.nationality);
        Person.nationality = "Moldovean";
        System.out.println(Person.nationality);
    }
}
