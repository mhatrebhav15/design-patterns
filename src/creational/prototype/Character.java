package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Character implements CharacterPrototype {
    private String name;
    private int health;
    private int strength;
    private int armor;
    private List<String> skills;

    // Constructor to create a base character
    public Character(String name, int health, int strength, int armor, List<String> skills) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.armor = armor;
        this.skills = new ArrayList<>(skills); // Deep copy of the skills list
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    // Implement clone method (deep clone)
    @Override
    public Character clone() {
        // Create a new character with the same properties
        return new Character(this.name, this.health, this.strength, this.armor, this.skills);
    }

    // Display character information
    @Override
    public String toString() {
        return "Character{" +
               "name='" + name + '\'' +
               ", health=" + health +
               ", strength=" + strength +
               ", armor=" + armor +
               ", skills=" + skills +
               '}';
    }
}
