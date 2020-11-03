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
public class Linea implements Dibujable {
    Posicion p1, p2;
    
    Linea(){
        p1 = new Posicion();
        p2 = new Posicion();
    }
    
    Linea(int x1, int y1, int x2, int y2){
        Posicion p1 = new Posicion(x1, y1);
        Posicion p2 = new Posicion(x2, y2);
    }
    
    // poner mas funciones mas adelante
    @Override
    public void dibujar(){}
    
    @Override
    public void borrar(){}
}
