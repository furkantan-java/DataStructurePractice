package dataStructures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ListOfList {

    public static void main(String[] args) throws IOException {
//       empID first_name   last_name   email       salary
//        100	Steven	    King	    SKING	    24000
//        101	Neena	    Kochhar	    NKOCHHAR	17000
//        102	Lex	        De Haan	    LDEHAAN	    17000
//        103	Alexander	Hunold	    AHUNOLD	    9000
        List<String> employee1 = Files.readAllLines(Paths.get("dataFiles","employeeData" , "employee1"));

        System.out.println("lst = " + employee1);
    }
}
