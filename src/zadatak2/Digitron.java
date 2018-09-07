package zadatak2;
import javax.swing.JOptionPane;

public class Digitron {

	public static void main(String[] args) {
		double rezultat = 0;
		int broj1;
		int broj2;

		while (true) {
			String s1 = JOptionPane.showInputDialog("Unesite prvi broj sa kojim zelite da radite:");

			String s2 = JOptionPane.showInputDialog("Unesite drugi broj sa kojim zelite da radite:");

			// ispituje da li je unet prazan string
			if (s1.length() == 0 || s2.length() == 0) {

				JOptionPane.showMessageDialog(null, "Popunite sva mesta");
				continue;

			}
			// parsira unete vrednosti u int
			try {
				broj1 = Integer.parseInt(s1);
				broj2 = Integer.parseInt(s2);

			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Pogresan format, unesite ceo broj");
				continue;
			}

			String operacija = JOptionPane.showInputDialog("Unesite kod operacije: \r\n " + "Za sabiranje: s \r\n "
					+ "Za oduzimanje: o \r\n" + "Za mnozenje dva broja: m \r\n" + "Za deljenje: d \r\n");

			switch (operacija) {
			case "s":

				rezultat = broj1 + broj2;
				break;
			case "o":

				rezultat = broj1 - broj2;
				break;
			case "m":

				rezultat = broj1 * broj2;
				break;
			case "d":
				if (broj2 != 0)
					rezultat = broj1 / (double) broj2;
				else
					JOptionPane.showMessageDialog(null, "Nije dozvoljeno deljenje sa nulom!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Los unos opcije!");
				continue;
			}

			JOptionPane.showMessageDialog(null, "Resenje je: " + rezultat);

			String nastavak = JOptionPane.showInputDialog("Da li zelite da nastavite sa programom (da ili ne)?");
			if (nastavak.equalsIgnoreCase("da"))
				continue;
			else {
				JOptionPane.showMessageDialog(null, "Kraj!");
				break;
			}

		}

	}

}
