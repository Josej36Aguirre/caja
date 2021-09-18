
package caja;

public class Caja {
    
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Constructor sin parametros");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        return  ancho*alto*profundo;
    }
    
}
