package parniBrojevi;
import java.util.Scanner;

public class ParniBrojevi {

	static Scanner ulaz = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			int donjaGranica;
			int gornjaGranica;

			System.out.println("Unesite prvi broj: ");

			int a = proveraInt();

			System.out.println("Unesite drugi broj:");
			int b = proveraInt();
			
			if (a > b) {
				gornjaGranica = a;
				donjaGranica = b;
			} else {
				gornjaGranica = b;
				donjaGranica = a;
			}
           
			while (donjaGranica < gornjaGranica) {
				if (donjaGranica % 2 == 0) {
					System.out.println(donjaGranica);

				}
				donjaGranica++;
			}
			System.out.println("Da li zelite da nastavite sa programom (da ili ne)?");
			String nastavak = ulaz.next();
			if (nastavak.equalsIgnoreCase("da"))
				continue;
			else {
				System.out.println("Kraj!");
				break;
			}
			
		}
		 ulaz.close();
	}

	public static int proveraInt() {
		while (!ulaz.hasNextInt()) {
			System.out.println("Pogresan parametar!");
			ulaz.next();
		}
		return ulaz.nextInt();
	}

	
}
