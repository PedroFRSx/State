package org.example;

public class EstadoBloqueado extends EstadoCelular {
    private static EstadoBloqueado instance = new EstadoBloqueado();

    private EstadoBloqueado() {}

    public static EstadoBloqueado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Bloqueado";
    }

    @Override
    public boolean desbloquear(Celular celular) {
        celular.setEstado(EstadoDesbloqueado.getInstance());
        return true;
    }
}
