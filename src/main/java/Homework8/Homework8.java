package Homework8;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Homework8 {
    public static void string(String str) {
        String result = str.toLowerCase();
        String[] string = result.split(", ");
        Set<String> set = new TreeSet<>(Arrays.asList(string));

        for (String s : set) {
            String a = StringUtils.capitalize(s);
            System.out.println(a);
        }
    }
}
