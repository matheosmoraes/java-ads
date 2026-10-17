import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args){
		Scanner leia = new Scanner (System.in);
		Scanner leiaStr = new Scanner (System.in);
		
		int numero1, numero2;
		double calculo;
		String sinal;
		
		System.out.print("Entre com o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		numero2 = leia.nextInt();
		
		System.out.print("Entre com o tipo de calculo + - * /: ");
		sinal = leiaStr.nextLine();
		
		switch (sinal) {
			case "+":
				calculo = numero1 + numero2;
				System.out.print(" " + numero1 + " + " + numero2 + " = " + calculo);
				break;
			case "-":
				calculo = numero1 - numero2;
				System.out.print(" " + numero1 + " - " + numero2 + " = " + calculo);
				break;
			case "*":
				calculo = numero1 * numero2;
				System.out.print(" " + numero1 + " x " + numero2 + " = " + calculo);
				break;
			case "/":
				calculo = numero1/numero2;
				System.out.print(" " + numero1 + " / " + numero2 + " = " + calculo);
				break;
			default:
				System.out.print("ERRO: SINAL INVALIDO!");
				}
			
			
		}
	}
