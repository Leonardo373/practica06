package com.micel.mensajeria.utileria;
import com.micel.mensajeria.mensajes.*;
import java.util.*;

public class CmpNumber <Mensaje> implements Mensaje{

	public int compareTo (Object o){
        double f = super.getNumber() - ((Mensaje)o).super.getNumber();
        if (f == 0.0){
            return 0;
        }
        else if (f<0.0){
            return -1;
        }
        else{
            return 1;
        }
    }

}