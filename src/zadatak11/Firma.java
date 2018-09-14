package zadatak11;

import java.util.ArrayList;

/**
 * @author Nadezda Petrovic
 **/

public class Firma {
	private ArrayList<Bolnica> bolnice;

	public Firma(ArrayList<Bolnica> bolnice) {
		super();
		this.bolnice = bolnice;
	}

	public ArrayList<Bolnica> getBolnice() {
		return bolnice;
	}

	public void setBolnice(ArrayList<Bolnica> bolnice) {
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
