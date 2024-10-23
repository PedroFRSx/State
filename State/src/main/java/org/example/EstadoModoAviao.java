package org.example;

public class EstadoModoAviao extends EstadoCelular {
    private static EstadoModoAviao instance = new EstadoModoAviao();

    private EstadoModoAviao() {}

    public static EstadoModoAviao getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Modo Avião";
    }

    @Override
    public boolean desativarModoAviao(Celular celular) {
        celular.setEstado(EstadoDesbloqueado.getInstance());
        return true;
    }
}
