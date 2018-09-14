package zadatak8;
/* Apstraktnu klasu GeometrijskaSlika nasledjuju klase Krug, Kvadrat i Trougao.
 * Izvedene klase su Elipsa, Pravougaonik i Nejednakostranicni trougao
 * Klase imaju preklopljenu metodu toString koja ispisuje obim i povrsinu oblika
 *
 *
 * @author Nadezda Petrovic
 * 
 */

public class Kvadrat extends GeometrijskaSlika {
	private double stranica;

	public Kvadrat() {

	}

	public Kvadrat(double stranica) {
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
		double rezultat = Double.parseDouble(String.format("%4.2f", 4 * stranica));
		return rezultat;
	}

	@Override
	public double povrsina() {
		double rezultat = Double.parseDouble(String.format("%4.2f", stranica * stranica));
		return rezultat;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
