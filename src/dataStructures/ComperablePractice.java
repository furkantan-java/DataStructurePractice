package dataStructures;

import java.util.*;

public class ComperablePractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 20, 54, 68, 0, -8);
        System.out.println("BEFORE SORTING");
        System.out.println("numbers = " + numbers);
        Collections.sort(numbers);
        System.out.println("AFTER SORTING");
        System.out.println("numbers = " + numbers);

        List<String> names = Arrays.asList("Zebra", "Girrafe", "Dog", "Cat", "Mouse");
        System.out.println("BEFORE SORTING");
        System.out.println("names = " + names);
        Collections.sort(names);
        System.out.println("AFTER SORTING");
        System.out.println("names = " + names);

//        List<Employee> employeeList = new ArrayList<>();
//        Employee e1 = new Employee(100, "Steven", "King", 24000);
//        Employee e2 = new Employee(101, "Neena", "Kochhar", 17000);
//        Employee e3 = new Employee(102, "Lex", "De Haan", 17000);
//        Employee e4 = new Employee(103, "Alexander", "Hunold", 9000);
//
//        employeeList.addAll(Arrays.asList(e1, e2, e3, e4));
//        System.out.println("BEFORE SORTING");
//        System.out.println("employeeList = " + employeeList);
//        Collections.sort(employeeList);
//        System.out.println("AFTER SORTING");
//        System.out.println("employeeList = " + employeeList);


        List<Person> people = new ArrayList<>();
        people.add(new Person("Judith", 30));
        people.add(new Person("Carl", 20));
        people.add(new Person("Alex", 60));
        people.add(new Person("Alex", 60));
        people.add(new Person("Ellie", 25));

        System.out.println("BEFORE SORTING");
        System.out.println("people = " + people);
        //Comparator<Person>nameComparator = new PersonNameComparator();
        //Collections.sort(people);
        //Collections.sort(people,nameComparator);

        Comparator<Person>nameComparator = Comparator.comparing(person -> person.name);
        Comparator<Person>ageComparator = Comparator.comparing(person -> person.age);
        //Collections.sort(people,ageComparator.reversed());
        Collections.sort(people,nameComparator.thenComparing(ageComparator));
        System.out.println("AFTER SORTING");
        System.out.println("people = " + people);

    }

}
