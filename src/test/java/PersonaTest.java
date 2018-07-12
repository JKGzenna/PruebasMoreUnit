import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
	
	private Persona persona;

	@Before
	public void setUp() throws Exception {
		persona = new Persona ("Juan", "Goldaracena");
	}

	@Test
	public void testGetNombre() throws Exception {
		//given  //condiciones previas

		//when  //ejecucion del método a probar

		//then  //condiciones que comprobamos que se cumplan para validar el test
		Assert.assertTrue(persona.getNombre().equals("Juan"));
		
		
	}

}
