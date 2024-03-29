package org.ycmejia.Excepciones.Checked;

public class Calculadora {
    public double dividir(int numerador, int dividendo) throws ExcepcionPersonalizada {
        if (dividendo == 0) {
            throw new ExcepcionPersonalizada("NO se puede dividir por cero");
        }
        return numerador / (double) dividendo;//Los castea solo por precision
    }

    public double dividir(String numerador, String divisor) throws ExcepcionPersonalizada {
        try {
            int numero = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(numero, div);
        } catch (NumberFormatException e) {
            throw new ExcepcionPersonalizada("Debe de ingresar un numero");
        }

    }
}

