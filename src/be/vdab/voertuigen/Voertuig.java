/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.util.Privaat;
import be.vdab.util.Milieu;

/**
 *
 * @author arne.simons
 */
public abstract class Voertuig implements Privaat, Milieu, Comparable<Voertuig> {
    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig() {
        polishouder = "onbepaald";
        nummerplaat = "onbepaald";
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty()) {
            this.polishouder = polishouder;
        }
    }

    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0) {
            this.kostprijs = kostprijs; 
        }
    }

    public final void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk; 
        }
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0) {
            this.gemVerbruik = gemVerbruik;
        } 
    }

    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty()) {
            this.nummerplaat = nummerplaat;
        }
    }
    
    @Override
    public String toString() {
        return polishouder + ";" + kostprijs + ";" + pk + ";" + gemVerbruik + ";" + nummerplaat;
    }
    
    public String toon() {
        return "Polishouder: " + polishouder + "\n" +
               "Kostprijs: " + kostprijs + "\n" +
               "Aantal PK: " + pk + "\n" +
               "Gemiddeld verbruik: " + gemVerbruik + "\n" +
               "Nummerplaat: " + nummerplaat; 
    }
    
    public abstract double getKyotoScore();
    
    @Override
    public void geefPrivateData() {
        System.out.println("Polishouder: " + polishouder + ", nummerplaat: " + nummerplaat);
    }
    
    @Override
    public void geefMilieuData() {
        System.out.println("Aantal PK: " + pk + ", kostprijs: " + kostprijs + ", verbruik: " + gemVerbruik);
    }
    
    @Override 
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Voertuig)) {
            return false;
        }
        Voertuig v = (Voertuig) o;
        return (nummerplaat.equals(v.getNummerplaat()));
    }

    @Override 
    public int hashCode() {
        return pk;
    }
  
    @Override
    public int compareTo(Voertuig v) { 
        if (v == null) 
            throw new NullPointerException();
        else {
            if (this.equals(v)) 
                return 0; 
            else  
                return nummerplaat.compareTo(v.getNummerplaat()); 
        } 
    }   
}
