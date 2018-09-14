package zadatak11;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nadezda Petrovic
 */

public abstract class Zaposleni {
	private String ime;
	private String prezime;
	private String adresa;
	private String telefon;
	private String datumRodjenja;
	private final String PORUKA_ZA_POGRESNO_IME = "Nije unet pravilan podatak za ime";
	private final String PORUKA_ZA_POGRESNO_PREZIME = "Nije unet pravilan podatak za prezime";
	private final String PORUKA_ZA_POGRESAN_BR_TELEFONA = "Nije unet pravilan podatak za broj telefona";
	private final String PORUKA_ZA_POGRESAN_UNOS_DATUMA_RODJENJA = "Nije unet pravilan podatak za datum rodjenja";
	private final String REGEX_1 = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
	private final String REGEX_2 = "^[0-9\\-]*$";

	protected Zaposleni(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		super();
		if (!ime.matches(REGEX_1)) {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNO_IME);
		}
		this.ime = ime;

		if (!prezime.matches(REGEX_1)) {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNO_PREZIME);
		}
		this.prezime = prezime;

		this.adresa = adresa;
		if (telefon.matches(REGEX_2)) {
			this.telefon = telefon;
		} else {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_BR_TELEFONA);
		}
		if (true == proveraDatuma(datumRodjenja)) {
			this.datumRodjenja = datumRodjenja;
		} else {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_UNOS_DATUMA_RODJENJA);
		}
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (!ime.matches(REGEX_1)) {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNO_IME);
		}
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (!prezime.matches(REGEX_1)) {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNO_PREZIME);
		}
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		if (telefon.matches(REGEX_2)) {
			this.telefon = telefon;
		} else {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_BR_TELEFONA);
		}
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		if (true == proveraDatuma(datumRodjenja)) {
			this.datumRodjenja = datumRodjenja;
		} else {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_UNOS_DATUMA_RODJENJA);
		}
	}

	@Override
	public String toString() {
		return new StringBuilder("Zaposleni: ").append(ime).append(" ").append(prezime).append(" Adresa: ")
				.append(adresa).append(" Telefon; ").append(telefon).append(" Datum rodjenja: ").append(datumRodjenja)
				.toString();
	}

	public static boolean proveraDatuma(String datum) {
		SimpleDateFormat formatDatuma = new SimpleDateFormat("dd-MM-yyyy");
		boolean provera = false;
		try {
			formatDatuma.parse(datum.trim());
			provera = true;
		} catch (Exception ex) {
			provera = false;
		}
		return provera;
	}
}
