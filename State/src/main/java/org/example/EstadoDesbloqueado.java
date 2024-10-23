package org.example;

public class EstadoDesbloqueado extends EstadoCelular {
    private static EstadoDesbloqueado instance = new EstadoDesbloqueado();

    private EstadoDesbloqueado() {}

    public static EstadoDesbloqueado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Desbloqueado";
    }

    @Override
    public boolean bloquear(Celular celular) {
        celular.setEstado(EstadoBloqueado.getInstance());
        return true;
    }

    @Override
    public boolean ativarModoAviao(Celular celular) {
        celular.setEstado(EstadoModoAviao.getInstance());
        return true;
    }
}