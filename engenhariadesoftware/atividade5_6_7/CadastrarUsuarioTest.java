import com.example.CadastrarUsuario;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadastrarUsuarioTest {

    @Test
    public void testGetNome() {
        CadastrarUsuario usuario = new CadastrarUsuario("Pedro", 20, 135246);
        assertEquals("Pedro", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        CadastrarUsuario usuario = new CadastrarUsuario("Pedro", 20, 135246);
        assertEquals(20, usuario.getIdade());
    }
}
