package zadatak10;

import java.util.List;
/**
*
* @author Nadezda Petrovic
*/

public class Firma {
	private double kapital;
	private List<Proizvodi> listaProizvoda;
	private static final String ISPIS_DOVOLJNA = "Napravili ste porudzbinu.";
	private static final String ISPIS_NEDOVOLJNA = "Nemate dovoljno sredstava za porudzbinu.";

	public Firma(double kapital, List<Proizvodi> listaProizvoda) {
		super();
		this.kapital = kapital;
		this.listaProizvoda = listaProizvoda;
	}

	public Firma(double kapital) {
		super();
		this.kapital = kapital;
	}

	public Firma(List<Proizvodi> listaProizvoda) {
		super();
		this.listaProizvoda = listaProizvoda;
	}

	public String porudzbina(List<Proizvodi> lista) {
		boolean sredstva = false;
		double iznosPorudzbine = 0;
		for (Proizvodi proizvod : lista) {
			iznosPorudzbine = iznosPorudzbine + proizvod.konacnaCenaProizvoda();
		}
		System.out.println(lista);
		if (kapital > iznosPorudzbine) {
			sredstva = true;
			kapital = kapital - iznosPorudzbine;
			System.out.println(String.format("Novi iznos kapitala je %.2f", kapital));
			lista.clear();
		}
		return sredstva ? ISPIS_DOVOLJNA : ISPIS_NEDOVOLJNA;
	}

	public double getKapital() {
		return kapital;
	}

	public void setKapital(double kapital) {
		this.kapital = kapital;
	}

	public List<Proizvodi> getListaProizvoda() {
		return listaProizvoda;
	}

	public void setListaProizvoda(List<Proizvodi> listaProizvoda) {
		this.listaProizvoda = listaProizvoda;
	}

}
