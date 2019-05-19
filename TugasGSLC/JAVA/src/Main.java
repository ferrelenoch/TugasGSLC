import java.util.Scanner;

public class Main {
	 Scanner scan = new Scanner (System.in);
	int menu, alas, tinggi, r, P, L, S;
	
	Segitiga s = new Segitiga();
	Lingkaran l = new Lingkaran();
	PersegiPanjang pp = new PersegiPanjang();
	Persegi p = new Persegi();
	Kubus k = new Kubus();
	Balok b = new Balok();
	Bola B = new Bola();
	
	public Main() {
		
		do {
			System.out.println("1. Segitiga Sama Sisi");
			System.out.println("2. Lingkaran");
			System.out.println("3. Persegi Panjang");
			System.out.println("4. Persegi");
			System.out.println("5. Kubus");
			System.out.println("6. Balok");
			System.out.println("7. Bola");
			System.out.println("8. Exit");
			menu = scan.nextInt(); scan.nextLine();
			
			if (menu == 1) {
				System.out.println("Alas: ");
				alas = scan.nextInt(); scan.nextLine();
				System.out.println("Tinggi: ");
				tinggi = scan.nextInt(); scan.nextLine();
				
				s.calculate(alas,tinggi);
			}else if (menu == 2) {
				System.out.println("Jari-jari: ");
				r = scan.nextInt(); scan.nextLine();
				
				l.calculate(r, 3.14);
			}else if(menu == 3) {
				System.out.println("Panjang: ");
				P = scan.nextInt(); scan.nextLine();
				System.out.println("Lebar: ");
				L = scan.nextInt(); scan.nextLine();
				
				pp.calculate(P, L);
			}else if (menu == 4) {
				System.out.println("Sisi: ");
				S = scan.nextInt(); scan.nextLine();
				
				p.calculate(S);
			}else if (menu == 5) {
				System.out.println("Sisi: ");
				S = scan.nextInt(); scan.nextLine();
				
				k.calculate(S);
			}else if (menu == 6) {
				P = scan.nextInt(); scan.nextLine();
				System.out.println("Lebar: ");
				L = scan.nextInt(); scan.nextLine();
				System.out.println("Tinggi: ");
				tinggi = scan.nextInt(); scan.nextLine();
				
				b.calculate(P, L, tinggi);
			}else if (menu == 7) {
				System.out.println("Jari-jari: ");
				r = scan.nextInt(); scan.nextLine();
				
				B.calculate(r, 3.14);
			}
		} while (menu!=8);
	}

	public static void main(String[] args) {
		new Main();

	}

}
