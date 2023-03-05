package br.com.dio.Generation;

public class testePilha {

    public static void main(String[] args) {

        PilhaEstruturadeDados pilha = new PilhaEstruturadeDados(5);

        pilha.add(1);
        System.out.println(pilha.pegar());
        pilha.add(2);
        System.out.println(pilha.pegar());
        pilha.add(3);
        System.out.println(pilha.pegar());
        pilha.add(4);
        System.out.println(pilha.pegar());
        pilha.add(5);
        System.out.println(pilha.pegar());

        // nao adicionara pois a pilha so pode ter 5 posições como foi instaciado acima
        pilha.add(7);

        //ultimo numero add a pilha
        System.out.println(pilha.pegar());

        // remove ultimo item a ser adicionado da pilha.
        pilha.remove();

        // mostrar ultimo numero da pilha atualizada
        System.out.println(pilha.pegar());


    }
}
