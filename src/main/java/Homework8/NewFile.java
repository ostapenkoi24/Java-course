package Homework8;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class NewFile {
//private static String result;
//    private static String a;

    public static void main(String[] args) {
//        NewFile d=new NewFile();
 ;
        NewFile.string("масло, масло, колбаса, молоко");
//        System.out.println(result);


        }

//        for (String s : d){
//            String a = StringUtils.capitalize(s);}
//



    

    public static void string(String str) {

        String[] string = str.split(", ");
//        List<String> list = new ArrayList<>(Arrays.asList(string));
        Set<String> set = new TreeSet<>(Arrays.asList(string));

        for (String s : set) {
            String a = StringUtils.capitalize(s);
            System.out.println(a);
        }}}

//        return string;

    
//    public static void x(String result){
//        result=NewFile.result;
//        for (String s : result){
//            String n = StringUtils.capitalize(s);}
//    }



