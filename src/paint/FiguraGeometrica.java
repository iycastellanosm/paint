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
public abstract class FiguraGeometrica {
    int x, y;
    
    public void mover(int dx, int dy){
        x += dx;
        y += dy;
    }
}
