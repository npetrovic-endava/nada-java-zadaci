package zadatak10;

/**
 * Program cuva informacije o proizvodima za firmu
 *
 * @author Nadezda Petrovic
 */
public class MlecniProizvodi extends Proizvodi {

	private String porekloMleka;
	private final double KONSTANTA_ZA_KRAJNJU_CENU = 1.20;

	public MlecniProizvodi(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String porekloMleka) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.porekloMleka = porekloMleka;
	}

	public String getPorekloMleka() {
		return porekloMleka;
	}

	public void setPorekloMleka(String porekloMleka) {
		this.porekloMleka = porekloMleka;
	}

	@Override
	public String toString() {
		return new StringBuilder("--Mlecni proizvodi-- poreklo mleka: ").append(porekloMleka).append(super.toString())
				.toString();
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena = this.getCenaProizvoda() * KONSTANTA_ZA_KRAJNJU_CENU;
		return krajnjaCena;
	}
}
