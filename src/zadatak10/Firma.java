package zadatak10;

import java.util.ArrayList;

public class Firma {
	private double kapital;
	private ArrayList<Proizvodi> listaProizvoda;
	private static final String ISPIS_DOVOLJNA = "Napravili ste porudzbinu.";
	private static final String ISPIS_NEDOVOLJNA = "Nemate dovoljno sredstava za porudzbinu.";

	public Firma(double kapital, ArrayList<Proizvodi> listaProizvoda) {
		super();
		this.kapital = kapital;
		this.listaProizvoda = listaProizvoda;
	}

	public Firma(double kapital) {
		super();
		this.kapital = kapital;
	}

	public Firma(ArrayList<Proizvodi> listaProizvoda) {
		super();
		this.listaProizvoda = listaProizvoda;
	}

	public String porudzbina(ArrayList<Proizvodi> lista) {
		boolean sredstva = false;
		double iznosPorudzbine = 0;
		for (Proizvodi proizvod : lista) {
			iznosPorudzbine = iznosPorudzbine + proizvod.konacnaCenaProizvoda();
		}
		System.out.println(lista);
		if (kapital > iznosPorudzbine) {
			sredstva = true;
			kapital = kapital - iznosPorudzbine;
			System.out.println(String.format("Novi iznos kapital je %.2f", kapital));
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

	public ArrayList<Proizvodi> getListaProizvoda() {
		return listaProizvoda;
	}

	public void setListaProizvoda(ArrayList<Proizvodi> listaProizvoda) {
		this.listaProizvoda = listaProizvoda;
	}

}
