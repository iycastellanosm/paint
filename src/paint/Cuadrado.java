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
public class Cuadrado extends FiguraGeometrica implements Dibujable{
    int lado;
    
    Cuadrado(){
        x = 0;
        y = 0;
        lado = 10;
    }
    
    Cuadrado(int x, int y, int lado){
        this.x = x;
        this.y = y;
        this.lado = lado;
    }
    
    public void cambiarLado(int dlado){
        lado += dlado;
    }
    
    public void dibujar(){
        //como dibujo el cuadrado
    }
}
