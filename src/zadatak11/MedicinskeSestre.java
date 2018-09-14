package zadatak11;

/**
 * @author Nadezda Petrovic
 **/

public class MedicinskeSestre extends Zaposleni {
	private int smena;

	public MedicinskeSestre(String ime, String prezime, String adresa, String telefon, String datumRodjenja,
			int smena) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
		this.smena = smena;
	}

	public int getSmena() {
		return smena;
	}

	public void setSmena(int smena) {
		this.smena = smena;
	}

	@Override
	public String toString() {
		return new StringBuilder("Medicinska sestra: ").append(super.toString()).append(" Smena: ").append(smena)
				.toString();
	}

}
