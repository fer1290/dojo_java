package src.main.java.com.javaoop.zookeeper.animal;

public class Bat extends Animal {
    public Bat() {
        setEnergyLevel(300);
    }

    public void fly() {
        if (displayEnergy() > 49) {
            System.out.println("batbatbat...");
            substractEnergy(50);
        } else {
            System.out.println("no energy to fly");
        }
    }

    public void eatHumans() {
        if (displayEnergy() > 24) {
            System.out.println("well, it doesn´t matter");
            substractEnergy(25);
        } else {
            System.out.println("no energy to eat");
        }
    }

    public void attackTown() {
        if (displayEnergy() > 99) {
            System.out.println("firefirefire");
            substractEnergy(100);
        } else {
            System.out.println("no energy to attack");
        }
    }
}
