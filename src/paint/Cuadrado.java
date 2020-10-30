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
public class Cuadrado extends FiguraGeometrica {
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
    
    @Override
    public double area(){
        return lado * lado;
    }
    
    @Override
    public String toString(){ // quiero imprimir el radio de un circulo + el resto de información
        return "Cuadrado. " +
                super.toString()
                + ", lado: " + String.valueOf(lado);
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
