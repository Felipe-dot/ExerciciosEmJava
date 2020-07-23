package questao5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestesQuestao5 {

	
	@Test
	public void testSeTenhoEstoque() {
		Estoque estq = new Estoque();
		
		boolean resultado = estq != null;
		
		assertTrue(resultado);
	}
	

	@Test
	public void testMudarDeNome() {
		
		Estoque estq = new Estoque();
		estq.setNome("Felipe");
		estq.mudarNome("Lucas");
		
		boolean resultado = estq.getNome().equals("Lucas");
		
		assertTrue(resultado);
	}
	

	@Test
	public void testMudarQtdMinima() {
		Estoque estq = new Estoque();
		estq.setQtdMinima(7);
		estq.mudarQtdMinima(10);
		
		boolean resultado = estq.getQtdMinima() == 10;
		
		assertTrue(resultado);
	}
	

	@Test
	public void testReporEstoque() {
		Estoque estq = new Estoque();
		estq.setQtdAtual(56);
		estq.repor(75);
		
		boolean resultado = estq.getQtdAtual() == 75;
		
		assertTrue(resultado);
	}
	

	@Test
	public void testDarBaixaNoEstoque() {
		Estoque estq = new Estoque();
		estq.setQtdAtual(56);
		estq.darBaixa(56);
		
		boolean resultado = estq.getQtdAtual() == 0;
		
		assertTrue(resultado);
	}
	

	@Test
	public void testExibirEstoque() {
		Estoque estq = new Estoque();
		estq.setNome("felipe");
		estq.setQtdAtual(15);
		estq.setQtdMinima(6);
		
		boolean resultado = estq.mostrar().equals( "Nome =" + "felipe" 
												+ "  Qtd atual =" + 15 
												+ " Qtd Minima =" + 6);
		
		assertTrue(resultado);
	}
	
	@Test
	public void testPrecisaRepor() {
		Estoque estq = new Estoque();
		estq.setQtdAtual(4);
		estq.setQtdMinima(6);
		
		//Precisa repor irá retornar true, indicando que precisa repor o estoque
		boolean resultado = estq.precisaRepor();
		
		assertTrue(resultado);
		
	}
}
