package dataStructures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfListExample {

    public static void main(String[] args) throws IOException {
        List< List<String> > list = new ArrayList<>();

        List<String>groceryList = Files.readAllLines(Paths.get("dataFiles","grocery"));
        System.out.println("groceryList = " + groceryList);
        List<String>carList = Files.readAllLines(Paths.get("dataFiles","cars"));
        List<String>countryList = Files.readAllLines(Paths.get("dataFiles","countries"));
        List<String>emailList = Files.readAllLines(Paths.get("dataFiles","emails"));
        List<String>SSNnumbersList = Files.readAllLines(Paths.get("dataFiles","SSNnumbers"));

//        list.add(groceryList);
//        list.add(carList);
//        list.add(countryList);
//        list.add(emailList);
//        list.add(SSNnumbersList);

        list.addAll(Arrays.asList(groceryList,carList,countryList,emailList,SSNnumbersList));

        System.out.println("list = " + list);

        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.get(2).get(8) = " + list.get(2).get(8));

        System.out.println("list.size() = " + list.size());


    }
}
