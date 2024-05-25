package com.example;

public class LeagueOfLegends {
    private String usuario;
    private String campeao;
    private String tipoPartida;

    public LeagueOfLegends(String usuario, String campeao, String tipoPartida) {
        this.usuario = usuario;
        this.campeao = campeao;
        this.tipoPartida = tipoPartida;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCampeao() {
        return campeao;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }
}
