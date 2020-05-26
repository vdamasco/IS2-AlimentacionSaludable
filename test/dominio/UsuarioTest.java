package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test
    public void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsNullNombre() {
        Persona persona = new Persona();
        Usuario usuario = new Usuario(persona);
        assertEquals(usuario.getNombre(), "");
    }

    @Test
    public void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }

    @Test
    public void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }

    @Test
    public void testGetsSetsNullNacionalidad() {
        Persona persona = new Persona();
        Usuario usuario = new Usuario(persona);
        assertEquals(usuario.getNacionalidad(), "");
    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

}
