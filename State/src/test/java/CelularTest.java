import org.example.Celular;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class CelularTest {
    Celular celular;

    @BeforeEach
    public void setUp() {
        celular = new Celular();
    }

    @Test
    public void deveDesbloquearCelularBloqueado() {
        assertTrue(celular.desbloquear());
        assertEquals("Desbloqueado", celular.getEstadoAtual());
    }

    @Test
    public void deveAtivarModoAviaoDesbloqueado() {
        celular.desbloquear();
        assertTrue(celular.ativarModoAviao());
        assertEquals("Modo Avião", celular.getEstadoAtual());
    }

    @Test
    public void deveBloquearCelularDesbloqueado() {
        celular.desbloquear();
        assertTrue(celular.bloquear());
        assertEquals("Bloqueado", celular.getEstadoAtual());
    }

    @Test
    public void deveDesativarModoAviao() {
        celular.desbloquear();
        celular.ativarModoAviao();
        assertTrue(celular.desativarModoAviao());
        assertEquals("Desbloqueado", celular.getEstadoAtual());
    }

    @Test
    public void naoDeveDesbloquearCelularDesbloqueado() {
        celular.desbloquear();
        assertFalse(celular.desbloquear());
    }

    @Test
    public void naoDeveAtivarModoAviaoBloqueado() {
        assertFalse(celular.ativarModoAviao());
    }

    @Test
    public void naoDeveDesativarModoAviaoDesbloqueado() {
        celular.desbloquear();
        assertFalse(celular.desativarModoAviao());
    }
}