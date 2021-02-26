/*
Nombre: Leonardo García Nieves
Hora de inicio: 7:40 a.m.
Hora de finalización: 9:32 a.m.
*/
package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args){
		Personaje per01 = new Personaje("Omar");
		Personaje per02 = new Personaje("Erick");
		Personaje per03 = new Personaje("Wendy");
		Personaje per04 = new Personaje("Lesly");
		outfor:
		for (int i = 0;i < 3 ;i++) {
			int ed = (int)(Math.random()*250);
			if (per01.setEdad(ed)) {
				System.out.println(per01.getDetalle()+"se modificó la edad");
			}else{
				System.out.println(per01.getDetalle()+"sin modificar en edad a"+ed);
			}
			ed = (int)(Math.random()*250);
			if (per02.setEdad(ed)) {
				System.out.println(per02.getDetalle()+"se modificó la edad");
			}else{
				System.out.println(per02.getDetalle()+"sin modificar en edad a"+ed);
			}
			ed = (int)(Math.random()*250);
			if (per03.setEdad(ed)) {
				System.out.println(per03.getDetalle()+"se modificó la edad");
			}else{
				System.out.println(per03.getDetalle()+"sin modificar en edad a"+ed);
			}
			do{
				ed = (int)(Math.random()*250);
				System.out.println(ed);
				if (ed == 150) {
					System.out.println("***Bingo***");
					continue outfor;
				}
			}while(!per04.setEdad(ed));
			System.out.println(per04.getDetalle());
		}
	}
}