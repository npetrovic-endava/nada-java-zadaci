package zadatak10;

/**
 *
 * @author Nadezda Petrovic
 */
public abstract class Proizvodi {
	private String imeProizvoda;
	private double cenaProizvoda;
	private String rokTrajanja;

	protected Proizvodi(String imeProizvoda, double cenaProizvoda, String rokTrajanja) {
		super();
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
	}

	public String getImeProizvoda() {
		return imeProizvoda;
	}

	public void setImeProizvoda(String imeProizvoda) {
		this.imeProizvoda = imeProizvoda;
	}

	public double getCenaProizvoda() {
		return cenaProizvoda;
	}

	public void setCenaProizvoda(double cenaProizvoda) {
		this.cenaProizvoda = cenaProizvoda;
	}

	public String getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(String rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	public abstract double konacnaCenaProizvoda();

	@Override
	public String toString() {
		return new StringBuilder(", proizvod: ").append(imeProizvoda).append(", cena: ").append(cenaProizvoda)
				.append(", cena sa PDV-om: ").append(konacnaCenaProizvoda()).append(", rok trajanja: ")
				.append(rokTrajanja).toString();
	}
}
