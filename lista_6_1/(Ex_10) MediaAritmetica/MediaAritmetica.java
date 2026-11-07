import java.util.Scanner;

public class MediaAritmetica {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor, somaValor = 0, divisao = 10;
		double media;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
			
			somaValor += valor;
			}
		
		media = somaValor/divisao;
		
		System.out.print("Media dos 10 valores: " + media);
	}
}
