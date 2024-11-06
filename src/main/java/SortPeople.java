import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPeople {
    public static void main(String[] args) {

        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 37, 1.70),
                new Person("Merete", "Poulsen", 26, 1.22),
                new Person("Ibsen", "Poulsen", 134, 1.20),
                new Person("Sixten", "Ottesen", 25, 1.90),
                new Person("Sixten", "Kaptajn", 26, 1.60),
                new Person("Hans", "Swan", 35, 1.70),
                new Person("Merete", "Cullen", 12, 1.22),
                new Person("Ibsen", "Mester", 57, 1.20),
                new Person("Sixten", "123", 18, 1.90),
                new Person("Sixten", "Lidl", 27, 1.60),
                new Person("Hans", "Hansen", 38, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Jensen", 54, 1.20),
                new Person("Sixten", "Aggerholm", 16, 1.90),
                new Person("Sixten", "Andersen", 24, 1.60),
                new Person("Hans", "Megatron", 31, 1.70),
                new Person("Merete", "Stjernfeldt", 15, 1.22),
                new Person("Ibsen", "Sjôdin", 54, 1.25),
                new Person("Sixten", "Zehetner", 13, 1.96),
                new Person("Sixten", "Antal", 21, 1.62),
                new Person("Hans", "Jørgensen", 36, 1.77),
                new Person("Merete", "SVEND", 13, 1.22),
                new Person("Ibsen", "Houlsen", 56, 1.24),
                new Person("Sixten", "Tottesen", 44, 1.86),
                new Person("Sixten", "Janson", 53, 1.75),
        };

        System.out.println("Usorteret liste af personer: \n ");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();


        // skriv kode herunder

        System.out.println("Sorteret liste af personer, efter alder: \n ");


        // Convert the array to a list
        List<Person> peopleList = Arrays.asList(people);

        Comparator comparatorAge = new AgeComparator().thenComparing(new NameComparator());
        Collections.sort(peopleList, comparatorAge);
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();




        System.out.println("Sorteret liste af personer, efter efternavn: \n ");
        Comparator comparatorName = new NameComparator().thenComparing(new AgeComparator());
        Collections.sort(peopleList, comparatorName);
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

    }

}
