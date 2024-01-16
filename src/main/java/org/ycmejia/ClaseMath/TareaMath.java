package org.ycmejia.ClaseMath;

import java.util.Scanner;

public class TareaMath {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Favor ingrese el radio del circulo: " );
        double radio= teclado.nextDouble();

        double area= (Math.pow(radio,2))*Math.PI;
        System.out.println(" El area es: "+area);

    }
}
