package at.campus02.musikanten;

public class Hund extends Musikant {
    protected double bellLautstaerke;

    public Hund(int aB, Instrument i, double bellLautstaerke) {
        super(aB, i);
        this.bellLautstaerke = bellLautstaerke;

    }

    public double getBellLautstaerke() {
        return bellLautstaerke;
    }

    @Override
    public String toString() {
        return "Hund " + bellLautstaerke + " : " + super.toString();
    }

    @Override
    public int verscheucheRaeuber() {
        int lauteGeräusch;
        if (instrument.getLautstaerke() < bellLautstaerke) {
            return lauteGeräusch = (int) Math.floor(bellLautstaerke);
        } else {
            return lauteGeräusch = (int) Math.floor(instrument.getLautstaerke());
        }

    }

    @Override
    public double spieleMusik() {
        return (instrument.getLautstaerke() + bellLautstaerke) /2 ;
    }
}
