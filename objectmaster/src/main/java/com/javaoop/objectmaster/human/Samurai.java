package src.main.java.javaoop.objectmaster.human;

public class Samurai extends Human {
    private static int count = 0;

    public Samurai() {
        setHealth(200);
        setMaxHealth(200);
        count++;
    }

    public void deathBlow(Human human) {
        human.setHealth(0);
        setHealth(getHealth() / 2);
    }

    public void meditate() {
        setHealth(getHealth() * 3 / 2);
    }

    public static int howMany() {
        return count;
    }
}
