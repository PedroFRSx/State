package org.example;

public class Celular {
    private EstadoCelular estado;

    public Celular() {
        this.estado = EstadoBloqueado.getInstance();
    }

    public void setEstado(EstadoCelular estado) {
        this.estado = estado;
    }

    public boolean desbloquear() {
        return estado.desbloquear(this);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean ativarModoAviao() {
        return estado.ativarModoAviao(this);
    }

    public boolean desativarModoAviao() {
        return estado.desativarModoAviao(this);
    }

    public String getEstadoAtual() {
        return estado.getEstado();
    }
}