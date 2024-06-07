package src.main.java.javaoop.objectmaster.program;
import src.main.java.javaoop.objectmaster.human.Ninja;
import src.main.java.javaoop.objectmaster.human.Samurai;
import src.main.java.javaoop.objectmaster.human.Wizard;

public class HumanTest {
    public static void main(String[] args) {
        // Human human1 = new Human();
        // Human human2 = new Human();
        // human1.attack(human2);
        // System.out.println("Health enemy: " + human2.getHealth());
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Wizard wizard = new Wizard();
        ninja.steal(wizard);
        System.out.println("Wizard health: " + wizard.getHealth());
        samurai.deathBlow(ninja);
        System.out.println("Ninja health: " + ninja.getHealth());
    }
}
