package org.example.visitors;

import org.example.enemies.CryoEnemy;
import org.example.enemies.HydroEnemy;

public class PyroReactionVisitor implements ElementalReactionVisitor{

    /**
     * Triggers the Melt reaction on an IceEnemy.
     * @param cryoEnemy: The IceEnemy being affected
     */
    @Override
    public String visitCryo(CryoEnemy cryoEnemy) {
        return "Melt: The cryo enemy takes damage x2.";
    }

    /**
     * Triggers the Vaporize reaction on a HydroEnemy.
     * @param hydroEnemy: The HydroEnemy being affected
     */
    @Override
    public String visitHydro(HydroEnemy hydroEnemy) {
        return "Vaporize: The hydro enemy takes damage x1.5.";
    }
}
