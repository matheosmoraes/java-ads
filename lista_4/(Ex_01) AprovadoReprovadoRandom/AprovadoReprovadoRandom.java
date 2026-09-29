public class AprovadoReprovadoRandom {
	public static void main (String [] args){
		double nota = Math.random()*10;
		
		if (nota >= 6.0) {
			System.out.println("Nota: " + nota);
			System.out.print("APROVADO!");}
		else {
			System.out.println("Nota: " + nota);
			System.out.print("REPROVADO!");}
		}
	}
