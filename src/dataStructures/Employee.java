package dataStructures;

public class Employee implements Comparable<Employee> {

    //This is my custom class
    int employeeID;
    String first_name;
    String last_name;
    int salary;

    public Employee(int employeeID, String first_name, String last_name, int salary) {
        this.employeeID = employeeID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.first_name.charAt(0) == o.first_name.charAt(0)) {
            return 0;
        } else if (this.first_name.charAt(0) > o.first_name.charAt(0)) {
            return 1;
        } else {
            return -1;
        }
    }
}
