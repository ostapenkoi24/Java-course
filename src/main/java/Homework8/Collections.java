package Homework8;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        String str = "масло, Масло, колбаса, молоко, Колбаса";;
        String result = str.toLowerCase();
        Collections.string(result);
    }
    public static void string(String str) {


        String[] string = str.split(", ");

        Set<String> set = new TreeSet<>(Arrays.asList(string));

        for (String s : set) {
            String a = StringUtils.capitalize(s);

            System.out.println(a);
        }

    }
    public String register(String w){
        return w.toLowerCase();
    }

}