package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.*;
public final class Zombie extends Personaje{
	private boolean ataque;
	public boolean getAtaque(){
		return ataque;
	}
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre, 3, ataque);
	}
	public Zombie(String nombre){
		this(nombre, 3, false);
	}
	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() < 8){
			this.nombre = nombre;
		}
	}
	//public final String getIdVida(){
	//	return id + "\t" + vida + "\t" + escudo;
	//}
	public String toString(){
		return super.toString()+" "+ "{" + ataque + "}";
	}
	public void decVida(){
		if (ataque == false) {
			super.decVida(3);
		}else{
			super.decVida(2);
		}
	}
	public void decVida(int resta){
		if (ataque == false) {
			super.decVida(resta*3);
		}else{
			super.decVida(resta*2);
		}
	}
	public boolean equals(Object o) {
		boolean result = false;
		if ( (o != null) && (o instanceof Zombie) ) {
			Zombie z = (Zombie) o;
			if ((ataque == z.ataque) && super.equals(z)) {
				result = true;
			}
		}
		return result;
	}
}