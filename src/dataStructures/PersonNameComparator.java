package dataStructures;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
//        if(o1.name.charAt(0) > o2.name.charAt(0)){
//            return 1;
//        } else if(o1.name.charAt(0) == o2.name.charAt(0)){
//            return 0;
//        } else {
//            return -1;
//        }
    }
}
