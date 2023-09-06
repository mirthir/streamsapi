package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //agrupar todos os valores ímpares múltiplos de 3
        //e imprimir na tela
        numeros.stream()
                .filter(numero -> numero % 2 != 0 && numero % 3 == 0)
                .forEach(System.out::println);
        //agrupar todos os valores ímpares múltiplos de 5
        //e imprimir na tela
        numeros.stream()
                .filter(numero -> numero % 2 != 0 && numero % 5 == 0)
                .forEach(System.out::println);

    }
}
