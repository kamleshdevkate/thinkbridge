import java.util.Scanner;

public class GitLearn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        result = num1 + num2;
        
        do {
            System.out.println("Calculator Menu");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch(choice) {
                case 1:
               
                    System.out.println("Result: " + result);
                    break;
                case 2:
                
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
              
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                 
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                case 5:
                case 6: System.out.println("wrote through branch testing");
                    
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 0);
        
        input.close();
    }
}
