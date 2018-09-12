package zadatak10;

public class Test {
	public static void main(String[] args) {

		Proizvodi mleko = new MlecniProizvodi("sir", 123, "novembar 2018", "koziji");
		Proizvodi sok = new Sokovi("vocni sok", 231.8, "decembar 2018", "jabuka");
		Proizvodi meso = new Meso("file", 558.9, "septembar 2018", "svinjsko");
		Proizvodi kafa = new Kafa("kafa", 352.0, "avgust 2019", "mlevena");

		System.out.println(mleko.toString());
		System.out.println(sok.toString());
		System.out.println(meso.toString());
		System.out.println(kafa.toString());
	}
}
