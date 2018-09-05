import java.util.Random;
import java.util.Scanner;



public class Loto {
	static Scanner ulaz = new Scanner(System.in);
	public static void main(String[] args) {

		while (true) {

			
			Random r = new Random();
			int slucajanBroj = r.nextInt(50) + 1;
			StringBuilder sb = new StringBuilder("Trazeni broj je ");
			System.out.println("Unesite ceo broj do 1-50:");

			// ispituje da li je unet ispravan format
			if (ulaz.hasNextInt()) {
				int unetiBroj = ulaz.nextInt();

				// ispituje interval vrednosti
				if (51 > unetiBroj && 0 < unetiBroj) {

					// ispituje uspesnost u pogadjanju broja
					if (slucajanBroj == unetiBroj)
						System.out.println("Neverovatno!Pogodili ste tacan broj!");

					else if (5 >= Math.abs(unetiBroj - slucajanBroj)) {
						
						System.out.println(sb.append(slucajanBroj).append(". Dobar pokusaj, bili ste jako blizu!"));
						
					} else
						System.out.println(sb.append(slucajanBroj).append(", vise srece drugi put!"));
			

					System.out.println("Da li zelite da nastavite sa programom (da ili ne)?");
					String nastavak = ulaz.next();
					if (nastavak.equalsIgnoreCase("da"))
						continue;
					else {
						System.out.println("Kraj!");
						break;
					}

				} else {
					System.out.println("Pogresan interval, uneti broj treba da bude u intervalu 1-50!");
					continue;
				}

			} else {
				System.out.println("Pogresan format, unesite ceo broj!");
				continue;
			}
			
		}
		ulaz.close();
	}

}
