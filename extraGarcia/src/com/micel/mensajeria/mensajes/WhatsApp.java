package com.micel.mensajeria.mensajes;
import com.micel.mensajeria.mensajes.*;

public class WhatsApp extends Mensaje {
	private String image;

	public WhatsApp(int number, String name, String mensaje){
		super(number, name, mensaje);
	}

	public String getImage(){
		return image;
	}

	public String toString(){
        return "Número: " + super.getNumber() + "Nombre: " + super.getName() + "Mensaje: " + super.getMensaje() + "Imagen: " + image;
    }
}