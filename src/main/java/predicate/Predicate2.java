package predicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.ToIntBiFunction;

public class Predicate2 {

    public static void main(String[] args) {

        Integer n1 = 10;
        Integer n2 = 25;

        BiPredicate<Integer, Integer> testaNumeros = (numero1, numero2) -> numero1 > 0 && numero2 > 0;
        ToIntBiFunction<Integer, Integer> soma = (numero1, numero2) -> numero1 + numero2;
        ToIntBiFunction<Integer, Integer> soma2 = Integer::sum;

        if (testaNumeros.test(n1, n2)) {
            System.out.println(soma.applyAsInt(n1, n2));
            System.out.println(soma2.applyAsInt(n1, n2));
        }
    }
}
