package Ejercicio4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        double number = teclado.nextDouble();
        operation operation = new operation(number);
        operation.mostrarResultado();
        teclado.close();
    }
}
