package zadatak10;

import java.util.ArrayList;

import java.util.List;

/**
 * Program provera mogucnost porudzbine za firmu
 *
 * @author Nadezda Petrovic
 */
public class Test {
	public static void main(String[] args) {

		List<Proizvodi> lista = new ArrayList<>();
		List<Proizvodi> lista2 = new ArrayList<>();

		Proizvodi sir = new MlecniProizvodi("sir", 123, "novembar 2018", "koziji");
		Proizvodi sok = new Sokovi("vocni sok", 231.8, "decembar 2018", "jabuka");
		Proizvodi meso = new Meso("file", 558.9, "septembar 2018", "svinjsko");
		Proizvodi kafa = new Kafa("kafa", 352.0, "avgust 2019", "mlevena");
		Firma firma = new Firma(500.55);
		lista.add(sir);
		lista.add(sok);
		lista2.add(meso);
		lista2.add(kafa);
		lista2.add(sir);
		System.out.println(firma.porudzbina(lista));
		System.out.println(firma.porudzbina(lista2));
	}
}
