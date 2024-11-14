package org.example.visitors;

import org.example.enemies.CryoEnemy;
import org.example.enemies.Enemy;
import org.example.enemies.HydroEnemy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementalReactionVisitorTest {


    ElementalReactionVisitor pyroReaction = new PyroReactionVisitor();
    ElementalReactionVisitor electroReaction = new ElectroReactionVisitor();

    /**
     * Checks that all the visitors generates the corresponding elemental reaction
     * when they visit a Cryo Enemy
     */
    @Test
    void cryoReactions(){
        Enemy cryoEnemy = new CryoEnemy();

        assertEquals("Melt: The cryo enemy takes damage x2.",
                cryoEnemy.accept(pyroReaction));

        assertEquals("Superconduct: Cryo enemy takes electrical damage and has its physical resistance reduced.",
                cryoEnemy.accept(electroReaction));
    }

    /**
     * Checks that all the visitors generates the corresponding elemental reaction
     * when they visit a Hydro Enemy
     */
    @Test
    void hydroReactions(){
        Enemy hydroEnemy = new HydroEnemy();

        assertEquals("Vaporize: The hydro enemy takes damage x1.5.",
                hydroEnemy.accept(pyroReaction));

        assertEquals("Electro-Charged: Hydro enemy takes continuous electro damage.",
                hydroEnemy.accept(electroReaction));
    }



}