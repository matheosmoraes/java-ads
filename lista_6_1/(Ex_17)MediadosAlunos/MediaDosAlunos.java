import java.util.Scanner;

public class MediaDosAlunos {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		Scanner leiaStr = new Scanner (System.in);
		
		boolean flag = true;
		double nota1, nota2, media;
		String resposta;
		
		while (flag) {
			System.out.print("Entre com a primeira nota: ");
			nota1 = leia.nextDouble();
			
			if (nota1 > 10 || nota1 < 0) {
				while (nota1 > 10 || nota1 < 0) {
					System.out.print("Valor invalido! Tente novamente!");
					nota1 = leia.nextDouble();
					}
				}
			System.out.print("Entre com a segunda nota: ");
			nota2 = leia.nextDouble();
			
			if (nota2 > 10 || nota2 < 0) {
				while (nota2 > 10 || nota2 < 0) {
					System.out.print("Valor invalido! Tente novamente!");
					nota2 = leia.nextDouble();
					}
				}
			
			media = (nota1 + nota2)/2;
			
			System.out.println("Media do Aluno: " + media);
			
			
			
			
			System.out.print ("NOVO CALCULO? S OU N: ");
			resposta = leiaStr.nextLine();
			
			if (resposta.equalsIgnoreCase("N") || resposta.equalsIgnoreCase("n") ) {
				System.out.print("Encerrando o programa...");
				System.exit(0);
				}
			
			}
		}
	}
