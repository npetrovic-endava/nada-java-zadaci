/**
 * Nakon unesenog niza od n brojeva, sortira niz, ispisuje da li sadrzi broj x
 * ispisuje prvih pet clanova niza
 * */
package zadatak7;
 
/**
*
* @author Nadezda Petrovic
*/

import java.util.Arrays;
import java.util.Scanner;

public class NizBrojeva {
	
	static Scanner ulaz = new Scanner(System.in);
	static int clanovi;
	public static int niz[];
	

	public static void main(String[] args) {

		while (true) {
			System.out.println("Uneti broj clanova niza veci ili jednak broju 5:");
			//ispituje da li je unet ceo broj
			clanovi = proveraInt();
			
           //ispituje da li je unos broja clanova niza korektan
			if (5 > clanovi) {
				
				System.out.println("Pogresan unos, broj treba da je veci ili jednak 5");
			} else
				break;
		}

		niz = new int[clanovi];

		for (int i = 0; i < clanovi; i++) {

			System.out.println(new StringBuilder("Unesite ").append(i+1).append(". clan niza"));

			niz[i] = proveraInt();
			
		}
		
		
		Arrays.sort(niz);
		//ispisivanje prvih pet clanova sortiranog niza
		
		System.out.println("Dobijeni sortirani niz od pet clanova je:");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(new StringBuilder().append(niz[i]).append(" "));
		}
		
		
		//provera da li je uneti broj clan niza
		System.out.println("\nUneti broj za koji zelite da vidite da li je u nizu:");
        
		int brojX= proveraInt();
		String pripada =brojPripadaNizu(brojX);
		System.out.println(pripada);
		ulaz.close();
	}

	public static int proveraInt() {

		while (!ulaz.hasNextInt()) {

			System.out.println("Pogresan parametar, unesite ceo broj veci od 5!");

			ulaz.next();

		}

		return ulaz.nextInt();

	}
	public static String brojPripadaNizu(int x) {
		for(int i=0; i<clanovi; i++) {
			if(x==niz[i]) {
				return "Broj pripada nizu.";
			}
		}
				return "Broj ne pripada nizu.";
		

	}
}
