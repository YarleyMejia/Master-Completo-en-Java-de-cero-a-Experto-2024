package org.ycmejia.ApiColections.PilasColas.Map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        //Almacena Objetos de manera asociativa, dandole un valor unico.

        Map<String, String> persona= new HashMap<>();
        //Es un parametro asociado a un valor
        persona.put(null, "1234");
        persona.put("Nombre", "Jhon");
        persona.put("Apellido", "Mejia");
        persona.put("Email", "yarleyc.mejiab@uqvirtual.edu.co");
        persona.put("Edad", "30");
        persona.put("Telefono", "3148438611");

        //Imprimiendo los datos
        System.out.println("Persona= "+ persona);
        //Imprimiendo un dato mas especificio
        String nombre= persona.get("Nombre");
        System.out.println("El nombre es:"+ nombre);

    }
}
