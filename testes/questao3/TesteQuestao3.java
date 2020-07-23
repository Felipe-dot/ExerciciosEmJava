package questao3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteQuestao3 {
	
	@Test
	public void testeSeTemUmQuadrado() {
		Quadrado q = new Quadrado(2);
		
		boolean resultado = q != null;
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeCalculoDaArea() {
		Quadrado q = new Quadrado(2);
		
		double ar = q.area(q.lado);
		
		boolean resultado = (ar == (q.lado * 2));
		
		assertTrue(resultado);
	}
	
	@Test
	public void testeCalculoDoPerimetro() {
		Quadrado q = new Quadrado(2);
		
		double prm = q.perimetro(q.lado);
		
		boolean resultado = (prm == (q.lado * 4));
		
		assertTrue(resultado);
	}

}
