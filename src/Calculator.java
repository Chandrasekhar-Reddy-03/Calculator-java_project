import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multification");
        System.out.println("4. Division");

        System.out.println("Enter choice (1-2-3-4): ");
        int choice = scanner.nextInt();

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice){
            case 1:
            System.out.println(num1 + "+" + num2 + "=" + add(num1,num2));
            break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + subtract(num1,num2));
                break;
            case 3:
                    System.out.println(num1 + "*" + num2 + "=" + multiply(num1,num2));
                    break;
            case 4:
                    double result = divide(num1,num2);
                    if (!Double.isNaN(result)){
                        System.out.println(num1 + "/" + num2 + "=" + result);
                    }else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
            default:
                System.out.println("invalid input. please enter a valid operation (1/2/3/4)");

        }

    }
    private static double add(double x, double y){
        return x+y;
    }
    private static double subtract(double x, double y){
        return x-y;
    }
    private static double multiply(double x, double y){
        return x*y;
    }
    private static double divide(double x, double y){
        if (y!= 0){
            return x/y;
        }else{
            return Double.NaN; // Representing "not a number" for division by zero
        }

    }


}