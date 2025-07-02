package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorNumero;

public class ContactoController {
    
    public ContactoController(){
        runTreeContacto();
        runTreeContactoNumero();
    }

    private void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        
        System.out.println("\nContacto orden alfabetico apellido - nombre: ");
        for(Contacto contacto: agenda){
            System.out.println( "- " +contacto);
        }
    }

    private void runTreeContactoNumero(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorNumero());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        
        System.out.println("\nContacto orden alfabetico apellido - nombre y numero descendente: ");
        for(Contacto contacto: agenda){
            System.out.println("- " +contacto);
        }
    }
}
