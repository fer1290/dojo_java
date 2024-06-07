package src.main.java.com.javaoop.zookeeper.program;
import src.main.java.com.javaoop.zookeeper.animal.Gorilla;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorillaJr = new Gorilla();
        gorillaJr.throwSomething();
        gorillaJr.throwSomething();
        gorillaJr.throwSomething();
        gorillaJr.eatBananas();
        gorillaJr.eatBananas();
        gorillaJr.climb();
        System.out.println("Energy level: " + gorillaJr.displayEnergy());
    }
}
