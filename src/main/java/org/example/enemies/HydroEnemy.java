package org.example.enemies;

import org.example.visitors.ElementalReactionVisitor;

public class HydroEnemy implements Enemy{

    /**
     * Accepts an ElementalReactionVisitor to trigger a reaction specific to HydroEnemy.
     * @param visitor: The ElementalReactionVisitor applying the reaction
     * @return The elementalReaction that triggers the visitor
     */
    @Override
    public String accept(ElementalReactionVisitor visitor) {
        return visitor.visitHydro(this);
    }
}
