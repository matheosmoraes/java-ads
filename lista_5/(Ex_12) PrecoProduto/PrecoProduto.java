import java.util.Scanner;

public class PrecoProduto {
	public static void main (String[] args){
		Scanner leia = new Scanner (System.in);
		
		
		int codigoOrigem;
		double precoProduto, frete, valorTotal;
		String regiaoProc;
		
		System.out.print("Entre com o preco do produto: ");
		precoProduto = leia.nextDouble();
		
		System.out.print("Entre com o codigo de origem: ");
		codigoOrigem = leia.nextInt();
		
		switch(codigoOrigem) {
			case 1:
				regiaoProc = "Norte";
				frete = (precoProduto*0.1);
				break;
			case 2:
			case 5:
			case 9:
				regiaoProc = "Sul";
				frete = (precoProduto*0.03);
				break;
			case 3:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				regiaoProc = "Leste";
				frete = (precoProduto*0.012);
				break;
			case 7:
			case 20:
				regiaoProc = "Oeste";
				frete = (precoProduto*0.073);
				break;
			default:
				regiaoProc = "Importado";
				frete = (precoProduto*0.222);
			}
		
		valorTotal = precoProduto + frete;
		
		System.out.print("Valor Total: R$" + valorTotal);
		}
	}
