package questao1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteQuestao1 {
 
	@Test
	public void testeSeTemUmaLampada() {
		Lampada a = new Lampada();
		
		boolean resultado = a != null;
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeLigaLampada() {
		Lampada a = new Lampada();
		
		a.liga(a.getEstadoAtual());

		boolean resultado =  a.getEstadoAtual();
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeDesligaLampada() {
		Lampada a = new Lampada();
		
		a.desliga(a.getEstadoAtual());
		
		boolean resultado = a.getEstadoAtual();
		
		assertFalse(resultado);
	}
	
	@Test
	public void testeObservaLampada() {
		Lampada a = new Lampada();
		String test = "";
		String test1 = "";
		
		a.liga(a.getEstadoAtual());
		
		if(a.getEstadoAtual() == true) {
			test = a.observa(a.getEstadoAtual());
			a.desliga(a.getEstadoAtual());		
		}if(a.getEstadoAtual()== false) {
			test1 = a.observa(a.getEstadoAtual());
			
		}
		
		boolean resultado = (test.equals("A lâmpada está ligada") && test1.equals("A lâmpada está desligada"));		
			
		assertTrue(resultado);
	}
}
