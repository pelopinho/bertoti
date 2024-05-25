package com.example;

import java.util.ArrayList;

public class JogarLeagueOfLegends {
    private ArrayList<LeagueOfLegends> partidas;
    private ArrayList<CadastrarUsuario> usuarios;

    public JogarLeagueOfLegends() {
        this.partidas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(CadastrarUsuario usuario) {
        for (CadastrarUsuario u : usuarios) {
            if (u.getCpf() == usuario.getCpf()) {
                System.out.println("Usuário com CPF " + usuario.getCpf() + " já existe.");
                return;
            }
        }
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " adicionado com sucesso!");
    }

    public void adicionarPartida(LeagueOfLegends partida) {
        for (LeagueOfLegends p : partidas) {
            if (p.getUsuario().equalsIgnoreCase(partida.getUsuario()) &&
                    p.getCampeao().equalsIgnoreCase(partida.getCampeao()) &&
                    p.getTipoPartida().equalsIgnoreCase(partida.getTipoPartida())) {
                System.out.println("Essa partida já existe.");
                return;
            }
        }
        partidas.add(partida);
        System.out.println("Partida com o usuário " + partida.getUsuario() + " adicionada com sucesso!");
    }

    public void associarUsuarioAPartida(int cpf, String campeao, String tipoPartida) {
        CadastrarUsuario usuarioEncontrado = null;
        for (CadastrarUsuario usuario : usuarios) {
            if (usuario.getCpf() == cpf) {
                usuarioEncontrado = usuario;
                break;
            }
        }
        if (usuarioEncontrado == null) {
            System.out.println("Usuário com CPF " + cpf + " não encontrado.");
            return;
        }

        for (LeagueOfLegends partida : partidas) {
            if (partida.getCampeao().equalsIgnoreCase(campeao) &&
                    partida.getTipoPartida().equalsIgnoreCase(tipoPartida) &&
                    partida.getUsuario().equalsIgnoreCase("")) {
                partida.setUsuario(usuarioEncontrado.getNome());
                System.out.println("Usuário " + usuarioEncontrado.getNome() + " associado à partida com o campeão " + partida.getCampeao());
                return;
            }
        }
        System.out.println("Partida com o campeão " + campeao + " e tipo " + tipoPartida + " não encontrada ou já está associada a um usuário.");
    }

    public void listarPartidas() {
        System.out.println("Partidas disponíveis:");
        for (LeagueOfLegends partida : partidas) {
            if (partida.getUsuario().equalsIgnoreCase("")) {
                System.out.println("Campeão: " + partida.getCampeao() + ", Tipo de Partida: " + partida.getTipoPartida() + " (Não associada a um usuário)");
            } else {
                System.out.println("Usuário: " + partida.getUsuario() + ", Campeão: " + partida.getCampeao() + ", Tipo de Partida: " + partida.getTipoPartida());
            }
        }
    }

    public ArrayList<LeagueOfLegends> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<LeagueOfLegends> partidas) {
        this.partidas = partidas;
    }

    public ArrayList<CadastrarUsuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<CadastrarUsuario> usuarios) {
        this.usuarios = usuarios;
    }
}
