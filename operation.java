package Ejercicio1;

public class operation {
    double edadJuan = 9;
    double edadAlberto, edadAna, edadMama;
    public operation(){
        edadAlberto();
        edadAna();
        edadMama();
    }
    public void edadAlberto () {
        this.edadAlberto = (this.edadJuan * 2) / 3;
    }
    public void edadAna() {
        this.edadAna = (this.edadJuan * 4) / 3;
    }
    public void edadMama(){
        this.edadMama = this.edadJuan + this.edadAna + this.edadAlberto;
    }
    public void mostrarResultados() {
        System.out.println("Edad de Juan: " + edadJuan);
        System.out.println("Edad de Alberto: " + edadAlberto);
        System.out.println("Edad de Ana: " + edadAna);
        System.out.println("Edad de la mamá: " + edadMama);
    }
}