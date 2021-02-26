package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args){
		Personaje per01 = new Personaje("Omar");
		Personaje per02 = new Personaje("Erick");
		Personaje per03 = new Personaje("Wendy");
		Personaje per04 = new Personaje("Lesly");
		for (int i = 0;i < 3 ;i++) {
			int ed = (int)(Math.random()*250);
			if (per01.setEdad(ed)) {
				System.out.println(per01.getDetalle()"se modificó la edad");
			}else{
				System.out.println(per01.getDetalle()"sin modificar en edad a"+ed);
			}
			if (per02.setEdad(ed)) {
				System.out.println(per02.getDetalle()"se modificó la edad");
			}else{
				System.out.println(per02.getDetalle()"sin modificar en edad a"+ed);
			}
			if (per03.setEdad(ed)) {
				System.out.println(per03.getDetalle()"se modificó la edad");
			}else{
				System.out.println(per03.getDetalle()"sin modificar en edad a"+ed);
			}
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