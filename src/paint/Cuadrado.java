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
public final class Cuadrado extends Rectangulo { // una clase final es una clase concreta que no puede ser heredada
    int lado;
    
    Cuadrado(){
        super(); //crea un rectangulo de alto 10 y ancho 10 -> lado = 10
    }
    
    Cuadrado(int x, int y, int lado){
        super(x, y, lado, lado);
        this.lado = lado;
    }
    
    public void cambiarLado(int dlado){
        cambiarAlto(dlado);
        cambiarAncho(dlado);
        lado += dlado;
    }
    
    @Override
    public String toString(){ // quiero imprimir el radio de un circulo + el resto de información
        return "Cuadrado. " +
                "area: " + String.valueOf(this.area()) + ", " + centro.toString()
                + ", lado: " + String.valueOf(lado);
    }
}
