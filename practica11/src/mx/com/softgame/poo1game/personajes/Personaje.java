/*
Nombre: Leonardo García Nieves
Hora de inicio: 7:35 a.m.
Hora de finalización: 00:00 a.m.
*/
package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.utils.*;

public abstract class Personaje extends Utileria {
	protected String nombre;
	protected int vida;
	protected int id = super.getID();
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje (String nombre){
		this(nombre, 3);
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	private final int id(){
		return getID();
	}
	public final String getIdVida(){
		return id + "\t" + vida;
	}
	public boolean setVida(int vida){
		if  (vida >= 0 && vida <= 100){
			this.vida = vida;
			return true;
		} else{
			return false;
		}
	}
	public abstract void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}
	public String toString(){
		return "[" + id + "]" + "\t" + nombre + "\t" + "(" + vida + ")";
	}
	public void decVida(){
		decVida(1);
	}
	public void decVida(int resta){
		if ((vida - resta)>0) {
			vida = vida - resta;
		}
	}
	public abstract boolean equals(Object o){
		boolean result = false;
		Personaje x = (Personaje) o;
		if ((nombre == x.nombre) && (vida == x.vida)){
			result = true;
		}
		return result;
	}
}