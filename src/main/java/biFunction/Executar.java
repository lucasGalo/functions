package biFunction;

import abs.Abs;
import abs.IAbs;
import com.google.gson.Gson;
import interfaces.DisplayFunction;
import models.Pessoa;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Executar {

    public static void main(String[] args) {


        Abs absG = new Abs<String, String, Pessoa, DisplayFunction>();

        Object lucas = absG.powToString("Lucas", 30,
                Pessoa::new,
                (t) -> (DisplayFunction) string -> System.out.println(t.toString()));


    }
}
