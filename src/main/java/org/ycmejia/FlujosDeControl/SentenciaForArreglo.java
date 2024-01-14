package org.ycmejia.FlujosDeControl;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres={"Andres", "Daniela", "Yovany", "Pepe", "Maria", "Juana", "Juliana"};
        int count=nombres.length;
        for (int i=0; i<count;i++){
            //Lo siguiente linea permite omitir algunas cosas a mostrar
            if(nombres[i].equalsIgnoreCase("Andres")||
                    nombres[i].equalsIgnoreCase("Juliana")){
                continue;
            }
            System.out.println( i+"---"+ nombres[i]);
        }



    }
}
