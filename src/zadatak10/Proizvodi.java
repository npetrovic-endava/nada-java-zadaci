package zadatak10;

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
		return ", proizvod:" + imeProizvoda + ", cena: " + cenaProizvoda + ", cena sa PDV-om: " + konacnaCenaProizvoda()
				+ ", rok trajanja: " + rokTrajanja;
	}

}
