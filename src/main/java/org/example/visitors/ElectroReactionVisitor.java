package org.example.visitors;

import org.example.enemies.CryoEnemy;
import org.example.enemies.HydroEnemy;

public class ElectroReactionVisitor implements ElementalReactionVisitor{

    /**
     * Triggers the Superconduct reaction on an CryoEnemy.
     * @param cryoEnemy the IceEnemy being affected
     */
    @Override
    public String visitCryo(CryoEnemy cryoEnemy) {
        return "Superconduct: Cryo enemy takes electrical damage and has its physical resistance reduced.";
    }

    /**
     * Triggers the Electro-Charged reaction on a HydroEnemy.
     * @param hydroEnemy the WaterEnemy being affected
     */
    @Override
    public String visitHydro(HydroEnemy hydroEnemy) {
        return "Electro-Charged: Hydro enemy takes continuous electro damage.";
    }
}
