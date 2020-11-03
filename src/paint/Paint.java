/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Ivan
 */
public class Paint {

    ArrayList<Dibujable> lista_elementos_dibujables;
    /**
     * @param args the command line arguments
     */
    public static void funcionbonita(){
        System.out.println("voy bien");
    }
    
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.radio = 4;
        
        System.out.println(Circulo.area(5.0));
        System.out.println(Circulo.area("6.0"));
       // System.out.println(Circulo.area(true)); ERROR!
        System.out.println(Circulo.area(c));
        System.out.println(c.area());
        
        Cuadrado b = new Cuadrado();
        Diamante d = new Diamante();
        Rectangulo r = new Rectangulo(0, 10, 4, 8);
        System.out.println(Circulo.area(20));
        c.mover(0, 5);
        c.cambiarRadio(-10);
        //c.cambiarAncho(6); ESTO NO SIRVE
        b.mover(-4, -4);
        b.cambiarLado(5);
        d.mover(10, -10);
        d.cambiarAlto(15);
        d.cambiarAncho(-5);
        funcionbonita();
        //ArrayList<Cuadrado> lista_de_cuadrado;
        //ArrayList<Circulo> lista_de_circulo;
        //ArrayList<Diamante> lista_de_diamante;
        
        ArrayList<FiguraGeometrica> lista_de_figuras = new ArrayList();
        lista_de_figuras.add(c);
        lista_de_figuras.add(b);
        lista_de_figuras.add(d);
        lista_de_figuras.add(r);
        
        //lista_de_figuras[2].mover(6, 6); -> No funciona :(
        lista_de_figuras.get(2).mover(6, 6);
        //lista_de_figuras.get(2).cambiarAncho(6); ESTO NO SIRVE
        for(FiguraGeometrica aux : lista_de_figuras){
            System.out.println(aux);
        }
        
        Collections.sort(lista_de_figuras); // Esto sirve para ordenar listas
        
        for(FiguraGeometrica aux : lista_de_figuras){
            System.out.println(aux);
        } 
        
        //FiguraGeometrica e = new FiguraGeometrica(); //YO NO PUEDO DIBUJAR CONCEPTOS ABSTRACTOS
        FiguraGeometrica e[] = new FiguraGeometrica[5]; // Este objeto arreglo 
        //e[0] = new FiguraGeometrica(); //Esto es objecto FiguraGeometrica ERROR!!!
        e[1] = c;
        e[2] = b;
        e[3] = d;

        //e[1].cambiarRadio(6); ERROR
        e[1].area();
        
        // Ejemplo de polimorfismo: 
            
    }
    
    public void dibujar_todo(){
        for(Dibujable elemento: lista_elementos_dibujables){
            elemento.dibujar();
        }
    }
    
    public void borrar_todo(){
        for(Dibujable elemento: lista_elementos_dibujables){
            elemento.borrar();
        }
    }
    
}
