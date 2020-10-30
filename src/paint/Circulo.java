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
public class Circulo extends FiguraGeometrica {
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
    
    @Override
    public double area(){
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString(){ // quiero imprimir el radio de un circulo + el resto de información
        return "Circulo. " +
                super.toString()
                + ", radio: " + String.valueOf(radio);
    }
    
    @Override
    public void dibujar(){}
    
    @Override
    public void borrar(){}
}
