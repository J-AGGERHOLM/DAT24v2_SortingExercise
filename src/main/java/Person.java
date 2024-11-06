import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public static final Comparator<Person> YEAR_COMPARATOR = Comparator.comparingInt(Person::getAge);

    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Fornavn: " + getFirstName() + ", Efternavn: " + getLastName() + ", Alder: " + getAge() + ", Højde: " + getHeight();
    }


    @Override
    public int compareTo(Person o) {
        int result = 0;
        if (this.getAge() == o.getAge())
            result = 0;
        if (this.getAge() > o.getAge())
            result = 1;
        if (this.getAge() < o.getAge()) {
            result = -1;
        }
        return result;
    }
}


