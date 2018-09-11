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
public class Krug extends GeometrijskaSlika {

    private double poluprecnik;

    public Krug() {
    }

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double obim() {
    double rez=Double.parseDouble(String.format("%4.2f", 2*poluprecnik*Math.PI));
        return rez;
    }

    @Override
    public double povrsina() {
    	 double rez=Double.parseDouble(String.format("%4.2f", poluprecnik*poluprecnik*Math.PI));
        return rez;
    }

    @Override
    public String toString() {
        return "Krug poluprecnika: " + poluprecnik + " ima obim: " +this.obim ()+" i povrsinu: " + this.povrsina();
    }

   
}


