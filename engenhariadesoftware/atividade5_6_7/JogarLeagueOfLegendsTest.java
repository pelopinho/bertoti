import com.example.CadastrarUsuario;
import com.example.JogarLeagueOfLegends;
import com.example.LeagueOfLegends;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class JogarLeagueOfLegendsTest {

    @Test
    public void testAdicionarUsuario() {
        JogarLeagueOfLegends jogo = new JogarLeagueOfLegends();
        CadastrarUsuario usuario = new CadastrarUsuario("Pedro", 25, 123456789);

        jogo.adicionarUsuario(usuario);

        assertEquals(1, jogo.getUsuarios().size());
        assertEquals("Pedro", jogo.getUsuarios().get(0).getNome());
    }

    @Test
    public void testAdicionarPartida() {
        JogarLeagueOfLegends jogo = new JogarLeagueOfLegends();
        LeagueOfLegends partida = new LeagueOfLegends("Pedro", "Yasuo", "Normal");

        jogo.adicionarPartida(partida);

        assertEquals(1, jogo.getPartidas().size());
        assertEquals("Yasuo", jogo.getPartidas().get(0).getCampeao());
    }

    @Test
    public void testAssociarUsuarioAPartida() {
        JogarLeagueOfLegends jogo = new JogarLeagueOfLegends();
        CadastrarUsuario usuario = new CadastrarUsuario("Pedro", 20, 135246);
        jogo.adicionarUsuario(usuario);

        LeagueOfLegends partida = new LeagueOfLegends("Pedro", "Yasuo", "Normal");
        jogo.adicionarPartida(partida);

        jogo.associarUsuarioAPartida(135246, "Yasuo", "Normal");

        assertEquals("Pedro", jogo.getPartidas().get(0).getUsuario());
    }

    @Test
    public void testListarPartidas() {
        JogarLeagueOfLegends jogo = new JogarLeagueOfLegends();
        LeagueOfLegends partida1 = new LeagueOfLegends("Pedro", "Yasuo", "Normal");
        LeagueOfLegends partida2 = new LeagueOfLegends("Maria", "Jinx", "Ranked");

        jogo.adicionarPartida(partida1);
        jogo.adicionarPartida(partida2);

        ArrayList<LeagueOfLegends> partidas = jogo.getPartidas();

        assertEquals(2, partidas.size());
        assertEquals("Yasuo", partidas.get(0).getCampeao());
        assertEquals("Jinx", partidas.get(1).getCampeao());
    }
}
