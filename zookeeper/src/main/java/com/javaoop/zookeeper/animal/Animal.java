package src.main.java.com.javaoop.zookeeper.animal;

public class Animal {
    private int energyLevel = 100;

    public int displayEnergy() {
        return energyLevel;
    }

    public void addEnergy(int energyLevel) {
        if (this.energyLevel + energyLevel <= 100) {
            this.energyLevel += energyLevel;
        } else {
            this.energyLevel = 100;
        }
    }

    public void substractEnergy(int energyLevel) {
        if (this.energyLevel - energyLevel < 0) {
            energyLevel = 0;
        } else {
            this.energyLevel -= energyLevel;
        }
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

}