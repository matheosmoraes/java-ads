public class VerificaValorProdutoRandom{
	public static void main (String[] args){
		double produto1 = Math.random()*1000;
		double produto2 = Math.random()*1000;
		
		System.out.println("Produto 1: RS$" + produto1);
		System.out.println("Produto 2: RS$" + produto2);
		
		if (produto1 < produto2) {
			System.out.print("Produto 1 eh o mais barato!");}
		else {
			System.out.println("Produto 2 eh o mais barato");}
		}
	}
