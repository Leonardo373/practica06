/*
Nombre: Leonardo García Nieves
Hora de inicio: 7:40 a.m.
Hora de finalización: 10:11 a.m.
*/
package mx.com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int edad;
	public Personaje (String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if (edad >= 0 && edad <= 120){
			this.edad = edad;
			return true;
		} else{
			return false;
		}
	}
	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + edad;
	}
}