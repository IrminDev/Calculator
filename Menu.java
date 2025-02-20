import operations.Addition;
import operations.Division;
import operations.Multiplicacion;
import operations.Multiplication;
import operations.OperationImplement;
import operations.Substract;
import operations.Sumanding;
import operations.Resta;

public class Menu {
     public int menu(int opc, int a, int b) {
        Addition adder= new Sumanding();
        Substract subtracter= new Resta() ;
        Multiplication multiplier= new Multiplicacion();
        Division divider = new OperationImplement();
        switch(opc){
            case 1:
                System.out.println("Suma");
                return adder.addition(a, b);
            case 2:
                System.out.println("Resta");
                return subtracter.substract(a, b);
            case 3:
                System.out.println("Multiplicacion");
                return multiplier.multiplication(a, b);
            case 4:
                System.out.println("Division");
                return (int) divider.division(a, b);
        }

        return -1;
     }    
}
