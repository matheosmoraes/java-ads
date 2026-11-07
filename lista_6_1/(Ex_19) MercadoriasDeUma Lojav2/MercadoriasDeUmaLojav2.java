import java.util.Scanner;

public class MercadoriasDeUmaLojav2 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		Scanner leiaStr = new Scanner (System.in);
		
		int qntdMercadorias;
		double valorMercadoria, media, soma = 0;
		String resposta;
		
		System.out.print("Quantas mercadorias a loja possui?: ");
		qntdMercadorias = leia.nextInt();
		
		for (int i = 1; i <= qntdMercadorias; i++) {
		System.out.print("Valor da Mercadoria: R$ ");
		valorMercadoria = leia.nextDouble();
		
		soma += valorMercadoria;
		}
		
		media = soma/qntdMercadorias;
		
		System.out.println("Media de valor das mercadorias: " + media);
		
		System.out.println("MAIS MERCADORIAS? S OU N: ");
		resposta = leiaStr.nextLine();
		
		if (resposta.equalsIgnoreCase("N")) {
			System.out.print("Encerrando o programa...");
			System.exit(0);
			}
		
	}
}
