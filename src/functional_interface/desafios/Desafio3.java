package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verificar se todos os numeros são positivos
        boolean todosPossitivos = numeros.stream()
                .allMatch(numero -> numero > 0);
        System.out.println("Todos os números são positivos? " + todosPossitivos);
    }
}
