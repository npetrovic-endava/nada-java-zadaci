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

public class Trougao extends GeometrijskaSlika {
	private double stranica;

	public Trougao() {
	}

	public Trougao(double stranica) {
		this.stranica = stranica;
	}

	public double getStranica() {
		return stranica;
	}

	public void setStranica(double stranica) {
		this.stranica = stranica;
	}

	@Override
	public double obim() {
		double rezultat = Double.parseDouble(String.format("%4.2f", 3 * stranica));
		return rezultat;
	}

//heronova formula za izracunavanje povrsine trougla preko stranica
	@Override
	public double povrsina() {
		double poluobim = 3 * stranica / 2;
		double pomocna = poluobim - stranica;
		double rezultat = Double.parseDouble(String.format("%4.2f", Math.sqrt(poluobim * (Math.pow(pomocna, 3)))));
		return rezultat;
	}

	@Override
	public String toString() {
		return new StringBuilder("Jednakostranicni trougao stranice: ").append(stranica).append(" ima obim: ")
				.append(obim()).append(" i povrsinu: ").append(povrsina()).toString();
	}

}
