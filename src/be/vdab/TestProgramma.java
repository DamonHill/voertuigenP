/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.verwarming.Stookketel;
import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Voertuig;
import be.vdab.voertuigen.Vrachtwagen;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author arne.simons
 */
public class TestProgramma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vervuiler[] vervuilers = new Vervuiler[4];
        vervuilers[0] = new Personenwagen("Arne Simons", 52000.0F, 180, 8.5F, "1-DFO-769", 5, 5);
        vervuilers[1] = new Vrachtwagen("JP. Jochems", 120000.0F, 520, 16.0F, "JPJ001", 25000.0F);
        vervuilers[2] = new Stookketel(55.25F);
        vervuilers[3] = new Vrachtwagen("Guy Hoek", 99000.0F, 460, 15.0F, "GUY001", 21000.0F);
        
        for (Vervuiler v: vervuilers) {
            if (v != null) {
                System.out.println(v.berekenVervuiling());
            }
        }
        
        Privaat[] privaten = new Privaat[3];
        privaten[0] = (Personenwagen)vervuilers[0];
        privaten[1] = (Vrachtwagen)vervuilers[1];
        privaten[2] = (Vrachtwagen)vervuilers[3];
        
        for (Privaat p: privaten) {
            if (p != null) {
                p.geefPrivateData();
            }
        }
        
        Milieu[] milieus = new Milieu[3];
        milieus[0] = (Personenwagen)vervuilers[0];
        milieus[1] = (Vrachtwagen)vervuilers[1];
        milieus[2] = (Vrachtwagen)vervuilers[3];
        
        for (Milieu m: milieus) {
            if (m != null) {
                m.geefMilieuData();
            }
        }
        
        Set<Voertuig> voertuigen = new TreeSet<>();
        voertuigen.add((Voertuig)vervuilers[0]);
        voertuigen.add((Voertuig)vervuilers[1]);
        voertuigen.add((Voertuig)vervuilers[3]);
        
        for (Voertuig v: voertuigen) {
            System.out.println(v.toon());
        }
        
    }
}