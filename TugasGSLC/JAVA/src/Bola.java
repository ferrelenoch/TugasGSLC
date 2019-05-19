
public class Bola {
	public void calculate (int r, double phi) {
		double volume = 4/3 * 3.14 * (r * r * r) ;
		double luas = 4 * 3.14 * (r * r) ;
		double keliling = 4/3 * 3.14 * (r * r) ;
		System.out.println("Volume: " + volume);
		System.out.println("Luas: " + luas);
		System.out.println("Keliling: " + keliling);
		
	}
	public Bola() {
		
	}
}
