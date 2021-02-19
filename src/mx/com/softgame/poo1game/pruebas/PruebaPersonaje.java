package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args){
		Personaje alumno = new Personaje();
		Personaje per01 = new Personaje("Aline", 200);
		per01.getDetalle();
		Personaje per02 = new Personaje("Erick", 10);
		per02.getDetalle();
		Personaje per03 = new Personaje("Alan", 1);
		per03.getDetalle();
		Personaje per04 = new Personaje("Lesly", -10);
		per04.getDetalle();
		Personaje per05 = new Personaje("Brian", 500);
		per05.getDetalle();
	}
}