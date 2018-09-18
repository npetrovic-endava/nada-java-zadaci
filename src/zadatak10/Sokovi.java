package zadatak10;

/**
 *
 * @author Nadezda Petrovic
 */
public class Sokovi extends Proizvodi {

	private String vrstaSoka;
	private static final double KONSTANTA_ZA_KRAJNJU_CENU = 1.20;

	public Sokovi(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String vrstaSoka) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.vrstaSoka = vrstaSoka;
	}

	@Override
	public double konacnaCenaProizvoda() {
		return this.getCenaProizvoda() * KONSTANTA_ZA_KRAJNJU_CENU;
	}

	public String getVrstaSoka() {
		return vrstaSoka;
	}

	public void setVrstaSoka(String vrstaSoka) {
		this.vrstaSoka = vrstaSoka;
	}

	@Override
	public String toString() {
		return new StringBuilder("--Sokovi-- vrsta soka: ").append(vrstaSoka).append(super.toString()).toString();
	}
}
