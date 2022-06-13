import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number №1");
        int number1 = scan.nextInt();
        System.out.println("enter the number №2");
        int number2 = scan.nextInt();
        System.out.println("enter the symbol");
        String symbol = scan.next();

        if (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("*") && !symbol.equals("/") && !symbol.equals("%")) {
            System.out.println("You enter incorrect symbol");
        } else{
            if (symbol.equals("+")) {
                sum(number1, number2);
            }
            if (symbol.equals("-")) {
                deduction(number1, number2);
            }
            if (symbol.equals("-")) {
                multiplication(number1, number2);
            }
            if (symbol.equals("/")) {
                division(number1, number2);
            }
            if (symbol.equals("%")) {
                percentage(number1, number2);
            }
        }


    }
    private static void sum(int number1, int number2){
    int result=number1+number2;
        System.out.println(result);
    }
    private static void deduction(int number1, int number2){
        int result= number1-number2;
        System.out.println(result);
    }
    private static void multiplication(int number1, int number2){
        int result=number1*number2;
        System.out.println(result);
    }
    private static void division(int number1, int number2) {
        if (number2 != 0) {
            int result = number1 / number2;
                System.out.println(result);
            } else {
                System.out.println("You can't divide by 0");
            }
        }
    private static void percentage(float number1, float number2){
        float result = (number2 / number1) * 100;
        System.out.println((int)result+"%");
    }


}
