package com.stepstone.arena;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ArenaApplication {

	public static void main(String[] args) {
		CreaturesFactory factory = new CreaturesFactory();
		Creature troll = factory.generate(CreatureType.TROLL);
		Creature elf = factory.generate(CreatureType.ELF);

		System.out.println(troll);
		System.out.println(elf);

	}
}
