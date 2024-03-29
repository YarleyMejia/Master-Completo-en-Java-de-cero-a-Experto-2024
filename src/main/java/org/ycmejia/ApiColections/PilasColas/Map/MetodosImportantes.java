package org.ycmejia.ApiColections.PilasColas.Map;

import org.ycmejia.POO.classAndObjects.Persona;

import java.util.*;

public class MetodosImportantes {
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

        //Eliminar
        String valorApellido= persona.remove("Apellido");

        //Validar Si fu eliminado mediante llave y valor
        //boolean valorApell= persona.remove("Apellido", "Mejia");//Retorna TRue o False
        //System.out.println(valorApell);

        //Validar Si una llave existe
        boolean llave= persona.containsKey("Nombre");
        System.out.println(llave);
        //Validad si un valor existe
        boolean valor= persona.containsValue("Carlos");
        System.out.println(valor);

        //Imprimir netamente los valores
        Collection<String> valores= persona.values();
        for(String val:valores){
            System.out.println("valores "+ val);
        }

        //Imprimir netamente los valores de las llaves
        Set<String> llaves= persona.keySet();
            for (String key: llaves){
                System.out.println("Key: "+ key);
            }

            //Iterar ambos al mismo tiempo
        for(Map.Entry<String, String> llaveValor: persona.entrySet()){
            System.out.println("Llave: "+ llaveValor.getKey()+ " =>>> Valor: "+llaveValor.getValue());
        }

        System.out.println("=================otra forma de iterar");
        for(String llave2: persona.keySet()) {
            String valor2 = persona.get(llave2);
            System.out.println(llave2 + "===" + valor2);
        }
        //formas de reemplazar datos
        persona.replace("Nombre","Mario");
        System.out.println(persona);

        }

    }
