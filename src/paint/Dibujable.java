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
/*
public abstract class Dibujable {
    public abstract void dibujar();
    public abstract void borrar();
}
*/
public interface Dibujable { //como esto es una interfaz, todos los metodos son abstractos
    public void dibujar(); //esto es abstracto
    public void borrar(); //esto es abstracto
}