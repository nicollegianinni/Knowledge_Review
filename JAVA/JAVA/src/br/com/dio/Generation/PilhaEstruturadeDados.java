package br.com.dio.Generation;

public class PilhaEstruturadeDados {

    // 3 variavei basicas que toda pilha deve possuir

    private int tamanhoMaaximo;
    private int [] pilha;
    private int topo;

    private int todos;


    //metodo construtor
    public PilhaEstruturadeDados (int variavel){
        tamanhoMaaximo = variavel;
        pilha = new int [variavel];
        topo = -1; // modo da indexação pq em java termina em 0

    }

    public void add (int item){
        todos = item ;
        if (topo == tamanhoMaaximo - 1){
            System.out.println("A pilha esta cheia, nao posso adicionar mais!");
        } else {
            topo++;
            pilha [topo] = item;

        }
    }

    public void remove (){
        if (topo == - 1){
            System.out.println("A pilha esta vazia, nao tem mais o que tirar!");
        } else {
            System.out.println("Elemento tirado da pilha foi : " + pilha[topo]);
            topo -- ;
        }
    }

    public int pegar (){
        return pilha [topo];
    }

    }

