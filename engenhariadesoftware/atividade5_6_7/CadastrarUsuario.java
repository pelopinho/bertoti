package com.example;

public class CadastrarUsuario {
    private int cpf;
    private String nome;
    private int idade;


    public CadastrarUsuario (String nome, int idade, int cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }
    public String getNome() {

        return nome;
    }
    public int getIdade() {

        return idade;
    }
}

