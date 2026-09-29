public class ADivisivelPorBRandom {
	public static void main (String[] args) {
		int a = (int) (Math.random()*1000);
		int b = (int) (Math.random()*20);
		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		
		if (a % b == 0) {
			System.out.print("A eh divisivel por B.");
			}
		else {
			System.out.print("A NAO eh divisivel por B.");
			}
		}
	}
