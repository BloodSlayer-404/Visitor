package org.example.visitors;

import org.example.enemies.CryoEnemy;
import org.example.enemies.HydroEnemy;

public interface ElementalReactionVisitor {

    /**
     * Triggers a specific reaction when visiting a CryoEnemy.
     * @param cryoEnemy: The Cryo Enemy being visited
     * @return The corresponding elemental reaction from the visitor
     */
    String visitCryo(CryoEnemy cryoEnemy);

    /**
     * Triggers a specific reaction when visiting a HydroEnemy.
     * @param hydroEnemy: The Hydro Enemy being visited
     * @return The corresponding elemental reaction from the visitor
     */
    String visitHydro(HydroEnemy hydroEnemy);
}
