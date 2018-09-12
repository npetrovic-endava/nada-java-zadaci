package zadatak10;

/**
 * Program cuva informacije o proizvodima za firmu
 *
 * @author Nadezda Petrovic
 */
public class Meso extends Proizvodi {

	private String vrstaMesa;
	private final double KONSTANTA_ZA_KRAJNJU_CENU = 1.08;

	public Meso(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String vrstaMesa) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.vrstaMesa = vrstaMesa;
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena = this.getCenaProizvoda() * KONSTANTA_ZA_KRAJNJU_CENU;
		return krajnjaCena;
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
