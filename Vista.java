import java.util.Scanner;
import java.util.InputMismatchException;

public class Vista {
    private Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }

    public String input(){
        return scan.next();
    }

    public void inputError(){
        System.out.println("Ingrese una expresión válida");
    }
}
