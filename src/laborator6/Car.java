package laborator6;

public class Car {

    private int pret;
    private int anFabricatie;
    private Tip tip;

    enum Tip {DACIA, RENAULT, FIAT}

    public int getPret() {
        return pret;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public Tip getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pret=" + pret +
                ", anFabricatie=" + anFabricatie +
                ", tip=" + tip +
                '}';
    }

    public Car(Tip tip, int pret, int anFabricatie) {
        this.pret = pret;
        this.anFabricatie = anFabricatie;
        this.tip = tip;
    }
}
