package Ejercicio4;

public class operation {
    double number, cuadrado, cubo;

    public operation(double number) {
        this.number = number;
        HallarCuadrado();
        HallarCubo();
    }

    public void HallarCuadrado() {
        this.cuadrado = Math.pow(this.number, 2);
    }

    public void HallarCubo() {
        this.cubo = Math.pow(this.number, 3);
    }

    public void mostrarResultado() {
        System.out.println("El numero ingresado es:" + number);
        System.out.println("El cuadrado es:" + cuadrado);
        System.out.println("El cubo es:" + cubo);
    }
}

