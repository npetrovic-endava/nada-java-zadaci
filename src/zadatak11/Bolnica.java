package zadatak11;
import java.util.List;
/**
 * @author Nadezda Petrovic
 **/

public class Bolnica {
	private String nazivBolnice;
	private String imeDirektora;
	private int brojZaposlenih;
	private List<Lekar> lekari;
	private List<Osoblje> osoblje;
	private List<MedicinskeSestre> sestre;

	
	public Bolnica(String nazivBolnice, String imeDirektora, List<Lekar> lekari, List<Osoblje> osoblje,
			List<MedicinskeSestre> sestre) {
		super();
		this.nazivBolnice = nazivBolnice;
		this.imeDirektora = imeDirektora;
		this.lekari = lekari;
		this.osoblje = osoblje;
		this.sestre = sestre;
	}

	public List<Lekar> getLekari() {
		return lekari;
	}

	public void setLekari(List<Lekar> lekari) {
		this.lekari = lekari;
	}

	public List<Osoblje> getOsoblje() {
		return osoblje;
	}

	public void setOsoblje(List<Osoblje> osoblje) {
		this.osoblje = osoblje;
	}

	public List<MedicinskeSestre> getSestre() {
		return sestre;
	}

	public void setSestre(List<MedicinskeSestre> sestre) {
		this.sestre = sestre;
	}

	public String getNazivBolnice() {
		return nazivBolnice;
	}

	public void setNazivBolnice(String nazivBolnice) {
		this.nazivBolnice = nazivBolnice;
	}

	public String getImeDirektora() {
		return imeDirektora;
	}

	public void setImeDirektora(String imeDirektora) {
		this.imeDirektora = imeDirektora;
	}

	public int getBrojZaposlenih() {

		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {

		this.brojZaposlenih = brojZaposlenih;
	}

	@Override
	public String toString() {
		return new StringBuilder("Bolnica: ").append(nazivBolnice).append(" Direktor: ").append(imeDirektora)
				.append(" Broj zaposlenih: ").append(brojZaposlenih()).append(" lekara: ").append(brojLekara())
				.append(" medicinskih sestara: ").append(brojSestara()).append(" ostalog osoblja: ")
				.append(brojOsoblja()).toString();
	}

	public int brojZaposlenih() {
			return lekari.size() + osoblje.size() + sestre.size();
	}

	public int brojSestara() {
		return sestre.size();
	}

	public int brojLekara() {
			return lekari.size();
	}

	public int brojOsoblja() {
		return osoblje.size();
	}
}
