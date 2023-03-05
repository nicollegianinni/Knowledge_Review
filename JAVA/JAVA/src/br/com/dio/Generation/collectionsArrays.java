package br.com.dio.Generation;


import java.util.ArrayList;
import java.util.Collections;

public class collectionsArrays {
    public static void main(String[] args) {

        // Instanciando um objeto no ArrayList pode-se usar os seus metodos( add, remove, isEmpty etc)
        ArrayList<Double> notas = new ArrayList<>();

        //adiciona numeros atras do .add
        notas.add(1.0);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);

        // mostrar todas os numeros
        System.out.println("\n Os numeros cadastrados foram: " + notas.toString());

        // mostrar algum numero especifico pelo index e letra d => nesse caso tem que dar true pq há 6 na lista.
        System.out.println("\n O numero 3 esta cadastrado ? " + notas.contains(3d));

        // mostrar tamanho da lista, quantos numeros tem
        System.out.println("\n Quantos numeros foram cadastrados? " + notas.size());

        //alterar um valor
        System.out.println("\n Altere o numero 6.0 (seu index é 5 ) por 7. " + notas.set(5, 7.0)+ " feito! ");

        // mostrar todas os numeros, pq alterei o 6 para o numero 7
        System.out.println("\n Os numeros atualizados são: " + notas.toString());

        // mostrar se a lista esta vazia
        System.out.println("\n a lista esta vazia? (true/false) " + notas.isEmpty());

        //qual maior numero da lista
        System.out.println("\n Qual maior numero da lista? " + Collections.max(notas));

        //qual menor numero da lista
        System.out.println("\n Qual maior numero da lista? " + Collections.min(notas));

        //remover um numero
        System.out.println("\n Remova o numero 7.0. " + notas.remove(7d));

        // mostrar todas os numeros, pq removi o numero 7
        System.out.println("\n Os numeros cadastrados foram: " + notas.toString());

        //Pegar um numero em um index definido ( o index começa em 0. ou seja o numero 1.0 da lista é p index 0.
        System.out.println( "\n Mostre o numero cujo index seja 4 para o arrayList: " + notas.get(4));

    }
}
