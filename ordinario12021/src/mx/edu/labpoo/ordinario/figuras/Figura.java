package mx.edu.labpoo.ordinario.figuras;

public abstract class Figura {

    private final int base;

    private final int altura;

    protected float area;

    protected float base;

    public abstract float setArea(){

    }

    public abstract float setPerimetro(){

    }

    public String toString(){
        return "Base: " + base + "Altura: " + altura
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.base;
        hash = 17 * hash + this.altura;
        return hash;
    }
    
    public int compareTo(Object o){
        double f = area - ((Figura)o).area;
        if (f == 0.0){
            return 0;
        }
        else if (f<0.0){
            return -1;
        }
        else{
            return 1;
        }
    }

    public boolean equals(Object o){
        boolean result = false;
        Figura x = (Figura) o;
        if ((base == x.base) && (altura == x.altura)){
            result = true;
        }
        return result;
    }
}