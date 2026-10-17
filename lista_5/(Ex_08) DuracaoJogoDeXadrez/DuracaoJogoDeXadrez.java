import java.util.Scanner;

public class DuracaoJogoDeXadrez {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int horaInicio, horaFim, tempoDuracao;
		
		System.out.print("Hora de inicio do jogo de xadrez: ");
		horaInicio = leia.nextInt();
		
		if (horaInicio > 24) {
			System.out.print("ERRO: HORA INVALIDA!");
			System.exit(0);}
		
		System.out.print("Hora do fim do jogo de xadrez: ");
		horaFim = leia.nextInt();
		
		tempoDuracao = horaFim - horaInicio;
		
		if (tempoDuracao < 0) {
			tempoDuracao += 24;}
		
		System.out.print("Tempo de duracao da partida de xadrez: " + tempoDuracao + "h");
	}
}
