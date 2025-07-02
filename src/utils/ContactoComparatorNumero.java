package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        
        // COMPARACION APELLIDO EN ORDEN ALFABETICO

        int resultadoApellido = o1.getApelldio().compareToIgnoreCase(o2.getApelldio());

        if(resultadoApellido != 0){
            return resultadoApellido;
        }

        // SI SON IGUALES, COMPARO POR EL NOMBRE EN ORDEN ALFABETICO

        int resultadoNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());

        if(resultadoNombre != 0){
            return resultadoNombre;
        }

        // COMPARO NUMEROS DE TELEFONO DESCENDENTE

        int resultadoTelefono = o2.getTelefono().compareToIgnoreCase(o1.getTelefono());

        return resultadoTelefono;
    }
    
}
