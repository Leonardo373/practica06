package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.buenos.*;
import mx.com.softgame.poo1game.personajes.malos.*;
import mx.com.softgame.poo1game.personajes.*;
public class Utileria{
	private int contadorID;
	public static int getID(){
		return contadorID++;
	}
}