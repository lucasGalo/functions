package models;

import interfaces.DisplayFunction;

public class Pessoa implements DisplayFunction {

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;
    private Integer idade;

    public Pessoa(Object nome, Object idade) {
        setNome((String) nome);
        setIdade((Integer) idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void mostrar(String string) {
        System.out.println("mostrar");
    }
}
