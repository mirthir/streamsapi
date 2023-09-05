package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Usar o Consumer para imprimir a soma dos numeros
        BinaryOperator<Integer> soma = Integer::sum;
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("A soma dos números é: " + resultado);
    }
}
