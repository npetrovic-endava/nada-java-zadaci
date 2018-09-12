
package zadatak7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Nakon unesenog niza od n brojeva, sortira niz, ispisuje da li sadrzi broj x
 * ispisuje prvih pet clanova niza
 *
 *
 * @author Nadezda Petrovic
 */

public class NizBrojeva {

	public static Scanner ulaz = new Scanner(System.in);
	public static int clanovi;
	public static int niz[];
	public static final String UNOS_DUZINE_NIZA = "Uneti broj clanova niza veci ili jednak broju 5: ";
	public static final String ISPIS_POGRESNOG_UNOSA = "Pogresan unos, broj treba da je veci ili jednak 5.";
	public static final String ISPIS_NIZA="Dobijeni sortirani niz od pet clanova je:";
	public static final String UNOS_BROJA_ZA_PROVERU="\nUneti broj za koji zelite da vidite da li je u nizu:";
	public static final String ISPIS_PRIPADA="Broj pripada nizu.";
	public static final String ISPIS_NE_PRIPADA="Broj ne pripada nizu.";
	public static final String ISPIS_POGRESNOG_PARAMETRA="Pogresan parametar, unesite ceo broj veci od 5!";
	
	public static void main(String[] args) {
		while (true) {
			System.out.println(UNOS_DUZINE_NIZA);
			// ispituje da li je unet ceo broj
			clanovi = proveraInt();

			// ispituje da li je unos broja clanova niza korektan
			if (5 > clanovi) {

				System.out.println(ISPIS_POGRESNOG_UNOSA);
			} else
				break;
		}

		niz = new int[clanovi];

		for (int i = 0; i < clanovi; i++) {
			System.out.println(new StringBuilder("Unesite ").append(i + 1).append(". clan niza"));
			niz[i] = proveraInt();
		}

		Arrays.sort(niz);
		// ispisivanje prvih pet clanova sortiranog niza

		System.out.println(ISPIS_NIZA);
		for (int i = 0; i < 5; i++) {
			System.out.print(new StringBuilder().append(niz[i]).append(" "));
		}

		// provera da li je uneti broj clan niza
		System.out.println(UNOS_BROJA_ZA_PROVERU);
		int brojX = proveraInt();
		String pripada = brojPripadaNizu(brojX);
		System.out.println(pripada);
		ulaz.close();
	}

	private static int proveraInt() {
		while (!ulaz.hasNextInt()) {
			System.out.println(ISPIS_POGRESNOG_PARAMETRA);
			ulaz.next();
		}
		return ulaz.nextInt();
	}

	private static String brojPripadaNizu(int x) {
		boolean pripadaNizu=false;
		for (int i = 0; i < clanovi; i++) {
			if (x == niz[i]) {
				pripadaNizu=true;
			}
		}
		return pripadaNizu?ISPIS_PRIPADA:ISPIS_NE_PRIPADA;
	}
}