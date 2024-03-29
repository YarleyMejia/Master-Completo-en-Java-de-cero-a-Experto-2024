package org.ycmejia.Generics.ClasesGenericas;

public class Main {

    // Para Imprimir un camion completo
    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T a : camion) {
            if (a instanceof Animal) {//HAcer lo mismo para las demas clases
                System.out.println(((Animal) a).getNombre() + "  " + ((Animal) a).getTipo());
            }
        }
    }

    public static void main(String[] args) {
        Camion<Animal> transporteCaballos= new Camion(5);
        transporteCaballos.add(new Animal("Tornado", "Caballo"));
        transporteCaballos.add(new Animal("Perla", "Caballo"));
        transporteCaballos.add(new Animal("Gris", "Caballo"));
        transporteCaballos.add(new Animal("Juana", "Caballo"));
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));

        System.out.println("Imprimir camion completo");
        imprimirCamion(transporteCaballos);
        System.out.println("--------------------------");
        /*
        // Metodo apra recorrer mediante el cast los objetos
        for(Object o: transporteCaballos){
            Animal a= (Animal) o;
            System.out.println(a.getNombre()+"  "+a.getTipo());
        }

         */
        //Metodo que recorre una lista de elementos ya definidos
        for(Animal a: transporteCaballos){
            System.out.println(a.getNombre()+"  "+a.getTipo());
        }
    }
}
