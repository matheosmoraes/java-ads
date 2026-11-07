public class TabuadaDo1ao10 {
	public static void main (String [] args) {
		int tabuada, n;
	
		for (int i = 1; i <= 10; i++) {
		n = i;
		
		for (int j = 1; j <= 10; j++) {
			tabuada = j*n;
			System.out.println(n + " x " + j + " = " + tabuada);
			}
		System.out.println();
		}
		}
		
	}

