public class NumerosPrimosV2 {
	public static void main (String [] args) {
		for (int i = 1; i <= 100; i++) {
			boolean numeroPrimo = true;
			
			if (i <= 1) {
				numeroPrimo = false;
				}
			else {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						numeroPrimo = false;
						}
				}
			}
			if (numeroPrimo == true) {
				System.out.println(i);
				}
		}
	}
}
