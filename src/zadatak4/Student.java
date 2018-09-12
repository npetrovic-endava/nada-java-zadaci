package zadatak4;

import java.util.Scanner;

/*
 * Program ispisuje ime studenta sa najvecim brojem poena na testu
 * prvo se unosi ukupan broj studenata, a zatim ime i broj poena svakog studenta
 *
 * @author Nadezda Petrovic
 */
public class Student {

	private static Scanner ulaz = new Scanner(System.in);
	public static final String UNOS_BROJA_STUDENATA = "Unesite broj studenata: ";
	public static final String UNOS_IMENA_STUDENATA = "Unesite ime studenta: ";
	public static final String UNOS_BROJA_POENA = "Unesite broj poena:";
	public static final String NASTAVAK_PROGRAMA = "Da li zelite da nastavite sa programom (da ili ne)?";
	public static final String NAJBOLJI_STUDENT_ISPIS = "Ime najboljeg studenta je ";
	public static final String KRAJ_PROGRAMA = "Kraj";
	public static void main(String[] args) {

         //maxPoeni dodeljujemo vrednost 0 da bismo u prvom toku if
		// naredbe imali vrednost maxPoeni= broj poena prvog studenta

		int maxPoeni = 0;
		String imeNajboljegStudenta = null;
		String imeStudenta = null;
		int poeni;

		while (true) {
			System.out.println(UNOS_BROJA_STUDENATA);
			int n = proveraInt();
			n = proveraBroj(n);

			for (int iterator = 0; iterator < n; iterator++) {
				System.out.println(UNOS_IMENA_STUDENATA);
				imeStudenta = proveraString();
				System.out.println(UNOS_BROJA_POENA);

				poeni = proveraInt();
				poeni = proveraBroj(poeni);
				if (poeni > maxPoeni) {
					// dodeljujemo maxPoeni vrednost trenutnog najveceg broja poena
					maxPoeni = poeni;
					imeNajboljegStudenta = imeStudenta;
				}
			}
			System.out.println(new StringBuilder(NAJBOLJI_STUDENT_ISPIS).append(imeNajboljegStudenta).toString());

			System.out.println(NASTAVAK_PROGRAMA);
			String nastavak = ulaz.next();
			if (!nastavak.equalsIgnoreCase("da")) {
				System.out.println(KRAJ_PROGRAMA);
				break;
			}
		}
		ulaz.close();
	}

	static String proveraString() {
		String ime = "";
		while (!ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
			if (!ime.equals("")) {
				System.out.print("Pogresan parametar, unesite ime studenta (String): ");
			}
			ime = ulaz.nextLine();
		}
		return ime;
	}

	static int proveraInt() {

		while (!ulaz.hasNextInt()) {
			System.out.println("Pogresan parametar, unesite ceo broj:");
			ulaz.next();
		}
		return ulaz.nextInt();
	}

	static int proveraBroj(int n) {
		while (0 >= n) {
			System.out.print("Pogresan parametar, unesite ceo broj veci od 0: ");
			n = ulaz.nextInt();
		}
		return n;
	}
}
