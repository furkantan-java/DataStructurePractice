package dataStructures;

public class Person implements Comparable<Person> {

    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //ternary operator
//        return (this.name.compareTo(o.name) == 0) ?
//                Integer.compare(this.age, o.age) : this.name.compareTo(o.name);
        //true                              false

        //if else statement
        if (this.name.compareTo(o.name) == 0) {
            return Integer.compare(this.age, o.age);
        } else {
            return this.name.compareTo(o.name);
        }

//        if (this.name.charAt(0) == o.name.charAt(0)) {
//            if (this.age > o.age) {
//                return 1;
//            } else if (this.age < o.age) {
//                return -1;
//            } else {
//                return 0;
//            }
//        } else if (this.name.charAt(0) > o.name.charAt(0)) {
//            return 1;
//        } else {
//            return -1;
//        }


    }
}
