
public class Segitiga extends Shape {

	
	
	@Override
	public void calculate() {
		//double luas = 0.5 * (a*t)
		super.calculate();
	}

	public void calculate(int a, int t) {
		double luas = 0.5 * a * t;
		double keliling = a * 3 ;
		System.out.println("Luas: " + luas);
		System.out.println("Keliling: " + keliling);
	}
	
	public Segitiga() {
		
	}

}
