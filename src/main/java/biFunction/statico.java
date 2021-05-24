package biFunction;

import abs.IAbs;

import java.util.function.BiFunction;
import java.util.function.Function;

public class statico {

    public static void main(String[] args) {


        IAbs abs = new IAbs();

        abs.powToString(2, 4,
                Math::pow,
                (r) -> "Result : " + r);

        String result = powToString(2, 4,
                Math::pow, //(a1, a2) -> Math.pow(a1, a2),
                (r) -> "Result : " + r);

        System.out.println(result); // Result : 16.0

    }

    public static <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func,
                                    Function<Double, R> func2) {

        return func.andThen(func2).apply(a1, a2);

    }
}
