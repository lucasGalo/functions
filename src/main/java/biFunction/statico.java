package biFunction;

import abs.Abs;
import abs.IAbs;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import models.Pessoa;

import java.util.function.BiFunction;
import java.util.function.Function;

public class statico {

    public static void main(String[] args) {

        Gson gson = new Gson();
        IAbs abs = new IAbs();

        abs.powToString(2, 4,
                Math::pow,
                (r) -> "Result : " + r);

        BiFunction<String, String,String> bi = (x, y) ->  x + y ;
        Function<String,String> fu = x-> x+" where codigo = 1";
        Abs absG = new Abs<String, String, String, String>();

        String o = (String) absG.powToString("select *", " from tabela",
                (x, y) -> x + "" + y,
                (x) -> x + " where codigo = 1");

        String pessoaJson = (String) absG.powToString("Lucas", 30,
                Pessoa::new,
                gson::toJson);

        System.out.println(pessoaJson);

//        String pessoa = (String) absG.powToString("Lucas", 30,
//                Pessoa::new,
//                (p) -> gson.fromJson((String) p, Pessoa.class));
        Pessoa pessoa = gson.fromJson(pessoaJson, Pessoa.class);

        System.out.println(pessoa.getNome());

        String o1 = (String) absG.powToString(pessoaJson, Pessoa.class,
                (s, obj) -> gson.fromJson((String)s,(Class) obj),
                gson::toJson);

        System.out.println(o1);

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
