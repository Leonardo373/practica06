package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.*;
public class Planta extends Personaje{
	char escudo;

	public char getEscudo(){
		return escudo;
	}

	public Planta(String nombre, int vida, char escudo){
		this.nombre = nombre;
		this.vida = vida;
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre, 3, escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre, vida, "A");
	}
	public Planta(String nombre){
		this(nombre, 3, "A");
	}
}