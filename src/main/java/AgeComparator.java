import java.util.*;

class AgeComparator implements Comparator<Person> {

    public int compare(Person s1, Person s2) {
        if (s1.getAge() == s2.getAge())
            return 0;
        else if (s1.getAge() > s2.getAge())
            return 1;
        else
            return -1;
    }
}