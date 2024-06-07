package src.main.java.javaoop.objectmaster.human;

public class Ninja extends Human {
    public Ninja() {
        setStealth(10);
    }

    public void steal(Human human) {
        human.substractHealth(getStealth());
        addHealth(getStealth());
    }

    public void runAway() {
        substractHealth(10);
    }
}
