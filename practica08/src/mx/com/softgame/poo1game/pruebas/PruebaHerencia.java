package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.buenos.*;
import mx.com.softgame.poo1game.personajes.malos.*;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Valeria", 99);
		Personaje per02 = new Personaje("Octavio");
		Planta plan01 = new Planta("Wendy", 10, 'B');
		Planta plan02 = new Planta("Ricardo", 50);
		Planta plan03 = new Planta("Vania", 'C');
		Planta plan04 = new Planta("Alan");
		Zombie zom01 = new Zombie("Karen", 80, false);
		Zombie zom02 = new Zombie("Eduardo", true);
		Zombie zom03 = new Zombie("Esmeralda");

		Personaje[] personajes = new Personaje[9];
		personajes[0] = per01;
		personajes[1] = per02;
		personajes[2] = plan01;
		personajes[3] = plan02;
		personajes[4] = plan03;
		personajes[5] = plan04;
		personajes[6] = zom01;
		personajes[7] = zom02;
		personajes[8] = zom03;

		for (Personaje i: personajes) {
			System.out.println(i.getDetalle());
			if (i instanceof Planta) {
				System.out.println("Soy Planta"+getEscudo());
			}
			if (i instanceof Zombie) {
				System.out.println("Soy Zombie"+getAtaque());
			}
		}
	}
}