 /*Korisnik unosi dva broja, zatim kod operacije koju zeli da izvrsi 
 * (s-sabiranje, o-oduzimanje, m-mnozenje, d-deljenje)
 * Rezultat je ispisivanje rezultata operacije nad operandima
 */
package zadatak6;

/**
 *
 * @author Nadezda Petrovic
 */
import javax.swing.JOptionPane;

public class ModifikacijaDigitron {

	public static void main(String[] args) {
		double rezultat;
		double broj1;
		double broj2;
		boolean pomocna1;
		boolean pomocna2;
		boolean f = false;

		while (true) {
			String s1 = JOptionPane.showInputDialog("Unesite prvi broj sa kojim zelite da radite:");

			String s2 = JOptionPane.showInputDialog("Unesite drugi broj sa kojim zelite da radite:");

			// ispituje da li je unet prazan string
			if (s1.length() == 0 || s2.length() == 0) {

				JOptionPane.showMessageDialog(null, "Popunite sva mesta!");
				continue;

			}
			// proverava unete vrednosti da li je string double
			pomocna1 = proveraBroj(s1);
			pomocna2 = proveraBroj(s2);

			if (f == pomocna1 || f == pomocna2) {
				JOptionPane.showMessageDialog(null, "Pogresan format, unesite ceo broj.");
				continue;
			}
			// parsira string
			broj1 = Double.parseDouble(s1);
			broj2 = Double.parseDouble(s2);

			String operacija = JOptionPane.showInputDialog("Unesite kod operacije: \r\n " + "Za sabiranje: s \r\n "
					+ "Za oduzimanje: o \r\n" + "Za mnozenje dva broja: m \r\n" + "Za deljenje: d \r\n");

			switch (operacija) {
			case "s":
				rezultat = sabiranje(broj1, broj2); 
				break;
			case "o":
                rezultat=oduzimanje(broj1, broj2);
				
				break;
			case "m":

				rezultat = mnozenje(broj1, broj2);
				break;
			case "d":
				if (broj2 != 0) {
					rezultat = deljenje(broj1, broj2);
				} else {
					JOptionPane.showMessageDialog(null, "Nije dozvoljeno deljenje sa nulom!");
					continue;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Los unos opcije!");
				continue;
			}

			JOptionPane.showMessageDialog(null, "Resenje je: " + rezultat);

			String nastavak = JOptionPane.showInputDialog("Da li zelite da nastavite sa programom (da ili ne)?");
			if (nastavak.equalsIgnoreCase("da")) {
			} else {
				JOptionPane.showMessageDialog(null, "Kraj!");
				break;
			}
		}
	}

	// metoda za proveru da li je string broj
	public static boolean proveraBroj(String s) {

		String regex = "[+-]?([0-9]*[.])?[0-9]+";
		return s.matches(regex);
	}

	public static double sabiranje(double a, double b) {
		double suma;
		suma = a + b;
		return suma;
	}
	public static double oduzimanje(double a, double b) {
		double razlika=a-b;
		return razlika;
	}
	public static double mnozenje(double a, double b) {
		double proizvod=a * b;
		return proizvod;
	}
	public static double deljenje(double a, double b) {
		double rezultat;
		rezultat= a/b;
		return rezultat;
	}
}
