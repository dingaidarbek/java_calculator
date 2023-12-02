package calculator;
import java.util.Scanner;
import java.util.HashMap;

public class calculator {
    // Calculator functions
    static int summation(int a, int b){
        return a + b;
    }
    static int substraction(int a, int b){
        return a - b;
    }
    static int multiplication(int a, int b){
        return a * b;
    }
    static int division(int a, int b){
        return a / b;
    }

    static void calc(){
        Scanner read = new Scanner(System.in);
        HashMap<String,String> operations = new HashMap<String, String>();
        operations.put("+", "summation");
        operations.put("-", "substraction");
        operations.put("*", "multiplication");
        operations.put(":", "division");

        // Initialization, first outcome to user to choose the operation
        System.out.println("Welcome to Java calculator!");
        while (true)
        {
            try{
            System.out.println("Please, choose one of the next operations:");
            System.out.println("Type \"+\" for summation");
            System.out.println("Type \"-\" for substraction");
            System.out.println("Type \"*\" for multiplication");
            System.out.println("Type \":\" for division");
            System.out.println("Enter your action: ");
            String action = read.next();

            System.out.println("Enter your two numbers for " + operations.get(action));

            int number1 = read.nextInt();
            int number2 = read.nextInt();
            // Calculating and returning the answer
            if (action.equals("+")){
                System.out.println(number1 + " + " + number2 + " = " + summation(number1, number2));
            }
            else if (action.equals("-")){
                System.out.println(number1 + " - " + number2 + " = " + substraction(number1, number2));
            }
            else if (action.equals("*")){
                System.out.println(number1 + " * " + number2 + " = " + multiplication(number1, number2));
            }
            else if (action.equals(":")){
                System.out.println(number1 + " : " + number2 + " = " + division(number1, number2));
            }

            System.out.println("Would you like to proceed another calculation?");
            System.out.println("Y/N:");

            String answer = read.next();
            // Check if user wants to make another calculation
            if (answer.toUpperCase().equals("Y")){
                calc();
            }
            else if (answer.toUpperCase().equals("N")){
                System.out.println("Thank you for using our calculator!");
            }
            }
            catch(Exception e){ // If user provides wrong data, an exception occurs
                System.out.println("Please, provide appropriate answers");
            }
            read.close();
            break;
        }
    }
    public static void main(String[] args){
        calc(); // Calling calculator function from main()
    }


}