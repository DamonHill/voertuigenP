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
public class Vrachtwagen extends Voertuig implements Vervuiler {
    private float maxLading;

    public Vrachtwagen() {
        maxLading = 10000;
    }
    
    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }
    
    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading >= 0) {
            this.maxLading = maxLading;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ";" + maxLading;
    }
    
    @Override
    public String toon() {
        return super.toon() + "\nLaadvermogen: " + maxLading;
    }
    
    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / (maxLading / 1000);
    }
    
    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20;
    }
}
