
public class PersegiPanjang extends Shape{
	public void calculate (int P, int L) {
		double luas = P * L ;
		double keliling = (2*P) + (2*L);
		System.out.println("Luas: " + luas);
		System.out.println("Keliling: " + keliling);
	}
	public PersegiPanjang() {
		
	}
}
