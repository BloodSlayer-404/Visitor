package org.example.enemies;

import org.example.visitors.ElementalReactionVisitor;

public interface Enemy {

    /**
     * Accepts an ElementalReactionVisitor to trigger a specific reaction.
     * @param visitor: The ElementalReactionVisitor applying the reaction
     * @return The elementalReaction that triggers the visitor
     */
    String accept(ElementalReactionVisitor visitor);
}
