package zadatak12;



/**

*

* @author Nadezda.Petrovic

*

*/

public class Student {

	private String imePrezime;

	private double brojPoena;

	private int ocena;



	public Student(String imePrezime, double brojPoena, int ocena) {

		super();

		this.imePrezime = imePrezime;

		this.brojPoena = brojPoena;

		this.ocena = ocena;

	}



	public String getImePrezime() {

		return imePrezime;

	}



	public void setImePrezime(String imePrezime) {

		this.imePrezime = imePrezime;

	}



	public double getBrojPoena() {

		return brojPoena;

	}



	public void setBrojPoena(double brojPoena) {

		this.brojPoena = brojPoena;

	}



	public int getOcena() {

		return ocena;

	}



	public void setOcena(int ocena) {

		this.ocena = ocena;

	}



	@Override

	public String toString() {

		return new StringBuilder(" Student ime: ").append(imePrezime).append(", broj poena: ").append(brojPoena)

				.append(", Ocena: ").append(ocena).toString();



	}



}