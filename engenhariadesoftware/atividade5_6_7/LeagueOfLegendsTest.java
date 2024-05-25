import com.example.LeagueOfLegends;
import org.junit.Test;
import static org.junit.Assert.*;

public class LeagueOfLegendsTest {

    @Test
    public void testLeagueOfLegends() {
        LeagueOfLegends partida = new LeagueOfLegends("Pedro", "Yasuo", "Normal");

        assertEquals("Pedro", partida.getUsuario());
        assertEquals("Yasuo", partida.getCampeao());
        assertEquals("Normal", partida.getTipoPartida());
    }

    @Test
    public void testSetUsuario() {
        LeagueOfLegends partida = new LeagueOfLegends("Pedro", "Yasuo", "Normal");
        partida.setUsuario("Pedro");

        assertEquals("Pedro", partida.getUsuario());
    }
}
