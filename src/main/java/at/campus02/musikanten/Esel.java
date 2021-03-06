package at.campus02.musikanten;

public class Esel extends Musikant {
    protected double trittkraft;


    public Esel(int aB, Instrument i, double trittkraft) {
        super(aB, i);
        this.trittkraft = trittkraft;
    }

    public double getTrittkraft() {
        return trittkraft;
    }

    @Override
    public String toString() {
        return "Esel " + trittkraft + " : " + super.toString();
    }

    @Override
    public int verscheucheRaeuber() {
        int verscheuchteteR√§uber = (int) Math.floor(trittkraft * anzahlBeine);
        return verscheuchteteR√§uber;
    }

    @Override
    public double spieleMusik() {
        double lautstaerke = instrument.getLautstaerke();
        return 0;
    }
}
