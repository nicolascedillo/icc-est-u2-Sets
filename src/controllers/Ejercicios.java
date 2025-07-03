package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios(){
        System.out.println("\n----EJERCICIOS-----");
        System.out.println("\n---Ejercicio 1: ");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("\n---Ejercicio 2: ");
        System.out.println("Murcielago es isograma: " + esIsograma("murcielago"));
        System.out.println("Camaleon es isograma: " + esIsograma("camaleon"));
        System.out.println("\n---Ejercicio 3: ");
        System.out.println(contarPalabrasUnicas("La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?" + 
                        " Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente." + 
                        " En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas."));

    }
    
    public boolean tieneDuplicados(int[] numeros){
       Set<Integer> set = new HashSet<>();
        for(int numero:numeros){

            if(!set.add(numero)){
                return true;
            }

        }
       
        return false;
    }

    public boolean esIsograma(String palabra){
        Set<Character> set = new HashSet<>();
        for(Character c: palabra.toCharArray()){

            if(!set.add(c)){
                return false;
            }

        }
        return true;
    }

    public int contarPalabrasUnicas(String frase){
        Set<String> set = new HashSet<>();
        int cont = 0;
        for(String palabra:frase.split(" ")){

            if(set.add(palabra)){
                cont++;
            }

        }
        return cont;
    }


}
