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
public class Elipsa extends Krug{
    
    private double poluprecnik2;

    public Elipsa() {
    }

    public Elipsa(double poluprecnik2) {
        
    }

    public Elipsa(double poluprecnik, double poluprecnik2) {
        super(poluprecnik);
        this.poluprecnik2 = poluprecnik2;
    }

    public double getPoluprecnik2() {
        return poluprecnik2;
    }

    public void setPoluprecnik2(double poluprecnik2) {
        this.poluprecnik2 = poluprecnik2;
    }

    

    @Override
    public double povrsina() {
    	double rez=Double.parseDouble(String.format("%4.2f", this.getPoluprecnik()*poluprecnik2*Math.PI));
        return rez;
    }

    @Override
    public double obim() {
    	double rez=Double.parseDouble(String.format("%4.2f", this.getPoluprecnik()*Math.PI*(9-Math.sqrt(35))/2));
        return rez;
    }

    @Override
    public String toString() {
        return "Elipsa poluprecnika " + getPoluprecnik() + " i " + this.getPoluprecnik2() + " ima obim: " + obim() + " i povrsinu: " + povrsina();
    }
    
}
