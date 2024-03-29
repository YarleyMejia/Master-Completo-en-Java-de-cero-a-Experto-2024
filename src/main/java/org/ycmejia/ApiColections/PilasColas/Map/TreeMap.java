package org.ycmejia.ApiColections.PilasColas.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    //Son mapas ordenados
    public static void main(String[] args) {
        //Jugando por orden
        Map<String, Object> persona= new java.util.TreeMap<>(Comparator.reverseOrder());// Por el largo se una Comparing.(String::Length).reverse
        //Es un parametro asociado a un valor
        //No acepta elementos null
        persona.put("Nombre", "Jhon");
        persona.put("Apellido", "Mejia");
        persona.put("Email", "yarleyc.mejiab@uqvirtual.edu.co");
        persona.put("Edad", "30");
        persona.put("Telefono", "3148438611");


        Map<String, String> direccion= new HashMap<>();
        direccion.put("Pais", "USA");
        direccion.put("Estado", "California");
        direccion.put("Ciudad", "One Street");
        direccion.put("Calle", "20");
        direccion.put("Numero", "20-26");

        persona.put("direccion", direccion);
        System.out.printf("Persona: "+ persona);
    }
}
