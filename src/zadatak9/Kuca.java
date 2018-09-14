package zadatak9;

/**
 * @author Nadezda Petrovic
 * 
 */

public class Kuca extends Nekretnina {

	private double povrsinaOkucnice;
	private int multiplikator;
	private static final double KONSTANTA = 0.15;
	private static final String PORUKA_ZA_POGRESNU_POVRSINU_OKUCNICE = "Unet je pogresan parametar za kvadraturu okucnice";

	protected Kuca(Vlasnik vlasnik, String adresa, int zona, int kvadratura, double povrsinaOkucnice) {
		super(vlasnik, adresa, zona, kvadratura);
		if (0 < povrsinaOkucnice) {
			this.povrsinaOkucnice = povrsinaOkucnice;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_POVRSINU_OKUCNICE);
	}

	public Kuca(Vlasnik vlasnik, String adresa, int zona, int kvadratura) {
		super(vlasnik, adresa, zona, kvadratura);
	}

	public double getPovrsinaOkucnice() {
		return povrsinaOkucnice;
	}

	public void setPovrsinaOkucnice(double povrsinaOkucnice) {
		if (0 < povrsinaOkucnice) {
			this.povrsinaOkucnice = povrsinaOkucnice;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_POVRSINU_OKUCNICE);
	}

	@Override
	public double cenaNekretnine() {
		double cena = getKvadratura() * Multiplikator(getZona())
				+ (povrsinaOkucnice) * Multiplikator(getZona()) * KONSTANTA;
		return cena;
	}

	@Override
	public String toString() {
		return new StringBuilder("-Kuca- ").append(super.toString()).append(" [povrsina okucnice: ")
				.append(povrsinaOkucnice).append("]").toString();
	}

	public int Multiplikator(int zona) {

		switch (zona) {
		case (1):
			multiplikator = 3000;
			break;
		case (2):
			multiplikator = 2000;
			break;
		case (3):
			multiplikator = 1000;
			break;
		case (4):
			multiplikator = 500;
			break;
		}
		return multiplikator;
	}

}
