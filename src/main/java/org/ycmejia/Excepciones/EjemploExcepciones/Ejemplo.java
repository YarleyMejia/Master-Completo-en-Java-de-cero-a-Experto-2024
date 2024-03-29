package org.ycmejia.Excepciones.EjemploExcepciones;

import javax.swing.*;

public class Ejemplo {
    public static void main(String[] args) {
        String valor= JOptionPane.showInputDialog("Ingrese un numero:");
        int divisor;

        try {
            divisor=Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println(division);
        }catch (NumberFormatException r){
            System.out.println("FAvor ingrese un valor numerico--ERROR: "+ r.getMessage());
            main(args);
        }
        catch (ArithmeticException e){
            System.out.println("Excepcion generada"+ e.getMessage());
            main(args);
        } finally{
            System.out.println("Es opcional, pero se ejecuta siempre");
        }
        System.out.println("Continua el flujo de la aplicacion");
    }
}
