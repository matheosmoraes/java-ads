public class FatorialV2 {
	public static void main (String [] args) {
		long t = 1; 
		long fatorial = 0;
		
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				fatorial = t*j;
				t = fatorial;
				}
			
			System.out.println("Fatorial de " + i + ": " + fatorial);
			}
		}
	}
