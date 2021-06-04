package mx.edu.labpoo.ordinario.figuras;

public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura){
    	super(base, altura)
    }

    public float area;

    public float getArea(){
    	return base * altura
    }

    public float perimetro = (2 * base) + (2 * altura)
}
