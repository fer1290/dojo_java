package src.main.java.javaoop.objectmaster.human;

public class Wizard extends Human {
    public Wizard() {
        setHealth(50);
        setMaxHealth(50);
        setIntelligence(8);
    }

    public void heal(Human human) {
        human.addHealth(getIntelligence());
    }

    public void fireBall(Human human) {
        human.substractHealth(getIntelligence() * 3);
    }
}
