package Ejercicio5;

public class operation {
    double radio=3.0, circunferencia, area;
    public operation (){
        HallarCircunferencia();
        HallarArea();
    }
    public void HallarCircunferencia(){
        this.circunferencia = 2 * Math.PI * this.radio;
    }
    public void HallarArea(){
        this.area = Math.PI * Math.pow(this.radio, 2);
    }
    public void mostrarResultados(){
        System.out.println("Longitud circunferencia:" + circunferencia);
        System.out.println("Área círculo:" + area);
    }
}
