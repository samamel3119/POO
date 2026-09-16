package Ejercicio3;

public class operation {
    double HorasTrabajadas = 48;
    double ValorHora = 5000;
    double retencion = 12.5;
    double porcentRetefuente = retencion / 100;
    double SalarioBruto, ValorRetefuente, salarioNeto;

    public operation() {
        calcSalarioBruto();
        calcValorRete();
        calcSalarioNeto();
    }
    public void calcSalarioBruto(){
        this.SalarioBruto = this.HorasTrabajadas * this.ValorHora;
    }
    public void calcValorRete(){
        this.ValorRetefuente = this.porcentRetefuente * this.SalarioBruto;
    }
    public void calcSalarioNeto(){
        this.salarioNeto = this.SalarioBruto - this.ValorRetefuente;
    }
    public void mostrarResultados(){
        System.out.println("Salario Bruto: " + SalarioBruto);
        System.out.println("Retencion en la fuente: " + ValorRetefuente);
        System.out.println("Salario Neto: " + salarioNeto);
    }
}