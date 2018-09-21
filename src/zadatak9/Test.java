package zadatak9;

/**
 * 
 * Kreirati projekat Nekretnina na sledeci nacin:
 * 
 * - Apstraktna klasa nekretnina koja od atributa ima
 
 * - adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.
 * 
 * - Vlasnik ima puno ime i prezime, JMBG i broj licne karte.
 * 
 * - Izvedene klase, Stan i Kuca imaju to String() metod gde se ispisuju sve
 * informacije o nekretnini ukljucujuci
 * 
 * Vlasnika i cenu
 * 
 * - Cena se racunapo principu kvadratura X zona (I zona 3000, II zona 2000, III
 * zona 1000, IV zona 500e)
 
 * - Kuca ima dodatno polje povrsinaOkucnice
 * 
 * - U cenu kuce ulazi i cena okucnice koja se racuna po principu
 * (povrsinaOkucnice X Zona X 15%)
 * 
 * - Stan ima dva dodatna polja, povrsinaPodruma i povrsinaTerase
 * 
 * - u cenu Stana ulazi i podruma i terase ((povrsinaPodruma +
 * povrsinaTerase) X Zona X 33%)
 * 
 * Napraviti Main klasu i u njoj kreirati instance klae Nekretnina i
 * napraviti objekte izvedenih klasa sa
 * 
 * proizvoljnim argumentima. Ispisati String repreentaciju objekata -
 * toString().
 * 
 * @author Nadezda Petrovic
 * 
 */

public class Test {

	public static void main(String[] args) {

		Nekretnina stan = new Stan(new Vlasnik("Pera Peric", "1234767894127", "123656"), "Mike alasa 2", 1, 78, 12,
			12);
		Nekretnina kuca = new Kuca(new Vlasnik("Maja Jovanovic", "1212987123456", "213456"), "Voje Veljkovica 17", 2,
				120, 50);
		System.out.println(stan);
		System.out.println(kuca);
	}

}
