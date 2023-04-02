package br.com.dio.Generation.provaLogica;

public class arraysNumerosMain {

    public static void main(String[] args) {
        //lista de nomes
        int[] ListaNumeros = {22, 33, 44, 55, 66, 77};
        // posições:          0   1   2   3    ...

        //Para mostrar os numeros da lista usei o for / o length serve para, quando adicionar um numero, entrar automatico a lista)
        int i;
        for (i = 0; i < ListaNumeros.length; i++) {
            System.out.println(ListaNumeros[i]);
        }


        System.out.println("\n"); // pular linha
        //outra maneira de imprimir os valores
        for ( int  n : ListaNumeros){
            System.out.println(n);
        }
    }
}


