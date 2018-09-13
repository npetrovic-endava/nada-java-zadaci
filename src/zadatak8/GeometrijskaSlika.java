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
public abstract class GeometrijskaSlika {

    protected GeometrijskaSlika() {
    }

    public abstract double obim();

    public abstract double povrsina();

    @Override
    public String toString() {
        return "Geometrijska slika";
    }

}
