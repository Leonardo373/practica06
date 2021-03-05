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
}