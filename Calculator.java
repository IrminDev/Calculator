import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        int opc = 0;
        int a = 0, b = 0;
        int res = 0;

        while(opc != 5) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            
            opc = sc.nextInt();

            System.out.println("Put the first operand");
            System.out.println("Put the second operand");
            
            res = menu.menu(opc, a, b);

            System.out.println("The result is: " + res);
        }
    }
}