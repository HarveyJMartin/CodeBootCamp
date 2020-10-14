package src;

public class Critter {
    private boolean isAlive;
    private String name;
    private int enjoymentLevel;
    private int foodLevel;

    public Critter(String name) {
        isAlive = true;
        this.name = name;
        enjoymentLevel = 10;
        foodLevel = 5;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    private void die() {
        isAlive = false;
        System.out.println("Sadly " + name + " has passed away.");

    }

    public void playGame() {
        System.out.println(name + " plays a fun game.");
        enjoymentLevel++;
        foodLevel--;
        checkLevels();
    }

    private void checkLevels() {
        if (enjoymentLevel > 15) {
            die();
        }
        if (foodLevel <= 0) {
            die();
        }
    }

    public void sleep() {
        System.out.println(name + " had a great sleep");
        enjoymentLevel = 10;
        foodLevel = 5;
        checkLevels();

    }

    public void tick() {
        System.out.println(name +"'s current enjoyment level is " + enjoymentLevel);
        System.out.println(name = "'s current food level is" + foodLevel);
        if (foodLevel == 1) {

        }
    }
}
