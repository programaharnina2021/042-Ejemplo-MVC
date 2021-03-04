package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NombradorTest {
	private String nombres[]= {"anacleto","benvenuto","cirilo","diocleciano"};
	
	@Test
	void testGiveMeMyName() {
		Nombrador instancia=new Nombrador();
		char letras[]= {'a','c','d','k','b'};
		String respuestas[]= {nombres[0],nombres[2],nombres[3],"Romualdo",nombres[1]};
		for (int i = 0; i < respuestas.length; i++) {
			String giveMeMyName = instancia.giveMeMyName(letras[i]);
			assertTrue(giveMeMyName.equals(respuestas[i]));
		}
	}

}
