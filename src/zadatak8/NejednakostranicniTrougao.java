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

public class NejednakostranicniTrougao extends Trougao {
	private double stranica2;
	private double stranica3;

	public NejednakostranicniTrougao() {
	}

	public NejednakostranicniTrougao(double stranica2, double stranica3) {
		this.stranica2 = stranica2;
		this.stranica3 = stranica3;
	}

	public NejednakostranicniTrougao(double stranica2, double stranica3, double stranica) {
		super(stranica);
		this.stranica2 = stranica2;
		this.stranica3 = stranica3;
	}

	public double getStranica2() {
		return stranica2;
	}

	public void setStranica2(double stranica2) {
		this.stranica2 = stranica2;
	}

	public double getStranica3() {
		return stranica3;
	}

	public void setStranica3(double stranica3) {
		this.stranica3 = stranica3;
	}

	@Override
	public String toString() {
		return new StringBuilder("Nejednakostranicni trougao stranica: ").append(stranica2).append(", ")
				.append(stranica3).append(" i ").append(this.getStranica()).append(" ima obim: ").append(obim())
				.append(" i povrsinu: ").append(povrsina()).toString();
		// "Nejednakostranicni trougao stranica: " + stranica2 + ", " + stranica3 + ", "
		// + this.getStranica()
		// + " ima obim: " + obim() + " i povrsinu: " + povrsina();
	}

	// povrsina trougla po Heronovoj formuli, preko poluobima
	@Override
	public double povrsina() {
		double poluobim = (this.getStranica() + stranica2 + stranica3) / 2;
		double rezultat = Double.parseDouble(
				String.format("%4.2f", Math.sqrt(poluobim * (poluobim - stranica2) * (poluobim - stranica3))));
		return rezultat;
	}

	@Override
	public double obim() {
		double rezultat = Double.parseDouble(String.format("%4.2f", this.getStranica() + stranica2 + stranica3));
		return rezultat;
	}

}
