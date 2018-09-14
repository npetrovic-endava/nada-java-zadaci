package zadatak10;

/**
 *
 * @author Nadezda Petrovic
 */

public class Kafa extends Proizvodi {

	private String mlevenaZrno;
	private final double KONSTANTA_ZA_KRAJNJU_CENU=1.08;

	public Kafa(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String mlevenaZrno) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.mlevenaZrno = mlevenaZrno;
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena = this.getCenaProizvoda()*KONSTANTA_ZA_KRAJNJU_CENU;
		return krajnjaCena;
	}

	public String getMlevenaIliZrno() {
		return mlevenaZrno;
	}

	public void setMlevenaIliZrno(String mlevenaIliZrno) {
		this.mlevenaZrno = mlevenaIliZrno;
	}

	@Override
	public String toString() {
		return  new StringBuilder("--Kafa-- mlevena ili u zrnu: ").append(mlevenaZrno).
				append(super.toString()).toString();
	}
}
