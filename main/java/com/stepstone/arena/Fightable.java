package com.stepstone.arena;

public interface Fightable {
    int fight(Creature target);

    void dodge(int potentialDamage, Creature attacker);
}
