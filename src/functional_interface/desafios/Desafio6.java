package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //verifique se na lista existe algum numero maior do que dez
        numeros.stream()
                .anyMatch(numero -> numero > 10);
        System.out.println("Existe algum numero maior do que 10? " + numeros);
        //verifique se todos os numeros são maiores do que zero
        numeros.stream()
                .allMatch(numero -> numero > 0);
        System.out.println("Todos os némeros são positivos? " + numeros);
        //verifique se algum numero é par
        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(System.out::println);
        //verifique se todos os numeros são maiores que cinco
        numeros.stream()
                .allMatch(numero -> numero > 5);
        System.out.println("Todos os némeros são maiores que 5? " + numeros);
        //verifique se nenhum numero é maior do que cinco
        numeros.stream()
                .noneMatch(numero -> numero > 5);
    }
}
