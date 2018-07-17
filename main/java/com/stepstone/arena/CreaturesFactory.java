package com.stepstone.arena;

public class CreaturesFactory {
    Creature generate(CreatureType type) {
        switch (type) {
            case DWARF:
                return new Dwarf(1,2,3,4,5,6,7,6);

            case ELF:
                return new Elf(1,2,3,4,5,6,7,6);

            case HALFLING:

                return new Halfling(1,2,3,4,5,6,7,6);
            case HUMAN:

                return new Human(1,2,3,4,5,6,7,6);
            case ORC:

                return new Orc(1,2,3,4,5,6,7,6);
            case TROLL:

                return new Troll(100,2,3,4,5,6,7,6);

            default:

                return null;
        }


    }
}
