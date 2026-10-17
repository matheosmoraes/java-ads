import java.util.Scanner;

public class NotaAluno{
	public static void main(String[] args){
		Scanner leia = new Scanner (System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Entre com a primeira nota do aluno: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a segunda nota do aluno: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println("Media do Aluno: " + media);
			System.out.print("APROVADO");
			}
		else {
			System.out.println("Media do Aluno: " + media);
			System.out.print("REPROVADO");}
		}
	}
