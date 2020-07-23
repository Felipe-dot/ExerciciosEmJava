package questao1;

public class Lampada {
	private Boolean estadoAtual = false;
	
	//Ligando a lâmpada
	public void liga( Boolean estadoAtual) {
		estadoAtual = true;
		setEstadoAtual(estadoAtual);
		observa(getEstadoAtual());
	}
	
	//Desligando a Lâmpada
	public void desliga( Boolean estadoAtual) {
		estadoAtual = false;
		setEstadoAtual(estadoAtual);
		observa(getEstadoAtual());
	}
	
	//Observando o estado da lâmpada
	public String observa( Boolean estadoAtual) {
		if(estadoAtual.equals(true)) {
			System.out.println("A lâmpada está ligada");
			return "A lâmpada está ligada";
		}else
			System.out.println("A lâmpada está desligada");
		    return "A lâmpada está desligada"; 
	}

	public Boolean getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(Boolean estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
}
