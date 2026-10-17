import java.util.Scanner;

public class VendedorDeUmaEmpresa {
	public static void main (String[] args){
		Scanner leia = new Scanner (System.in);
		
		double salarioFixo, vendasEfetuadas, salarioTotal;
		
		System.out.print("Entre com o salario fixo: ");
		salarioFixo = leia.nextDouble();
		
		System.out.print("Entre com o valor das vendas efetuadas: ");
		vendasEfetuadas = leia.nextDouble();
		
		if (vendasEfetuadas >= 1500) {
			double comissao = (1500*0.03) + ((vendasEfetuadas - 1500)*0.05);
			salarioTotal = salarioFixo + comissao;
			}
		else {
			salarioTotal = salarioFixo;
			}
		
		System.out.print("Salario total do funcionario: R$" + salarioTotal);
		}
	}
