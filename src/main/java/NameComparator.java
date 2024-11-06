import java.util.*;

class NameComparator implements Comparator<Person> {
    public int compare(Person s1, Person s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }

}