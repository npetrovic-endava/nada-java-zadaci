package zadatak13;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * Program ispisuje na standardni izlaz spisak studenata (ime, poeni, ocena) 
 * koji se nalaze u fajlu ocena2.txt, sortiran po poenima
 * 
 *  @author Nadezda Petrovic
 * 
 */
public class StudentDrugiUpis {
	static Scanner ulaz;
	static Student student;
	static ArrayList<Student> studenti = new ArrayList<>();
	private static final String GRESKA_ISPISA_IZ_FAJLA = "Doslo je do greske pri ispisu iz fajla";

	public static void main(String[] args) {
		File file = new File("ocena2.txt");
		try {
			ulaz = new Scanner(file);
			while (ulaz.hasNext()) {
				String ime = ulaz.next();
				int brPoena = ulaz.nextInt();
				int ocena = izracunajOcenu(brPoena);
				student = new Student(ime, brPoena, ocena);
				studenti.add(student);
			}
		} catch (Exception e) {
			System.out.println(GRESKA_ISPISA_IZ_FAJLA);
		}
		Collections.reverse(studenti);
		System.out.println(studenti);
		ulaz.close();
	}

	private static int izracunajOcenu(int poeni) {
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
