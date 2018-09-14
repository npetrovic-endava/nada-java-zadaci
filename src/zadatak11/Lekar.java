package zadatak11;
/**
 * @author Nadezda Petrovic
 **/
public class Lekar extends Zaposleni {
	private String fakultet;

	public Lekar(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String fakultet) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
		this.fakultet = fakultet;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	@Override
	public String toString() {
		return new StringBuilder("Lekar: ").append(super.toString()).append("Fakultet: ").append(fakultet).toString();
	}

}
