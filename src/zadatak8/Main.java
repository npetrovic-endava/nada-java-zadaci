
package zadatak8;
 /*
 * Apstraktnu klasu GeometrijskaSlika nasledjuju klase Krug, Kvadrat i Trougao.
 * Izvedene klase su Elipsa, Pravougaonik i Nejednakostranicni trougao
 * Klase imaju preklopljenu metodu toString koja ispisuje obim i povrsinu oblika
 */

/**
 *
 * @author Nadezda Petrovic
 */

public class Main {

    public static void main(String[] args) {
        GeometrijskaSlika krug = new Krug(3.2);
        GeometrijskaSlika elipsa = new Elipsa(5, 2);
        GeometrijskaSlika kvadrat = new Kvadrat(6.4);
        GeometrijskaSlika pravougaonik = new Pravougaonik(6, 4);
        GeometrijskaSlika trougao = new Trougao(3);
        GeometrijskaSlika trougao2 = new NejednakostranicniTrougao(3,8.2,12);
         
        System.out.println(krug.toString());
        System.out.println(elipsa.toString());
        System.out.println(kvadrat.toString());
        System.out.println(pravougaonik.toString());
        System.out.println(trougao.toString());
        System.out.println(trougao2.toString());
    }

}
