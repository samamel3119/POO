package Ejercicio2;

public class operation {
    double suma = 0;
    double x = 20;
    double y = 40;
public operation () {
    calcularSuma();
    calcularCuadrado();
    totalSuma();
}
public void calcularSuma(){
        suma += x;
}
public void calcularCuadrado(){
    x += Math.pow(y, 2);
}
public void totalSuma(){
    suma += x/y;
    }
public void mostrarResultados() {
        System.out.println("El valor de la suma es:" + suma);
    }
}
