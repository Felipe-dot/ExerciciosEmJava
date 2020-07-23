 package questao8;

public class ContaBancaria {
	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nome, int numero, String agencia, double saldo, String dataDeAbertura) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public void saca(double qtd) { 
		qtd = getSaldo() - qtd;
		if(qtd >= 0) {
			setSaldo(qtd);		
		}else
			System.out.println("Valor invalido para saque");
	}
	
	public void deposita(double qtd) {
		setSaldo(getSaldo() + qtd);
	}
	
	public double calculaRendimento() {
		System.out.println("O valor do rendimento é de: " + (getSaldo()* 0.1 + getSaldo()));
		return (getSaldo()* 0.1 + getSaldo());
	}
	
	public String recuperaDadosParaImpressao() {
		System.out.println("Olá " + getNome());
		System.out.println("O numero da conta = " + getNumero());
		System.out.println("A agencia = " + getAgencia());
		System.out.println("O saldo disponivel = " + getSaldo());
		System.out.println("Data da abertura = " + getDataDeAbertura());
		System.out.println("O valor do rendimento é de: " + (getSaldo()* 0.1 + getSaldo()));
		
		return "Olá " + getNome() 
			 + "O numero da conta = " + getNumero() 
			 + "A agencia = " + getAgencia() 
			 + "O saldo disponivel = " + getSaldo()
			 + "Data da abertura = " + getDataDeAbertura()
			 + "O valor do rendimento é de: " + (getSaldo()* 0.1 + getSaldo());
	}

	
}
