package zadatak11;
import java.util.ArrayList;
/**
 * Napisati program koji opisuje sledeci scenario:
 * 
 * Firma posedujeniz privatnih bolnica. Svaka bolnica ima svoje zaposlene.
 * Zaposleni mogu biti: - Lekari - Osoblje - Medicinske sestre Bolnica sadrzi
 * informacije o nazivu, direktoru i broju zaposlenih. Podaci koji se cuvaju o
 * lekaru su : - Fakultet - Ime - Prezime - Adresa - Telefon - Datum rodjenja O
 * osobllju cuvamo iste stvari, osim informacije o fakultetu. Za medicinske
 * sestre jos i smenu. Firma sadrzi metodu toString() koja ispisuje koliko
 * poseduje bolnica i lekara, medicinskih sestara i osoblja ponaosob.
 * 
 * @author Nadezda Petrovic
 **/
public class Test {
	public static void main(String[] args) {

		ArrayList<Lekar> nizLekara1 = new ArrayList<>();
		ArrayList<Lekar> nizLekara2 = new ArrayList<>();
		ArrayList<MedicinskeSestre> nizSestara1 = new ArrayList<>();
		ArrayList<Osoblje> nizOsoblja = new ArrayList<>();
		ArrayList<Bolnica> nizBolnica = new ArrayList<>();
		Firma firma = new Firma(nizBolnica);
		Bolnica bolnica1 = new Bolnica("Gradska bolnica", "Bora Djokic", nizLekara1, nizOsoblja, nizSestara1);
		Bolnica bolnica2 = new Bolnica("Prva bolnica", "Petar Petrovic", nizLekara2, nizOsoblja, nizSestara1);
		Lekar lekar1 = new Lekar("Ivan", "Peric", "Palih boraca 23", "011-271333", "01-01-1969",
				"Medicinski fakultet Beograd");
		Lekar lekar2 = new Lekar("Masa", "Popovic", "Bulevar umetnosti 12", "011-879-928", "11-02-1978",
				"Medicinski fakultet Beograd");
		Lekar lekar3 = new Lekar("Jovan", "Bogdanovic", "Cerska 12", "064-124751", "12-07-1985",
				"Medicinski fakultet Beograd");

		MedicinskeSestre sestra1 = new MedicinskeSestre("Ana", "Peric", "Mokroluska 2", "011-2333456", "10-02-1980", 2);
		MedicinskeSestre sestra2 = new MedicinskeSestre("Snezana", "Lukic", "Sumatovacka 33", "011-2333456","04-05-1978", 2);
		Osoblje osoba1 = new Osoblje("Masa", "Peric", "Dalmatinska 2", "011-233456", "02-03-1970");
		
		nizLekara1.add(lekar1);
		nizLekara1.add(lekar2);
		nizLekara2.add(lekar3);
		nizSestara1.add(sestra1);
		nizSestara1.add(sestra2);
		nizOsoblja.add(osoba1);
		nizBolnica.add(bolnica1);
		nizBolnica.add(bolnica2);

		System.out.println(firma.toString());
	}
}