package ed.Conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDeConjunto {
    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Sacudao");
        System.out.println(conjunto);

        conjunto.adiciona("Washington");
        System.out.println(conjunto);

        conjunto.adiciona("Aristeu");
        System.out.println(conjunto);

        conjunto.remove("Washington");
        System.out.println(conjunto);

        Set<String> conjuntoDoJava = new HashSet<String>();
        conjuntoDoJava.add("Bambi");
        conjuntoDoJava.add("Simba");
        System.out.println(conjuntoDoJava);

        String x = "Zangado";
        x.hashCode();
        System.out.println(x);
    }
}
