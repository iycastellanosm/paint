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
public class Lienzo {
    
     private boolean pixeles[][];
     private final int anchoLienzo;
     private final int altoLienzo;
     private static Lienzo unicaInstanciaEver = null;
     
     private Lienzo(){
         anchoLienzo = 200;
         altoLienzo = 200;
         pixeles = new boolean[anchoLienzo][altoLienzo];
     }
     
     public static Lienzo getLienzo(){
         if(unicaInstanciaEver == null){
             unicaInstanciaEver = new Lienzo();
         }
         return unicaInstanciaEver;
     }
     
     public boolean getPixel(Posicion p){
         return pixeles[p.getX()][p.getY()];
     }
     
     public void setPixel(Posicion p, boolean pixel){
         pixeles[p.getX()][p.getY()] = pixel;
     }
     
     public int getAlto(){
         return altoLienzo;
     }
     
     public int getAncho(){
         return anchoLienzo;
     }
}
