package mx.edu.labpoo.ordinario.figuras;

public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura){
    	super(base, altura)
    }

    public float area;

    public float perimetro;

    public float getArea(){
    	return base * altura
    }

    public float getPerimetro(){
        return 2 * base + 2 * altura
    }

    public String toString(){
        return "Rectangulo Área: " + area + "Perímetro: " + perimetro + "Base: " + super.getBase() + "Altura: " + super.getAltura()
    }
}
