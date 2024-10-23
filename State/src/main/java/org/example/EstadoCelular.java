package org.example;

public abstract class EstadoCelular {
    public abstract String getEstado();

    public boolean desbloquear(Celular celular) {
        return false;
    }

    public boolean bloquear(Celular celular) {
        return false;
    }

    public boolean ativarModoAviao(Celular celular) {
        return false;
    }

    public boolean desativarModoAviao(Celular celular) {
        return false;
    }
}