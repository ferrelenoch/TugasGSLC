
public class Balok {
	public void calculate (int P, int L, int T) {
		double volume = P * L * T ;
		double luas = 2 * (P*L + P*T + L*T);
		double keliling = 4 * (P + L + T) ;
		System.out.println("Volume: " + volume);
		System.out.println("Luas: " + luas);
		System.out.println("Keliling: " + keliling);
		
	}
	public Balok() {
		
	}
}
