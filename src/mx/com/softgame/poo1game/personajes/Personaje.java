/*
Nombre: Leonardo García Nieves
Hora de inicio: 7:40 a.m.
Hora de finalización: 8:30 a.m.
*/
package mx.com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int edad;
	public Personaje(){
		edad = 0;
	}
	public void setNombre(String nombre){
		if (nombre.length > 3 && nombre.length < 10){
			this.nombre = nombre;
			return true;
		}
		else{
			return false;
		}	
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		}
		else{
			return false;
		}
	public void getDetalle(){
		return nombre
		return edad;
	}
	}
	public void saludar(){
		System.out.println("Hola Almuno de POO " + nombre);
	}
}