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
public final class Circulo extends FiguraGeometrica {
    int radio;
    
    Circulo(){
        centro = new Posicion();
        radio = 10;
    }
    
    Circulo(int x, int y, int radio){
        centro = new Posicion(x, y);
        this.radio = radio;
    }
    
    public void cambiarRadio(int dradio){
        radio += dradio;
    }
    
    public static double area(int radio){
        return Math.PI * radio * radio;
    }
    
    @Override
    public final double area(){ // calcula el area de ESTE circulo (objeto)
        return Math.PI * this.radio * this.radio;
    }
    
    public static double area(double radio){ // calcula el area de un circulo cualquiera dado su radio
        return Math.PI * radio * radio;
    }
    
    public static double area(String radio){ // calcula el area de un circulo cualquiera dado su radio
        return Math.PI * Double.parseDouble(radio) * Double.parseDouble(radio);
    }
    
    public static double area(Circulo c){ // calcula el area de un circulo cualquiera dado el circulo
        return c.area();
    }
    
    @Override
    public String toString(){ // quiero imprimir el radio de un circulo + el resto de información
        return "Circulo. " +
                super.toString()
                + ", radio: " + String.valueOf(radio);
    }
    
    @Override
    public void dibujar(){
        Lienzo canvas = Lienzo.getLienzo();
        for(int y = 0; y < canvas.getAlto(); y++){
            for(int x = 0; x < canvas.getAncho(); x++){
                int dx = x - centro.getX();
                int dy = y - centro.getY();
                if(dx * dx + dy * dy <= radio * radio){
                    //estoy en el rectangulo
                    canvas.setPixel(new Posicion(x, y), true); // colorea el pixel
                }
            }
        }
    }
    
    @Override
    public void borrar(){}
}
