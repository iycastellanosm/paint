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
    int x1, y1, x2, y2;
    
    Linea(){
        x1 = x2 = y1 = y2 = 0;
    }
    
    Linea(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    // poner mas funciones mas adelante
    @Override
    public void dibujar(){}
    
    @Override
    public void borrar(){}
}
