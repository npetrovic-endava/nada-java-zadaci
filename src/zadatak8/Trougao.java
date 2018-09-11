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

public class Trougao extends GeometrijskaSlika {
    private double stranica;
   

    public Trougao() {
    }

    public Trougao(double stranica) {
        this.stranica = stranica;
    }

       
    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double obim() {
    	 double rez=Double.parseDouble(String.format("%4.2f", 3*stranica));
        return rez;
    }
//heronova formula za izracunavanje povrsine trougla preko stranica
    @Override
    public double povrsina() {
        double poluobim=3*stranica/2;
        double pomocna=poluobim - stranica;
        double rez=Double.parseDouble(String.format("%4.2f", Math.sqrt(poluobim*(Math.pow(pomocna,3)))));
        return rez;
    }

    @Override
    public String toString() {
        return "Jednakostranicni trougao stranice: " + stranica + " ima obim " + obim() + " i povrsinu: " + povrsina();
    }
    
}
