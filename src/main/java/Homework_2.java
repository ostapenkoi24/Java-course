import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number №1");
        int number1 = scan.nextInt();
        System.out.println("enter the number №2");
        int number2 = scan.nextInt();
        System.out.println("enter the symbol");
        String symbol_action = scan.next();
        float result_1;
        int result;


        //start
//        if (!symbol_action.equals("+") && !symbol_action.equals("-") && !symbol_action.equals("*") && !symbol_action.equals("/") && !symbol_action.equals("%")) {
//            System.out.println("You enter incorrect symbol");
//        } else {
//            if (symbol_action.equals("+")) {
//                result = number1 + number2;
//                System.out.println("result: " + result);
//            }
//            if (symbol_action.equals("-")) {
//                result = number1 - number2;
//                System.out.println("result: " + result);
//            }
//            if (symbol_action.equals("*")) {
//                result = number1 * number2;
//                System.out.println("result: " + result);
//            }
//            if (symbol_action.equals("/")) {
//                if (number2 != 0) {
//                    result = number1 / number2;
//                    System.out.println("result: " + result);
//                } else {
//                    System.out.println("You can't divide by 0");
//                }
//            }
//                if (symbol_action.equals("%")) {
//                    result = (number2 / number1) * 100 ;
//                    System.out.println("result: " + result + "%");
//                }
//        }
        //end

        //start with switch
        switch (symbol_action) {
            case "+":
                result = number1 + number2;
                System.out.println("result: " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println("result: " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println("result: " + result);
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("You can't divide by 0");
                }

                break;
            case "%":
                result_1 = ((float) number2 / (float) number1) * 100;
                System.out.println("result: " + result_1 + "%");
                break;
            default:
                System.out.println("You enter incorrect symbol");

        }
    }    }
