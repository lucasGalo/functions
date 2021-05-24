package biFunction;

import abs.IAbs;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThen {

    public static void main(String[] args) {

        BiFunction<String, String,String> bi = (x, y) ->  x + y ;

        Function<String,String> f = x-> x+" spinner";

        System.out.println(bi.andThen(f).apply("hello", " world"));


        BiFunction<String, String,String> biF = (x, y) ->  x + y ;

        Function<String,String> fu = x-> x+" where codigo = 1";

        System.out.println(biF.andThen(fu).apply("select ", " * "));

        IAbs abs = new IAbs();
//        String apply1 = abs.andThen(fu).apply("Lucas", "Daniel ");
//        System.out.println(apply1);

        String result = powToString(2, 4,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Result : " + String.valueOf(r));

        System.out.println(result); // Result : 16.0

        String apply = abs.apply("Lucas", "Galo");
        System.out.println(apply);

    }

    public static <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func,
                                    Function<Double, R> func2) {

        return func.andThen(func2).apply(a1, a2);

    }
}
