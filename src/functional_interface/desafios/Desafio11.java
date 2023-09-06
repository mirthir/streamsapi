package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //encontrar a soma dos quadrados de todos os números da lista
        numeros.stream()
                .map(numero -> numero * numero)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
