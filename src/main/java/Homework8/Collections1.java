package Homework8;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class Collections1 {
    public static void main(String[] args) {

        String str = "масло, масло, колбаса, молоко";


        String[] string = str.split(", ");
        System.out.println(Arrays.toString(string));


         List<String> list = new ArrayList<>(Arrays.asList(string));
//        list.add("масло");
//        list.add("масло");
//        list.add("колбаса");
//        list.add("молоко");

        Set<String> set = new TreeSet<>(list);
        for (String s : set) {
            String a = StringUtils.capitalize(s);
            System.out.println(a);
        }


        }
    }





