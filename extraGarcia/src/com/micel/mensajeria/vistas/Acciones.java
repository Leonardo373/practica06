package com.micel.mensajeria.vistas;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import com.micel.mensajeria.mensajes.*;
import com.micel.mensajeria.utileria.*;
import com.micel.mensajeria.vistas.*;

public class Acciones {
	LinkedList <Acciones> list = new LinkedList <Acciones> ();

	public void guardar(int type, String number, String name, String msg, String other){
		try{
			Integer.parseInt(number);
		}catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "Error: " +nfe);
		}

		switch(type){
			case 1:
				list.add(WhatsApp()); //WhatsApp
			case 2:
				list.add(MsgCel()); //MsgCel
			default:
				list.add(Mensaje()); //Mensaje
		}
	}

	public void mostrar(int cmp){
		if (cmp == 1) {
			CmpName();
		}else{
			CmpNumber();
		}

		for (Acciones : list) {
			System.out.println(super.toString());
		}
		System.out.println("---\t---\t---");
	}
}