package zadatak10;

/**
 * Program cuva informacije o proizvodima za firmu
 *
 * @author Nadezda Petrovic
 */
public class Sokovi extends Proizvodi {

	private String vrstaSoka;

	public Sokovi(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String vrstaSoka) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.vrstaSoka = vrstaSoka;
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena = this.getCenaProizvoda() * 1.2;
		return krajnjaCena;
	}

	public String getVrstaSoka() {
		return vrstaSoka;
	}

	public void setVrstaSoka(String vrstaSoka) {
		this.vrstaSoka = vrstaSoka;
	}

	@Override
	public String toString() {
		return "--Sokovi-- vrsta soka: " + vrstaSoka + super.toString();
	}

}
