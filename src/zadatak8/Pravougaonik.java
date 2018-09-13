package zadatak8;

/*
 * Apstraktnu klasu GeometrijskaSlika nasledjuju klase Krug, Kvadrat i Trougao.
 * Izvedene klase su Elipsa, Pravougaonik i Nejednakostranicni trougao
 * Klase imaju preklopljenu metodu toString koja ispisuje obim i povrsinu oblika
 */

/**
 *
 * @author Nadezda Petrovic
 */

public class Pravougaonik extends Kvadrat {
	private double stranica2;

	public Pravougaonik() {
	}

	public Pravougaonik(double stranica2) {
		this.stranica2 = stranica2;
	}

	public Pravougaonik(double stranica2, double stranica) {
		super(stranica);
		this.stranica2 = stranica2;
	}

	public double getStranica2() {
		return stranica2;
	}

	public void setStranica2(double stranica2) {
		this.stranica2 = stranica2;
	}

	@Override
	public String toString() {
		return new StringBuilder("Pravougaonik stranica; ").append(stranica2).append(" i ").append(this.getStranica())
				.append(" ima obim: ").append(obim()).append(" i povrsinu: ").append(povrsina()).toString();
	}

	@Override
	public double povrsina() {
		double rezultat = Double.parseDouble(String.format("%4.2f", getStranica() * getStranica2()));
		return rezultat;
	}

	@Override
	public double obim() {
		double rezultat = 2 * (this.getStranica() + stranica2);
		return rezultat;
	}

}
