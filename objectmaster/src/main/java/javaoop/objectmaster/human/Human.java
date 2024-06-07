package src.main.java.javaoop.objectmaster.human;
public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    private int maxHealth = 100;

    public void attack(Human human) {
        if (human.health - this.strength >= 0) {
            human.substractHealth(this.strength);
        } else {
            human.health = 0;
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getStealth() {
        return stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void addHealth(int health) {
        if (this.health + health <= this.maxHealth) {
            this.health += health;
        } else {
            this.health = this.maxHealth;
        }
    }

    public void substractHealth(int health) {
        if (this.health - health > 0) {
            this.health -= health;

        } else {
            this.health = 0;
            System.out.println("Dead");
        }
    }
}