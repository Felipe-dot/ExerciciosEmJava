package questao3;

public class UsaQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		

		System.out.println("Quadrado 1");
		System.out.println("A área do quadrado é " + q1.area(q1.lado));
		System.out.println("O périmetro do quadrado é " + q1.perimetro(q1.lado));
		
		System.out.println("Quadrado 2");
		System.out.println("A área do quadrado é " + q2.area(q2.lado));
		System.out.println("O périmetro do quadrado é " + q2.perimetro(q2.lado));

		System.out.println("Quadrado 3");
		System.out.println("A área do quadrado é " + q3.area(q3.lado));
		System.out.println("O périmetro do quadrado é " + q3.perimetro(q3.lado));
		
		
	}
}
