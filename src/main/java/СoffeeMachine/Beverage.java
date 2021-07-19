package СoffeeMachine;


public class Beverage {
    String name;
    int milk;
    int coffee;
    int water;
    int coast;

    public Beverage(String name, int milk, int coffee, int water, int coast) {
        this.name = name;
        this.milk = milk;
        this.coffee = coffee;
        this.water = water;
        this.coast = coast;
    }
    public  boolean coastCheck( int contributedMoney) {
        boolean coastCheck;
        if (contributedMoney >=this.coast) {
            return coastCheck = true;
        } else {
            return coastCheck = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    public int getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", milk=" + milk +
                ", coffee=" + coffee +
                ", water=" + water +
                ", coast=" + coast +
                '}';
    }
}
