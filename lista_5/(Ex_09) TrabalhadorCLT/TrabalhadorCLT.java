import java.util.Scanner;

public class TrabalhadorCLT{
	public static void main (String [] args){
		Scanner leia = new Scanner (System.in);
		
		int horaMedia, horaMensal;
		double salarioHora, salarioMensal;
		
		horaMedia = 40*4;
		
		System.out.print("Entre com a quantidade de horas trabalhadas no mes: ");
		horaMensal = leia.nextInt();
		
		System.out.print("Entre com o salario por hora: ");
		salarioHora = leia.nextInt();
		
		if (horaMensal > horaMedia) {
			double horaExtra = ((horaMensal - horaMedia)*salarioHora)*1.5;
			salarioMensal = (horaMedia * salarioHora) + horaExtra;}
		
		else {
			salarioMensal = horaMensal * salarioHora;
			}
		
		System.out.print("Salario Mensal: R$" + salarioMensal);
	}
}
