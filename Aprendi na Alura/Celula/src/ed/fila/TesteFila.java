package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        //adicionar itens a fila:
        fila.adiciona("Jiraya");
        fila.adiciona("Naruto");
        System.out.println(fila);
        System.out.println("------------------------------------------------------------------");

        //removendo itens da fila:
        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);
        System.out.println("------------------------------------------------------------------");

        //Stack de filas:
        Queue<String> filaDoJava = new LinkedList<String>();
        //inserindo itens na fila através da stack do java:
        filaDoJava.add("Poze do Rodo");
        String x2 = filaDoJava.poll();
        System.out.println(x2);
        System.out.println("------------------------------------------------------------------");

    }
}
