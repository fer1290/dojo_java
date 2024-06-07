package src.main.java.com.javaoop.zookeeper.animal;

public class Gorilla extends Animal {
    public void throwSomething() {
        if (displayEnergy() > 4) {
            System.out.println("throwing object...");
            substractEnergy(5);
        } else {
            System.out.println("No energy to throw");
        }
    }

    public void eatBananas() {
        addEnergy(10);
        System.out.println("satisfed gorilla");
    }

    public void climb() {
        if (displayEnergy() > 9) {
            System.out.println("gorilla has climbed to the top");
            substractEnergy(10);
        } else {
            System.out.println("No energy to climb");
        }
    }
}
