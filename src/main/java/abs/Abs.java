package abs;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Abs<T, U, R, J> {

  public J powToString(T a1, U a2, BiFunction<T, U, R> biFunction, Function<R, J> function) {
        return biFunction.andThen(function).apply(a1, a2);

    }
}
