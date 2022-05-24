package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {
    private ArrayList<Musikant> arrmusiker;

    public Quartett() {
        this.arrmusiker = new ArrayList<>();
        // TODO
    }

    public void add(Musikant m) {
        arrmusiker.add(m);
    }

    public boolean istQuartett() {
        if (arrmusiker.size() == 4) {
            return true;
        }
        return false;
    }

    public int gemeinsamRaeuberVerscheucht() {
        int sum = 0;
        Iterator<Musikant> iterator = arrmusiker.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().verscheucheRaeuber();
        }

        return sum;
    }

    public double durchschnittlicheLautstaerke() {
        double durschnittLautsaerke = 0;
        for (Musikant m : arrmusiker) {
            durschnittLautsaerke += m.spieleMusik();
        }
        return durschnittLautsaerke / arrmusiker.size();
    }

    public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
        ArrayList<Musikant> newArrMusiker = new ArrayList<>();

        for (Musikant m : arrmusiker) {

            double laut = m.spieleMusik();
            if (laut > von &&  laut < bis) {
                newArrMusiker.add(m);
            }
        }

            return newArrMusiker;
    }

    public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
        // TODO
        return null;
    }

    public void printLautStaerkeAbsteigend() {
        // TODO
    }
}
