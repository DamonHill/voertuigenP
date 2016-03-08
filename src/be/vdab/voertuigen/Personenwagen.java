/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.util.Vervuiler;

/**
 *
 * @author arne.simons
 */
public class Personenwagen extends Voertuig implements Vervuiler {
    private int aantalDeuren;
    private int aantalPassagiers;

    public Personenwagen() {
        aantalDeuren = 4;
        aantalPassagiers = 5;
    }

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat,
            int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public final void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren >= 0) {
            this.aantalDeuren = aantalDeuren;   
        }
    }

    public final void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers >= 0) {
            this.aantalPassagiers = aantalPassagiers;   
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ";" + aantalDeuren + ";" + aantalPassagiers;
    }
    
    @Override
    public String toon() {
        return super.toon() + "\nAantal deuren: " + aantalDeuren
                + "\nAantal passagiers: " + aantalPassagiers;
    }
    
    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }
    
    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5;
    }
}