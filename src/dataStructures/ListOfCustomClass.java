package dataStructures;


import java.util.ArrayList;
import java.util.List;

public class ListOfCustomClass {

    public static void main(String[] args) {
//       empID first_name   last_name   email       salary
//        100	Steven	    King	    SKING	    24000
//        101	Neena	    Kochhar	    NKOCHHAR	17000
//        102	Lex	        De Haan	    LDEHAAN	    17000
//        103	Alexander	Hunold	    AHUNOLD	    9000

        List<Employee>employeeList = new ArrayList<>();

        Employee e1 = new Employee(100,"Steven","King",24000);
        employeeList.add(e1);
        employeeList.add(new Employee(101, "Neena","Kochhar",17000));
        employeeList.add(new Employee(102, "Lex","De Haan",17000));
        employeeList.add(new Employee(103, "Alexander","Hunold",9000));

        System.out.println("employeeList = " + employeeList);

        System.out.println("employeeList.get(2) = " + employeeList.get(2));
    }
}
