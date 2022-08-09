package ed.pilha;

public class TesteDePilha {

    public static void main(String[]args){
        Pilha pilha = new Pilha();

        //inserindo um item em uma pilha:
        System.out.println(pilha.vazia()); //verificando se a pilha está vazia ou não.
        pilha.push("Aristeu");
        System.out.println(pilha);
        System.out.println(pilha.vazia()); //verificando se a pilha está vazia ou não.
        pilha.push("Juvenal");
        System.out.println(pilha);

        //removendo um item de uma pilha(sempre o ultimo):
        String r1 = pilha.pop();
        System.out.println(r1);

        String r2 = pilha.pop();
        System.out.println(r2);

        System.out.println(pilha);
        System.out.println(pilha.vazia()); //verificando se a pilha está vazia ou não.
    }
}
