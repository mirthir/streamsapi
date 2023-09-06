package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
        //verifique se  existe algum numero maior do que dez
        boolean existeMaiorQueDez = numeros.stream()
                .anyMatch(numero -> numero > 10);
        System.out.println("Existe algum nÚmero maior do que 10? " + existeMaiorQueDez);

        //verifique se todos os nÚmeros são maiores que zero
        boolean todosPossitivos = numeros.stream()
                .allMatch(numero -> numero > 0);
        System.out.println("Todos os nÚmeros são positivos? " + todosPossitivos);

        //verifique se nenhum nÚmero é par
        boolean nenhumNumeroPar = numeros.stream()
                .noneMatch(numero -> numero % 2 == 0);
        System.out.println("Nenhum nÚmero é par? " + nenhumNumeroPar);

        //quantos nÚmeros são pares
        long quantidadeNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0).count();
        System.out.println("Quantidade de nÚmeros pares: " + quantidadeNumerosPares);
    }
}
