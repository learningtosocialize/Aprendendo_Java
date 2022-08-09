package ed.fila;

import java.util.List;
import java.util.LinkedList;


public class Fila {

    @Override
    public String toString() {
        return alunos.toString();
    }

    private List<String> alunos = new LinkedList<String>();

    public void adiciona(String aluno){
        alunos.add(aluno);
    }

    public String remove(){
        return alunos.remove(0);
    }

    public boolean vazia(){
        return alunos.isEmpty();
    }
}
