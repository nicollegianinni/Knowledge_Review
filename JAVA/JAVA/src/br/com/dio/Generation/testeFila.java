package br.com.dio.Generation;

public class testeFila {

    public static void main(String[] args) {

        FilaEstruturadeDados fila = new FilaEstruturadeDados(5);

        fila.enqueue(1);
        System.out.println( fila.pegarFim());
        fila.enqueue(2);
        System.out.println( fila.pegarFim());
        fila.enqueue(3);
        System.out.println( fila.pegarFim());
        fila.enqueue(4);
        System.out.println( fila.pegarFim());
        fila.enqueue(5);
        System.out.println(fila.pegarFim());
        // observe a fila deve ter 5 posições declaradas ao instaciar, portanto esse nao cabe mais na fila
        fila.enqueue(6);

        System.out.println("\n Total de numeros na fila: " +fila.totalNum());

      //  em construção System.out.println("\n\n Os numeros são : " +fila.mostrarNum());

        //Agora deve se excluir o ultimo numero colocado a fila.
        fila.dequeue();

        //checando a quantidade de numero na fila
        System.out.println("\n Total de numeros na fila: " +fila.totalNum());


    }

}
