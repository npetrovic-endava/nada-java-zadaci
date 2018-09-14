package zadatak11;

import java.util.ArrayList;

/**
 * @author Nadezda Petrovic
 **/

public class Bolnica {
	private String nazivBolnice;
	private String imeDirektora;
	private int brojZaposlenih;
	private ArrayList<Lekar> lekari;
	private ArrayList<Osoblje> osoblje;
	private ArrayList<MedicinskeSestre> sestre;

	
	public Bolnica(String nazivBolnice, String imeDirektora, ArrayList<Lekar> lekari, ArrayList<Osoblje> osoblje,
			ArrayList<MedicinskeSestre> sestre) {
		super();
		this.nazivBolnice = nazivBolnice;
		this.imeDirektora = imeDirektora;
		this.lekari = lekari;
		this.osoblje = osoblje;
		this.sestre = sestre;
	}

	public ArrayList<Lekar> getLekari() {
		return lekari;
	}

	public void setLekari(ArrayList<Lekar> lekari) {
		this.lekari = lekari;
	}

	public ArrayList<Osoblje> getOsoblje() {
		return osoblje;
	}

	public void setOsoblje(ArrayList<Osoblje> osoblje) {
		this.osoblje = osoblje;
	}

	public ArrayList<MedicinskeSestre> getSestre() {
		return sestre;
	}

	public void setSestre(ArrayList<MedicinskeSestre> sestre) {
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
		brojZaposlenih = lekari.size() + osoblje.size() + sestre.size();
		return brojZaposlenih;
	}

	public int brojSestara() {
		int brojSestara = sestre.size();
		return brojSestara;
	}

	public int brojLekara() {
		int brojLekara = lekari.size();
		return brojLekara;
	}

	public int brojOsoblja() {
		int brojOsoblja = osoblje.size();
		return brojOsoblja;
	}
}
