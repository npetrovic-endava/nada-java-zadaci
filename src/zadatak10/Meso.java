package zadatak10;

public class Meso extends Proizvodi {

	private String vrstaMesa;

	public Meso(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String vrstaMesa) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.vrstaMesa = vrstaMesa;
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena = this.getCenaProizvoda() * 1.08;
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
		return "--Meso-- vrsta mesa: " + vrstaMesa + super.toString();

	}

}
