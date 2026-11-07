public class FibonacciV3 {
	public static void main(String [] args) {
		int a, b, c;
		a = 0;
		b = 1;
		c = 0;
		
		while (c <= 250) {
			c = a + b;
			
			if (c > 250) {
				break;
				}
			else {
				System.out.print (c);
				a = b;
				b = c;
				
				if (c < 250) {
					System.out.print(", ");
				}
			}
		}
	}
