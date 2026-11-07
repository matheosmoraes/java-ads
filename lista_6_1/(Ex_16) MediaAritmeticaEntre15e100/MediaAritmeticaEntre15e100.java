public class MediaAritmeticaEntre15e100 {
	public static void main (String[] args) {
		int soma = 0, divisao = 100- 15;
		double media;
		
		for (int i = 15; i <= 100; i++) {
			soma += i;
			}
		
		media = soma/divisao;
		
		System.out.print("Media aritmetica dos valores entre 15 e 100: " + media);
		}
	}
