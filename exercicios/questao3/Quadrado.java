package questao3;

public class Quadrado {
	double lado = 0.0;
	
	// Construtor
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	// Calculo da área
	public double area(double lado) {
		return lado*2;
	}
	
	// Calculo do périmetro
	public double perimetro(double lado) {
		return lado*4;
	}
	
}
