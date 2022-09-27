package util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataUserProvider {
    static List<String> listname = Arrays.asList("Bill", "Mark","Tom");

    public static String getName(){
        return listname.get(new Random().nextInt(listname.size()));
    }
}
