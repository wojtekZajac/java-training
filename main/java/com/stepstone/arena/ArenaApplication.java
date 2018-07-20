package com.stepstone.arena;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

//@SpringBootApplication
public class ArenaApplication {

    public static void main(String[] args) {
        CreaturesFactory factory = new CreaturesFactory();

        List<Creature> randomCreatures = factory.randomCreatureList(2);

        FightService.fight(randomCreatures.get(0), randomCreatures.get(1));

//        for (int i = 0; i < randomCreatures.size(); i++) {
//            System.out.println("Creature: " + randomCreatures.get(i));
//        }
//
//        Iterator<Creature> iterator = randomCreatures.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("Creature: " + iterator.next());
//        }
//
//        for (Creature creature : randomCreatures) {
//            System.out.println("Creature: " + creature);
//        }
    }
}
