package Homework10;

import java.util.Random;

public class Test {
    static Random rand;
    public static void main(String[] args) {

    String name = DataProvider.getRandomName();
        System.out.println("Name: " + name);

        int age = DataProvider.getRandomAge();
        System.out.println(age + " years old");



    }
}
