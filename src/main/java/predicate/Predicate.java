package predicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Predicate {

    public static void main(String[] args) {

        Integer n1 = 10;
        Integer n2 = 25;

        BiPredicate<Integer, Integer> testaNumeros = (numero1, numero2) -> numero1 > 0 && numero2 > 0;
        BiFunction<Integer, Integer, Integer> soma = (numero1, numero2) -> numero1 + numero2;
        BiFunction<Integer, Integer, Integer> soma2 = Integer::sum;

        BiFunction<Integer, Integer, Integer> soma3 = Integer::sum;
        Function<Integer, String> function = String::valueOf;

        BiFunction<Integer, Integer, String> integerIntegerIntegerBiFunction = soma3.andThen(function);

        if (testaNumeros.test(n1, n2)) {
            System.out.println(soma.apply(n1, n2));
            System.out.println(soma2.apply(n1, n2));
            System.out.println(integerIntegerIntegerBiFunction.apply(2,3));
        }
    }
}
