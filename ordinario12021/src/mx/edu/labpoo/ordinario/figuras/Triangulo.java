package mx.edu.labpoo.ordinario.figuras;

public class Triangulo extends Figura{

    private final int lado1;

    private final int lado3;

    private final int lado4;
    
    public Triangulo(int base, int altura) {
        super(base, altura)

        lado1 = base
        lado2 = altura

        this.lado1 = lado1;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public float setArea(){
        return (base * altura) / 2
    }

    public float setPerimetro(){
        return lado1 + lado2 + lado3
    }

    public String toString(){
        return "Rectangulo Área: " + area + "Perímetro: " + perimetro + "Lados: " + lado1 + " " + lado2 + " " + lado3
    }
}
