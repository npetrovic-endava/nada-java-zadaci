package zadatak10;

/**
 *
 * @author Nadezda Petrovic
 */
public class Meso extends Proizvodi {

	private String vrstaMesa;
	private static final double KONSTANTA_ZA_KRAJNJU_CENU = 1.08;

	public Meso(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String vrstaMesa) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.vrstaMesa = vrstaMesa;
	}

	@Override
	public double konacnaCenaProizvoda() {
		return this.getCenaProizvoda() * KONSTANTA_ZA_KRAJNJU_CENU;
	}

	public String getVrstaMesa() {
		return vrstaMesa;
	}

	public void setVrstaMesa(String vrstaMesa) {
		this.vrstaMesa = vrstaMesa;
	}

	@Override
	public String toString() {
		return new StringBuilder("--Meso-- vrsta mesa: ").append(vrstaMesa).append(super.toString()).toString();
	}

}
