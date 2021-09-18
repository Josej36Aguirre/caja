/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author INDRA
 */
public class Prueba {
    
    public static void main(String[] args) {
        // atributos con sus valores
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        //Constructor sin parametros
        Caja cajaObj = new Caja();
        cajaObj.ancho = ancho;
        cajaObj.alto = alto;
        cajaObj.profundo = profundo;
        int resultado = cajaObj.calcularVolumen();
        System.out.println("resultado usando constructor sin parametros= " + resultado);
        
        //Constructor con parametros
        Caja cajaObj2 = new Caja(ancho, alto, profundo);
        resultado = cajaObj2.calcularVolumen();
        System.out.println("resultado usando constructor con parametros = " + resultado );
        
        
        
    }
    
}
