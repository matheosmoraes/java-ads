import java.util.Scanner;

public class SomandoDezNumeros{
	public static void main (String [] args){
		Scanner leia = new Scanner (System.in);
		
		int valor, soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
			
			soma += valor;
			}
		
		System.out.print("Soma dos dez valores: " + soma);
		}
	}
