package com.micel.mensajeria.mensajes;

public class Mensaje {
	private int number;
	private String name;
	private String mensaje;

	public Mensaje(int number, String name, String mensaje){
    	this.number = number;
    	this.name = name;
    	this.mensaje = mensaje;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String toString(){
        return "Número: " + number + "Nombre: " + name + "Mensaje: " + mensaje;
    }
}