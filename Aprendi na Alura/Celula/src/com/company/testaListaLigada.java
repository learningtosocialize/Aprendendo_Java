package com.company;

public class testaListaLigada {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        //Método para adicionar um termo no começo de uma lista:
        System.out.println(lista);
        lista.adicionaNoComeco("Mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("Glauber");
        System.out.println(lista);
        lista.adicionaNoComeco("Aristeu");
        System.out.println(lista);

        //Método para adicionar um termo no final de uma lista:
        lista.adiciona("Helton");
        System.out.println(lista);

        //Método para adicionar um termo pelo indice de uma lista:
        lista.adiciona(2, "Washington");
        System.out.println(lista);

        //Método para saber o conteúdo de um indice de uma lista:
        Object x = lista.pega(2);
        System.out.println(x);

        //Método para o tamanho de uma lista:
        System.out.println("Sua lista tem " + lista.tamanho() + " itens.");

        //Metodo para remover o primeiro item de uma lista:
        lista.removeDoComeco();
        System.out.println(lista);

        //Metodo para remover o ultimo item de uma lista:
        lista.removeDoFim();
        System.out.println(lista);

        //Metodo para remover itens por posição da lista:
        lista.remove(2);
        System.out.println(lista);

        //Verificar se um item está na lista:
        lista.estaNalistaAmigue("Glauber");
        lista.estaNalistaAmigue("Judith");
    }
}
