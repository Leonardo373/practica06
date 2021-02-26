package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args){
		Personaje per01 = new Personaje("Omar");
		Personaje per02 = new Personaje("Erick");
		Personaje per03 = new Personaje("Wendy");
		Personaje per04 = new Personaje("Lesly");
		per04.setEdad(-10);
		for (i = 0;i = 2 ;i++) {
			int rand1 = (int)(Math.random()*250);
			int rand2 = (int)(Math.random()*250);
			int rand3 = (int)(Math.random()*250);
			per01.setEdad(rand1);
			System.out.println(per01.getDetalle()"se modificó la edad");
			per02.setEdad(rand2);
			System.out.println(per02.getDetalle()"se modificó la edad");
			per03.setEdad(rand3);
			System.out.println(per03.getDetalle()"se modificó la edad");
		}
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;
		per08.setNombre("Yosselin");
		per10.setNombre("Ana");
		int rand1 = (int)(Math.random()*1000);
		int rand2 = (int)(Math.random()*1000);
		per07.setEdad(rand1);
		per09.setEdad(rand2);
		System.out.println("================");
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
	}
}