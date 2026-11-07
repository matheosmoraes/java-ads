import java.util.Scanner;

public class Cidade {
	public static void main (String [] args) {
		Scanner leiaDouble = new Scanner (System.in);
		Scanner leiaInt = new Scanner (System.in);
		
		int filhos;
		double salario, mediaSalario, mediaFilhos, percentual, maiorSalario = 0, somaSalario = 0, somaFilhos = 0, qntdPessoas = 0, baixoSalario = 0;
		
		
		while (true) {
			System.out.print ("Qual seu salario: R$");
			salario = leiaDouble.nextDouble();
			somaSalario += salario;
			
			if (salario < 0) {
				break;
				}
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
				}
			
			if (salario < 150) {
				baixoSalario++;
				}
			
			System.out.print ("Quantos filhos voce tem: ");
			filhos = leiaInt.nextInt();
			somaFilhos += filhos;
			
			qntdPessoas++;
			}
		
		if (qntdPessoas > 0) {
			mediaSalario = somaSalario/qntdPessoas;
			mediaFilhos = somaFilhos/qntdPessoas;
			percentual = (baixoSalario*100)/qntdPessoas;
			
			System.out.println("Media de salario da populacao: R$" + mediaSalario);
			System.out.println("Media de filhos da populacao: " + mediaFilhos);
			System.out.println("Maior salario dentre a populacao: R$" + maiorSalario);
			System.out.print("Percentual de pessoas que ganham abaixo de R$150: " + percentual + "%");}
		else {
			System.out.print("Nenhum dado foi informado.");
			}
		}
	}
