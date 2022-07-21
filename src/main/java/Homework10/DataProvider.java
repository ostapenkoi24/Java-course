package Homework10;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvider {
    static int rand;
    static List<String> listname = Arrays.asList("Bill", "John", "Mark","Tom", "Clark", "Harry");

    public static String getRandomName(){
        return listname.get(new Random().nextInt(listname.size()));
    }


    public static int getRandomAge() {

        return rand = new Random().nextInt(85);
    }


}
