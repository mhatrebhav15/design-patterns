package creational.prototype;

import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        // Define common skills
        List<String> warriorSkills = Arrays.asList("Sword Slash", "Shield Block", "Power Strike");
        
        // Create the prototype character (a base Warrior character)
        Character warriorPrototype = new Character("Warrior", 100, 50, 30, warriorSkills);
        
        // Clone the Warrior and modify specific attributes
        Character clonedWarrior = warriorPrototype.clone();
        clonedWarrior.setName("Elite Warrior");
        clonedWarrior.setHealth(120);  // Increased health for the elite version
        clonedWarrior.setStrength(60); // Increased strength for the elite version
        clonedWarrior.setSkills(Arrays.asList("Sword Slash", "Shield Block", "Berserk Strike"));

        // Create another clone with different changes
        Character clonedArcher = warriorPrototype.clone();
        clonedArcher.setName("Archer");
        clonedArcher.setHealth(80);
        clonedArcher.setStrength(40);
        clonedArcher.setArmor(10);  // Light armor for Archer
        clonedArcher.setSkills(Arrays.asList("Bow Shot", "Quick Dodge", "Critical Shot"));

        // Print out the characters
        System.out.println("Original Warrior: " + warriorPrototype);
        System.out.println("Cloned Warrior: " + clonedWarrior);
        System.out.println("Cloned Archer: " + clonedArcher);
    }
}
