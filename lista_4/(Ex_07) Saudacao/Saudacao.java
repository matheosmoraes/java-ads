import java.util.Scanner;

public class Saudacao {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean ok_hora;
		
		System.out.print("Que horas sao?: ");
		int hora = leia.nextInt();
		
		if (hora < 0 || hora > 24) {
			ok_hora = false;
			System.out.print("ERRO: HORA INVALIDA!");
			System.exit(0);
			}
		else {
			ok_hora = true;}
		
		if (hora <= 6) {
			System.out.print("Zzzzz");
			}
		
		if (hora > 6 && hora <= 11) {
			System.out.print("Bom dia");
			}
		
		if (hora > 11 && hora <= 17) {
			System.out.print("Boa tarde");
			}
		
		if (hora > 17 && hora <= 24) {
			System.out.print("Boa noite");
			}
	}
}
