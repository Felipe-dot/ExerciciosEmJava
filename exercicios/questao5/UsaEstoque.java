package questao5;

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta",13,6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",11,13);
		Estoque estoque3 = new Estoque("Mouse Ótico",6,2);

		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		System.out.println("estoque 1 : " + estoque1.precisaRepor());
		System.out.println("estoque 2 : " + estoque2.precisaRepor());
		System.out.println("estoque 3 : " + estoque3.precisaRepor());
		System.out.println(estoque1.mostrar());
		System.out.println(estoque2.mostrar());
		System.out.println(estoque3.mostrar());
		
	}

}
