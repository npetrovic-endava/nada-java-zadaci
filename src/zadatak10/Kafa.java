package zadatak10;

/**
 * Program cuva informacije o proizvodima za firmu
 *
 * @author Nadezda Petrovic
 */
public class Kafa extends Proizvodi {

	private String mlevenaZrno;

	public Kafa(String imeProizvoda, double cenaProizvoda, String rokTrajanja, String mlevenaZrno) {
		super(imeProizvoda, cenaProizvoda, rokTrajanja);
		this.mlevenaZrno = mlevenaZrno;
	}

	@Override
	public double konacnaCenaProizvoda() {
		double krajnjaCena = this.getCenaProizvoda() * 1.08;
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
		return "--Kafa-- mlevena ili u zrnu:" + mlevenaZrno + super.toString();
	}

}
