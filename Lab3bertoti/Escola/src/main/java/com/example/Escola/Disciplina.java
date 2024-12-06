package com.example.Escola;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Disciplina {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String nomeDisciplina;

    public Disciplina() {

    }

    public Disciplina(String name) {
        this.id = UUID.randomUUID().toString();
        this.nomeDisciplina = name;
    }
}
