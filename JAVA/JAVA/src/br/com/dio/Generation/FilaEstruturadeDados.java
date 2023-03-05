package br.com.dio.Generation;

public class FilaEstruturadeDados {

    //atributos
    private int tamanhoMaximo  ;
    private int []  fila ;
    private int inicio;
    private int fim;
    private int total;



    //metodo construtor

    public FilaEstruturadeDados (int s) {
        tamanhoMaximo = s;
        fila = new int [s];
        inicio = 0;
        fim = -1;

        }

    public int pegarInicio() {
        return fila[inicio];
    }

    public int pegarFim() {
        return fila[fim];
    }

    public boolean checarCheio() {
        return total == tamanhoMaximo;
    }

    public boolean checarVazio() {
        return total == 0;
    }

    public int totalNum (){
    return total;
    }

    //em construção metodo para mostrar numeros da lista

    public  int mostrarNum (){
        return fila[total];
    }

    public void enqueue (int item){
        total = item;
        if (checarCheio()){
            System.out.println("A fila ja esta cheia, nao consigo colocar mais nada!");
        } else {
            fim++;
            fila[fim] = item;
            total++;
        }
        }

    public void dequeue () {
        if (checarVazio()){
            System.out.println("A fila esta vazia, não podemos remover!");
        } else {
            System.out.println("Item removido da fila: "+ fila[inicio] );
            inicio++;
            total--;
        }


    }

    }



