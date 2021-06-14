package com.micel.mensajeria.mensajes;
import com.micel.mensajeria.mensajes.*;

public class MsgCel extends Mensaje{
	private float costo;

	public MsgCel(int number, String name, String mensaje){
		super(number, name, mensaje);
	}

	public float getCosto(){
		return costo;
	}

	public String toString(){
        return "Número: " + super.getNumber() + "Nombre: " + super.getName() + "Mensaje: " + super.getMensaje() + "Costo: " + costo;
    }
}