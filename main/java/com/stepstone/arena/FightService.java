package com.stepstone.arena;

import java.util.Random;

public class FightService {



    private static int random(int min, int max) {
        return  new Random().nextInt((max - min) + 1) + min;
    }



    public static void fight(Creature creatureOne, Creature creatureTwo) {

        System.out.println(creatureTwo);
        if (creatureOne.getDexterity() > random(0,9)) {
            int attackDamage = creatureOne.getStrength() + random(0,2);

            System.out.println("Attacked with " + attackDamage + " damage");

            creatureTwo.setLifePoints(
                    creatureTwo.getLifePoints() - attackDamage
            );
        } else {
            System.out.println("Missed attack with " + creatureOne.getDexterity() + " dexterity");
        }

        System.out.println(creatureTwo);

        return;
    }
}
