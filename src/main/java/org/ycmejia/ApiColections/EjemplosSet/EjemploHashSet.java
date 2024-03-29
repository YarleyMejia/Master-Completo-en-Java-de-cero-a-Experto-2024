package org.ycmejia.ApiColections.EjemplosSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        //No permite elementos duplicados y no mantiene el orden, y ademas
        //tampoco se pueden ordenar  a no ser que  se conviesta en lista

        Set<String> hs= new HashSet<>();
        List<String> list= new ArrayList<>(hs);
        hs.add("Uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

    }
}
