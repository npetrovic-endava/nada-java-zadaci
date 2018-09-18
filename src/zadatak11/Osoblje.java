package zadatak11;
/**
 * @author Nadezda Petrovic
 **/
public class Osoblje extends Zaposleni {

	public Osoblje(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
	}

	@Override
	public String toString() {
		return new StringBuilder("Osoblje: ").append(super.toString()).toString();
	}

}
