package com.micel.mensajeria.utileria;
import com.micel.mensajeria.mensajes.*;
import java.util.*;

public class CmpName <Mensaje> implements Mensaje{

	public int compareTo (Object o){
        double f = super.getName() - ((Mensaje)o).super.getName();
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