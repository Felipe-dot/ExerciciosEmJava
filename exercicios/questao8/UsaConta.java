package questao8;

public class UsaConta {
	
	public static void main(String[] args) { 
		ContaBancaria conta = new ContaBancaria("Felipe",1593,"Caixa",4000,"05/12/2020");
		conta.saca(2000);
		conta.deposita(1000); 
		conta.recuperaDadosParaImpressao();
	}
}
