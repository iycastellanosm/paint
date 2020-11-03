/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author Ivan
 */
public class Rectangulo extends FiguraGeometrica{
    int alto, ancho;
    
    Rectangulo(){
        centro = new Posicion();
        alto = 10;
        ancho = 10;
    }
    
    Rectangulo(int x, int y, int alto, int ancho){
        centro = new Posicion(x, y);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void cambiarAlto(int dalto){
        alto += dalto;
    }
    
    public void cambiarAncho(int dancho){
        ancho += dancho;
    }
    
    public final double area(){
        return alto * ancho;
    }
    
    @Override
    public String toString(){ // quiero imprimir el radio de un circulo + el resto de información
        return "Rectangulo. " +
                super.toString()
                + ", alto: " + String.valueOf(alto) + ", ancho: " + String.valueOf(ancho);
    }
    
    public void dibujar(){}
    
    public void borrar(){}
}
