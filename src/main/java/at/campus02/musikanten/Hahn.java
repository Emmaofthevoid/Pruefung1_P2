package at.campus02.musikanten;

public class Hahn extends Musikant {
    protected int flugWeite;

    public Hahn(int aB, Instrument i, int flugWeite) {
        super(aB, i);
        this.flugWeite = flugWeite;
    }

    public int getFlugWeite() {
        return flugWeite;
    }

    @Override
    public String toString() {
        return "Hahn " + flugWeite + " : " + super.toString();
    }

    @Override
    public int verscheucheRaeuber() {
        int verscheuchteRäuber = 0;
        if (flugWeite < 2) {
            verscheuchteRäuber = (int) Math.floor(instrument.getLautstaerke());
        }

        switch (verscheuchteRäuber) {
            case 2:
                verscheuchteRäuber = 6;
                break;
            case 3:
                verscheuchteRäuber = 5;
                break;
            case 4:
                verscheuchteRäuber = 4;
                break;
            case 5:
                verscheuchteRäuber = 3;
                break;
            case 6:
                verscheuchteRäuber = 2;
                break;
            default:
                verscheuchteRäuber = 1;

        }

        return verscheuchteRäuber;
    }

    @Override
    public double spieleMusik() {
        return (instrument.getLautstaerke() + 2) / flugWeite;
    }
}
