package zadatak10;

public class MlecniProizvodi extends Proizvodi {

	private String porekloMleka;

	public MlecniProizvodi(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String porekloMleka) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
	this.porekloMleka=porekloMleka;
	}

	public String getPorekloMleka() {
		return porekloMleka;
	}

	public void setPorekloMleka(String porekloMleka) {
		this.porekloMleka = porekloMleka;
	}

	@Override
	public String toString() {
		return "--Mlecni proizvod-- poreklo mleka: " + getPorekloMleka()
				//+ ", ime proizvoda:" + getImeProizvoda() + ", cena proizvoda:" + getCenaProizvoda()
				//+ ", rok trajanja:" + getRokTrajanja() + " krajnja cena proizvoda: " + konacnaCenaProizvoda() + ", toString()="
				+ super.toString();
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena=this.getCenaProizvoda()*1.2;
		return krajnjaCena;
	}

}
