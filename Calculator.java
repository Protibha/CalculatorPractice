import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String continueCalculator; // isme store karna hai result

        // Infinite loop to keep the calculator running until the user decides to quit
        // Prompt the user to enter two numbers
        // Prompt the user to choose an operation
        // Perform the selected operation using a switch statement
        // Display the result if the operation was valid
        // Ask the user if they want to perform another calculation
        //TODO
        do {
            int result;
            System.out.println("Enter te first Number");
            int firstNumber = sc.nextInt();

            System.out.println("Enter the second number");
            int secondNumber = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the operation. Which operation do you want to " +
                    "choose:+ or - or / or *");
            String choice = sc.nextLine();

            switch (choice) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println("Result: " + result);
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println("Result: " + result);
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println("Result: " + result);
                    break;

                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Error");
                        break;
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("Result: " + result);
                        break;
                    }
                default:
                    System.out.println("The operation is wrong");
                    break;
            }
            System.out.println("Do you want to continue calaculation? Type yes or no");
            continueCalculator=sc.nextLine();
        }
        while (continueCalculator.equals("yes"));




        // End the program
        System.out.println("Calculator session ended. Goodbye!");
        sc.close();
    }
}
