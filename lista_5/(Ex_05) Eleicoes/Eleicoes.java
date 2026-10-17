import java.util.Scanner;

public class Eleicoes {
	public static void main(String[] args){
		Scanner leia = new Scanner (System.in);
		
		int anoAtual, anoNascimento, idade;
		
		System.out.print("Entre com o ano atual: ");
		anoAtual = leia.nextInt();
		
		System.out.print("Entre com seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		if (anoAtual < anoNascimento) {
			System.out.print("ERRO: ANO DE NASCIMENTO INVALIDO!");
			System.exit(0);
			}
		
		idade = anoAtual - anoNascimento;
		
		if (idade < 16) {
			System.out.print("NAO PODE VOTAR!");}
		else {
			if (idade >= 16 && idade < 18) {
				System.out.print("PODE VOTAR!");
				}
			else {
				System.out.print("OBRIGATORIO VOTAR!");}
			}
		}
	}
