import java.util.Scanner;
public class Calculator {

    //psvm -main funkcija
    public static void main(String[] args) {
        System.out.println("Calculator...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operator, variable 1, variable 2 :");
        String operator = scanner.nextLine();
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();


        System.out.println("Var 1: " + var1);
        System.out.println("Var 2: " + var2);
        System.out.println("Operator: " + operator);

        double result = Main.calculator(var1, var2, operator);
        System.out.println("Result: " + result);
    }

}
