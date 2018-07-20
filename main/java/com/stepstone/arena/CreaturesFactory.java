package com.stepstone.arena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaturesFactory {

    private Random random = new Random();

    Creature generate(CreatureType type, int strength, int dexterity, int initiative, int value) {
        switch (type) {
            case DWARF:

                return new Dwarf(strength, dexterity, initiative, value, value, value, value, value);
            case ELF:

                return new Elf(strength, dexterity, initiative, value, value, value, value, value);
            case HALFLING:

                return new Halfling(strength, dexterity, initiative, value, value, value, value, value);
            case HUMAN:

                return new Human(strength, dexterity, initiative, value, value, value, value, value);
            case ORC:

                return new Orc(strength, dexterity, initiative, value, value, value, value, value);
            case TROLL:

                return new Troll(strength, dexterity, initiative, value, value, value, value, value);

            default:

                return null;
        }
    }

    private int random(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    CreatureType randomCreatureType() {
        int index = random(0, CreatureType.values().length - 1);
        CreatureType type = CreatureType.values()[index];

        return type;
    }

    Creature randomCreature() {
        CreatureType type = randomCreatureType();
        int value = random(1, 10);
        int strength = random(1, 10);
        int dexterity = random(1, 10);
        int initiative = random(1, 10);

        return generate(type, strength, dexterity, initiative, value);
    }

    List<Creature> randomCreatureList(int listSize) {
        List<Creature> creaturesList = new ArrayList<>(listSize);

        for (int i = 0; i <= listSize; i++) {
            creaturesList.add(randomCreature());
        }

        return creaturesList;
    }
}


