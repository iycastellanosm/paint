package paint;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Circulo extends FiguraGeometrica implements Dibujable {
    int radio;
    
    Circulo(){
        x = 0;
        y = 0;
        radio = 10;
    }
    
    Circulo(int x, int y, int radio){
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    public void cambiarRadio(int dradio){
        radio += dradio;
    }
    
    public static double area(int radio){
        return Math.PI * radio * radio;
    }
    
    public void dibujar(){
        //como dibujo el circulo
    }
}
