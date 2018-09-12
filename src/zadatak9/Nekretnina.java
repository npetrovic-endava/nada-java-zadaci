package zadatak9;

/**
 * 
 * @author Nadezda Petrovic
 * 
 */

public abstract class Nekretnina {
	private String adresa;
	private int zona;
	private int kvadratura;
	Vlasnik vlasnik;

	private final String PORUKA_ZA_POGRESNU_ZONU = "Unet je pogresan parametar za zonu";
	private final String PORUKA_ZA_POGRESNU_KVADRATURU = "Unet je pogresan parametar za kvadraturu";

	protected Nekretnina(Vlasnik vlasnik, String adresa, int zona, int kvadratura) {
		super();
		this.adresa = adresa;
		if (0 < zona && 5 > zona)
			this.zona = zona;
		else {
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_ZONU);
		}
		if (0 < kvadratura) {
			this.kvadratura = kvadratura;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_KVADRATURU);

		this.vlasnik = vlasnik;
	}

	
	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {

		if (0 < zona && 5 > zona)
			this.zona = zona;
		else 
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_ZONU);
			}

	public double getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(int kvadratura) {

		if (0 < kvadratura) {
			this.kvadratura = kvadratura;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_KVADRATURU);
	}

	public abstract double cenaNekretnine();

	@Override
	public String toString() {
		return new StringBuilder("cena nekretnine: ").append(cenaNekretnine()).append(", adresa: ").append(adresa)
				.append(", zona: ").append(zona).append(", kvadratura:").append(kvadratura).append(vlasnik.toString())
				.toString();
	}

}
