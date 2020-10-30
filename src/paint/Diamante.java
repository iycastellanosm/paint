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
public class Diamante extends FiguraGeometrica implements Dibujable {
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
    
    public void dibujar(){
        //como dibujo el diamante
    }
}
