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
public abstract class FiguraGeometrica implements Dibujable, Comparable<FiguraGeometrica>{
    int x, y; // coordenadas del centro de la figura
    
    public void mover(int dx, int dy){ // toda figura geometrica se puede mover y se como moverla sin concretar la figura
        x += dx;
        y += dy;
    }
    
    public abstract double area(); // toda figura geometrica tiene area, PERO no se cual es el area hasta que no conozca la figura en concreto
    
    @Override
    public String toString(){ // a toda figura le puedo imprimir su información, sin importar si no conozco la figura en concreto
        return "area: " + String.valueOf(this.area()) + ", x: " + String.valueOf(x) + ", y: " + String.valueOf(y);
    }
    
    @Override
    public int compareTo(FiguraGeometrica otro){
        Double area = this.area();
        return area.compareTo(otro.area());
    }
}
