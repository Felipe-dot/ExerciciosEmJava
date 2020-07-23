package questao8;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestesQuestao8 {

	@Test
	public void testeSePossuoContaBancaria() {
		ContaBancaria conta = new ContaBancaria();
		
		boolean resultado = conta!= null;
		
		assertTrue(resultado);	
	}
	
	@Test
	public void testeDeSaqueContaBancaria() {
		ContaBancaria conta = new ContaBancaria();
		conta.setSaldo(550);
		conta.saca(330);
		
		boolean resultado = conta.getSaldo() == 220;
		
		assertTrue(resultado);	
	}
	
	@Test
	public void testeDeDepositoContaBancaria() {
		ContaBancaria conta = new ContaBancaria();
		conta.setSaldo(35);
		conta.deposita(70);
		boolean resultado = conta.getSaldo() == 105;
		
		assertTrue(resultado);	
	}
	
	@Test
	public void testeDeCalcularRendimentoContaBancaria() {
		ContaBancaria conta = new ContaBancaria();
		conta.setSaldo(300);
		
		boolean resultado = (conta.calculaRendimento() == 330);
		
		assertTrue(resultado);	
	}
	
	@Test
	public void testeRecuperDadosParaImpressao() {
		ContaBancaria conta = new ContaBancaria("Felipe",1245,"caixa",300,"18/04/2009");
		String test = "Olá " + "Felipe"
				 + "O numero da conta = " + 1245 
				 + "A agencia = " + "caixa" 
				 + "O saldo disponivel = " + 300
				 + "Data da abertura = " + "18/04/2009"
				 + "O valor do rendimento é de: " + 330;
		
		boolean resultado = (conta.recuperaDadosParaImpressao().equals(test));
	}
}
