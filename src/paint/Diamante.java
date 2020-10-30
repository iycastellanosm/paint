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
public class Diamante extends FiguraGeometrica {
    int alto, ancho;
    
    Diamante(){
        x = 0;
        y = 0;
        alto = 10;
        ancho = 10;
    }
    
    Diamante(int x, int y, int alto, int ancho){
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void cambiarAlto(int dalto){
        alto += dalto;
    }
    
    public void cambiarAncho(int dancho){
        ancho += dancho;
    }
    
    @Override //sobrecarga de funciones
    public double area(){
        return alto * ancho / 2.0;
    }
    
    @Override
    public String toString(){ // quiero imprimir el radio de un circulo + el resto de información
        return "Diamante. " +
                super.toString() 
                + ", alto: " + String.valueOf(alto) + ", ancho: " + String.valueOf(ancho);
    }
    
    @Override
    public void dibujar(){}
    
    @Override
    public void borrar(){}
    
    @Override
    public int compareTo(FiguraGeometrica otro){
        Double area = this.area();
        return area.compareTo(otro.area());
    }
}
