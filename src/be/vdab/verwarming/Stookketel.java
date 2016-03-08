/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.verwarming;

import be.vdab.util.Vervuiler;

/**
 *
 * @author arne.simons
 */
public class Stookketel implements Vervuiler {
    private float CONorm;

    public Stookketel(float CONorm) {
        this.CONorm = CONorm;
    }

    public float getCONorm() {
        return CONorm;
    }

    public void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }
    
    @Override
    public double berekenVervuiling() {
        return CONorm * 100;
    }   
}
