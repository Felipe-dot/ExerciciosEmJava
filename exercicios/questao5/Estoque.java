package questao5;

import java.util.Scanner;

public class Estoque {
	Scanner teclado = new Scanner(System.in);
	
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public Estoque() {
		
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	// Metódos
	public void mudarNome(String nome) {
		// System.out.println("Digite o novo nome: ");
		// nome = teclado.nextLine();
		setNome(nome);	
	}

	public void mudarQtdMinima(int qtdMinima) {
		// System.out.println("Digite a nova quantidade minima: ");
		// qtdMinima = Integer.valueOf(teclado.nextLine());
		if(qtdMinima >= 0) {
			setQtdMinima(qtdMinima);		
		}else
			System.out.println("Valor Inválido");
	}
	
	public void repor(int qtd) {
		setQtdAtual(qtd);
	}
	
	public void darBaixa(int qtd) {
		qtd = getQtdAtual() - qtd;
		if(qtd >= 0) {
			setQtdAtual(qtd);	
		}else
			System.out.println("Valor Inválido");
	}
	
	public String mostrar() {
		return  "Nome =" + getNome() + "  Qtd atual =" + getQtdAtual() + " Qtd Minima =" + getQtdMinima();
	}
	
	public boolean precisaRepor() {
		if(getQtdAtual() <= getQtdMinima()) {
			return true;
		}else
			return false;
	}
	

}
