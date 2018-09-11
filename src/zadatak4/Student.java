package zadatak4;

import java.util.Scanner;

/*
 * Program ispisuje ime studenta sa najvecim brojem poena na testu
 * prvo se unosi ukupan broj studenata, a zatim ime i broj poena svakog studenta
 */

/**
 *
 * @author Nadezda Petrovic
 */

public class Student {

	static Scanner ulaz = new Scanner(System.in);

	public static void main(String[] args) {

//maxPoeni dodeljujemo vrednost 0 da bismo u prvom toku if naredbe imali vrednost maxPoeni= broj poena prvog studenta

		int maxPoeni = 0;
		String imeNajboljegStudenta = "";
		String imeStudenta = "";
		int poeni;
		String komentar1 = "Unesite broj studenata:";
		String komentar2 = "Unesite ime studenta:";
		String komentar3 = "Unesite broj poena:";
		String komentar4 = "Da li zelite da nastavite sa programom (da ili ne)?";

		while (true) {
			System.out.println(komentar1);
			int n = proveraInt();
			n = proveraBroj(n);
			
			for (int iterator = 0; iterator < n; iterator++) {
				System.out.println(komentar2);
				imeStudenta = proveraString();
				System.out.println(komentar3);

				poeni = proveraInt();
				poeni = proveraBroj(poeni);
				if (poeni > maxPoeni) {
			// dodeljujemo maxPoeni vrednost trenutnog najveceg broja poena
					maxPoeni = poeni;
					imeNajboljegStudenta = imeStudenta;
				}
			}
			System.out.println(new StringBuilder("Ime najboljeg studenta je ").append(imeNajboljegStudenta).toString());

			System.out.println(komentar4);
			String nastavak = ulaz.next();
			if (!nastavak.equalsIgnoreCase("da")) {
				System.out.println("Kraj!");
				break;
			}
		}

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
