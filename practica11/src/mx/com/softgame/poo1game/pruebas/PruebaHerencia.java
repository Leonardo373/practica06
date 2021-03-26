package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.buenos.*;
import mx.com.softgame.poo1game.personajes.malos.*;
import mx.com.softgame.poo1game.personajes.*;
public class PruebaHerencia{
	public static void main(String[] args) {
		int i = 0;
		Personaje per01 = new Personaje("Valeria", 99);
		Personaje per02 = new Personaje("Octavio");
		Planta plan01 = new Planta("Wendy", 10, 'B');
		Planta plan02 = new Planta("Ricardo", 50);
		Planta plan03 = new Planta("Vania", 'C');
		Planta plan04 = new Planta("Alan");
		Zombie zom01 = new Zombie("Karen", 80, false);
		Zombie zom02 = new Zombie("Eduardo", true);
		Zombie zom03 = new Zombie("Esmeralda");
		
		Personaje[] personajes = {new Personaje("Omar",99),
		new Planta("Karen",50),
		new Zombie("Hanna",80,false),
		new Personaje("Omar",99),
		new Planta("Karen",50),
		new Zombie("Hanna",80,false)
		};

		//public String getIdVida(){
		//	return id + "\t" + vida;
		//}

		while(i < personajes.length){
			for (Personaje p : personajes) {
				if (p == personajes[i]) {
					System.out.println("***"+p+" es identico a "+personajes[i]+", son el mismo objeto***");
				}
				if (p.equals(personajes[i])){
					System.out.println("***"+p+" es igual a "+personajes[i]+", son diferentes objetos***");
				}
				else{
					System.out.println(p+" != "+personajes[i]);
				}
			}
			i = i + 1;
		}
		/*
		for (Personaje i: personajes) {
			System.out.println(i.getDetalle());
			if (i instanceof Planta) {
				Planta seleccionada = (Planta) i;
				System.out.println("Soy Planta"+seleccionada.getEscudo());
			}
			if (i instanceof Zombie) {
				Zombie seleccionado = (Zombie) i;
				System.out.println("Soy Zombie"+seleccionado.getAtaque());
			}
			int num = (int)(Math.random()*10);
			i.decVida(num);
			System.out.println(num);
			System.out.println(i.getDetalle());
		}
		*/
	}
}