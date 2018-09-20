package zadatak12;

import java.io.File;

import java.io.PrintWriter;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

import java.util.List;

/**
 *
 * 
 * 
 * Napisati program koji umogucava unos imena studenta i broj poena osvojenih na
 * 
 * testu preko standardnog ulaza (sve dok se ne unese odredjen znak za prekid
 * 
 * unosa podataka). Broj poena sme da bude od 0 do 100. Kao rezultat programa,
 * 
 * ocekuje se izlazni fiajl "ocene.txt" u kome ce se nalaziti lista svih
 * 
 * studenata sortirana po poenima, od najvise ka najmanje, i gde ce se osim
 * 
 * imena studenta i boja poena nalaziti i ocena koju je dobio na ispiti. Ocena
 * 
 * 10 akoje imao vise od 90 poena, 9 ako je imao izmedju 81 i 90... Sve do 5 ako
 * 
 * je imao manje od 51 poena.
 *
 * 
 * 
 * @author Nadezda.Petrovic
 *
 * 
 * 
 */

public class StudentiIspis {

	private static Scanner ulaz = new Scanner(System.in);
	private static List<Student> studenti = new ArrayList<>();
	private static final String PORUKA_ZA_POGRESNO_IME = "Pogresan unos imena studenata ";
	private static final String PORUKA_ZA_NASTAVAK = "Da li zelite da nastavite unos (da/ne):";
	private static final String KRAJ = "Kraj!";
	private static final String UNOS_IMENA_STUDENTA = "Uneti ime studenta:";
	private static final String UNOS_BROJA_POENA = "Uneti broj poena studenta: ";
	private static final String ISPIS_POGRESNOG_OPSEGA_POENA = "Pogresan unos broja poena. Uneti broj poena u intervalu 1-100! ";
	private static final String PORUKA_ZA_POGRESAN_BROJ = "Pogresan unos broja poena ";
	private static final String ISPIS_GRESKE_UPISA_U_FAJL = "Doslo je do greske pri unosu!";
	private static final String REGEX_1 = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
	private static final String REGEX_2 = "[0-9]+";

	public static void main(String[] args) {

		File file = new File("ocena.txt");
		unosStudenata();
		Collections.reverse(studenti);
		for (Student s : studenti)
			System.out.println(s.toString());
		try {
			PrintWriter pw = new PrintWriter(file);
			for (Student t : studenti) {
				pw.println(t.toString());
			}
			pw.close();
		} catch (Exception ex) {
			System.out.println(ISPIS_GRESKE_UPISA_U_FAJL);
		}
	}

	private static void unosStudenata() {
		boolean uslov = true;
		while (uslov) {
			System.out.println(UNOS_IMENA_STUDENTA);
			String ime = ulaz.next();
			/*
			 * if (ime.contains("#")) { uslov = false; }
			 */

			if (!ime.matches(REGEX_1)) {
				System.out.println(PORUKA_ZA_POGRESNO_IME);
				continue;
			} else {
				System.out.println(UNOS_BROJA_POENA);
				String poeniPomocna = ulaz.next();
				if (!poeniPomocna.matches(REGEX_2)) {
					System.out.println(PORUKA_ZA_POGRESAN_BROJ);
					continue;
				}

				double poeni = Double.parseDouble(poeniPomocna);
				if (100 < poeni || 0 > poeni) {
					System.out.println(ISPIS_POGRESNOG_OPSEGA_POENA);
					continue;
				}
				int ocena = izracunajOcenu(poeni);
				Student student = new Student(ime, poeni, ocena);
				studenti.add(student);
				System.out.println(PORUKA_ZA_NASTAVAK);
				if (!ulaz.next().equalsIgnoreCase("da")) {
					System.out.println(KRAJ);
					uslov = false;
				}
			}
		}
	}

	private static int izracunajOcenu(double poeni) {
		int rezultat;
		if (poeni > 90)
			rezultat = 10;
		else if (poeni > 80)
			rezultat = 9;
		else if (poeni > 70)
			rezultat = 8;
		else if (poeni > 60)
			rezultat = 7;
		else if (poeni > 50)
			rezultat = 6;
		else
			rezultat = 5;
		return rezultat;

	}

}
