package at.campus02.musikanten;

public class Katze extends Musikant {
    protected double kratzKraft;

    public Katze(int aB, Instrument i, double kratzKraft) {
        super(aB, i);
        this.kratzKraft = kratzKraft;
    }

    public double getKratzKraft() {
        return kratzKraft;
    }

    @Override
    public String toString() {
        return "Esel " + kratzKraft + " : " + super.toString();
    }

    @Override
    public int verscheucheRaeuber() {
        int verscheuchteRäuber = (int) Math.floor(kratzKraft);
        if (anzahlBeine == 3) {
            verscheuchteRäuber = (int) Math.floor(kratzKraft) / 2;
        } else if (anzahlBeine <= 2) {
            verscheuchteRäuber = 1;
        }

        return verscheuchteRäuber;
    }

    @Override
    public double spieleMusik() {
        return instrument.getLautstaerke();
    }
}
