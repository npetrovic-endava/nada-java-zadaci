package zadatak9;

/**
 * 
 * @author Nadezda Petrovic
 * 
 */

public class Stan extends Nekretnina {

	private double povrsinaPodruma;
	private double povrsinaTerase;
	private int multiplikator;
	private static final double KONSTANTA = 0.33;
	private static final String PORUKA_ZA_POGRESNU_POVRSINU = "Unet je pogresan parametar za kvadraturu podruma ili terase";

	public Stan(Vlasnik vlasnik, String adresa, int zona, int kvadratura, double povrsinaPodruma,
			double povrsinaTerase) {
		super(vlasnik, adresa, zona, kvadratura);
		if (0 < povrsinaPodruma) {
			this.povrsinaPodruma = povrsinaPodruma;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_POVRSINU);
		if (0 < povrsinaTerase) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_POVRSINU);
	}

	public double getPovrsinaPodruma() {
		return povrsinaPodruma;
	}

	public void setPovrsinaPodruma(double povrsinaPodruma) {
		if (0 < povrsinaPodruma) {
			this.povrsinaPodruma = povrsinaPodruma;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_POVRSINU);

	}

	public double getPovrsinaTerase() {
		return povrsinaTerase;
	}

	public void setPovrsinaTerase(double povrsinaTerase) {
		if (0 < povrsinaTerase) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException(PORUKA_ZA_POGRESNU_POVRSINU);

	}

	@Override
	public double cenaNekretnine() {
		double cena = getKvadratura() * Multiplikator(getZona())
				+ (povrsinaPodruma + povrsinaTerase) * Multiplikator(getZona()) * KONSTANTA;
		return cena;
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

	@Override
	public String toString() {
		return new StringBuilder("-Stan- ").append(super.toString()).append(" [povrsina podruma: ")
				.append(povrsinaPodruma).append(", povrsina terase:").append(povrsinaTerase).append("]").toString();

	}

}
