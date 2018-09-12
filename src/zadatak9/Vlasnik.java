package zadatak9;

/**
 * 
 * @author Nadezda Petrovic
 * 
 */

public class Vlasnik {

	private String imePrezime;
	private String jmbg;
	private String brLicneKarte;
	private final String PORUKA_ZA_POGRESNO_IME = "Nije unet pravilan podatak za ime i prezime";
	private final String PORUKA_ZA_POGRESAN_JMBG = "Unet je pogresan JMBG";
	private final String PORUKA_ZA_POGRESAN_BR_LK = "Unet je pogresan broj licne karte";
	private final String REGEX_1 = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";
	private final String REGEX_2 = "[0-9]+";

	public Vlasnik() {
	}

	public Vlasnik(String imePrezime, String jmbg, String brLicneKarte) {

		if (!imePrezime.matches(REGEX_1)) {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNO_IME);
		}
		this.imePrezime = imePrezime;
		if (jmbg.matches(REGEX_2) && 13 == jmbg.length()) {

			this.jmbg = jmbg;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_JMBG);

		if (brLicneKarte.matches(REGEX_2) && 6 == brLicneKarte.length()) {
			this.brLicneKarte = brLicneKarte;
		}else {
		throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_BR_LK);
		}
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {

		if (!imePrezime.matches(REGEX_1)) {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNO_IME);
		}
		this.imePrezime = imePrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		if (jmbg.matches(REGEX_2) && 13 == jmbg.length()) {
			this.jmbg = jmbg;
		} else {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_JMBG);
		}
	}

	public String getBrLicneKarte() {
		return brLicneKarte;
	}

	public void setBrLicneKarte(String brLicneKarte) {
		if (brLicneKarte.matches(REGEX_2) && 6 == brLicneKarte.length()) {
			this.brLicneKarte = brLicneKarte;
		}else {
		throw new IllegalArgumentException(PORUKA_ZA_POGRESAN_BR_LK);
		}
	}

	@Override
	public String toString() {
		return new StringBuilder(" -Vlasnik- ime i prezime: ").append(imePrezime).append(", jmbg: ").append(jmbg)
				.append(", broj licne karte: ").append(brLicneKarte).toString();
	}
}
