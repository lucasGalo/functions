package main;

import interfaces.DisplayFunction;

public class Main {
    public static void main(String[] args) {


        DisplayFunction displayFunction = new DisplayFunction() {
            @Override
            public void mostrar(String string) {
                System.out.println("Olá, " + string);
            }
        };

        displayFunction.mostrar("Lucas");


        DisplayFunction display = string -> System.out.println("olá " + string);

        display.mostrar("Galo");

    }

    ;
}
