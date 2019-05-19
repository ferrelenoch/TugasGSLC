
public class Lingkaran extends Shape {

	public void calculate (int r, double phi) {
		double luas = 3.14 * r * r ;
		double keliling = 3.14 * (2*r) ;
		System.out.println("Luas: " + luas);
		System.out.println("Keliling: " + keliling);
	}
	public Lingkaran() {
		
	}

}
