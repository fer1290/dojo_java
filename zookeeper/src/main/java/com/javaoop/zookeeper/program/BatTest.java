package src.main.java.com.javaoop.zookeeper.program;
import src.main.java.com.javaoop.zookeeper.animal.Bat;

public class BatTest {
    public static void main(String[] args) {
        Bat batJr = new Bat();
        batJr.attackTown();
        batJr.attackTown();
        batJr.attackTown();
        batJr.eatHumans();
        batJr.eatHumans();
        batJr.fly();
        batJr.fly();
        System.out.println("Energy level: " + batJr.displayEnergy());
    }
}
