package zadatak11;
import java.util.List;
/**
 * @author Nadezda Petrovic
 **/
public class Firma {
	private List<Bolnica> bolnice;

	public Firma(List<Bolnica> bolnice) {
		super();
		this.bolnice = bolnice;
	}

	public List<Bolnica> getBolnice() {
		return bolnice;
	}

	public void setBolnice(List<Bolnica> bolnice) {
		this.bolnice = bolnice;
	}

	@Override
	public String toString() {
		int brojBolnica = bolnice.size();
		int brojZaposlenih = 0;
		System.out.println(new StringBuilder("Firma poseduje ").append(brojBolnica).append(" bolnice: ").toString());
		for (Bolnica ustanova : bolnice) {
			System.out.println(ustanova.toString());
			brojZaposlenih = brojZaposlenih + ustanova.brojZaposlenih();
		}
		return new StringBuilder("Ukupan broj zaposlenih: ").append(brojZaposlenih).toString();
	}

}
