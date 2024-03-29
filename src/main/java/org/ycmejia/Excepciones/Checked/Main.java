package org.ycmejia.Excepciones.Checked;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora= new Calculadora();
        double division;


        try{
           // int numerador= Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO (Numerador): "));
            //int dividendo= Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO (Dividendo): "));
            //System.out.println(calculadora.dividir(numerador,dividendo));

            //aplicando la segunda funcion directamente
            double division2=calculadora.dividir("h","5");

        }catch(ExcepcionPersonalizada ep){
            System.out.println("Se detecto una excepcion "+ ep.getMessage());

        }
    }

}
