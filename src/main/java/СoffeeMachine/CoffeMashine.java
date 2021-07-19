package СoffeeMachine;

import java.util.List;

public class CoffeMashine {
    int allMilk;
    int allCoffee;
    int allSugar;
    int allWater;
    List<Beverage> beverageList;

    public void serveAGlass() {
    }

    public void giveAStick() {
    }


    public boolean checkingTheComponents(Beverage beverage) {
        boolean checkingTheComponents;
        if (this.allWater >= beverage.getWater() || this.allCoffee >= beverage.getCoffee() || this.allMilk >= beverage.getMilk()) {
            return checkingTheComponents = true;
        } else {
            return checkingTheComponents = false;
        }
    }

    public boolean checkSugar(int selectSugar) {
        boolean checkSugar;
        if (this.allSugar >= selectSugar) {
            return checkSugar = true;
        }
        return checkSugar = false;
    }

    public String[] nameDrink() {
        String[] nameDrink = new String[this.beverageList.size()];
        int a = 0;
        for (int i = 0; i < this.beverageList.size(); i++) {
            nameDrink[a] = beverageList.get(i).getName();
            a++;
        }
        return nameDrink;
    }

    public List<Beverage> getBeverageList() {
        return beverageList;
    }

    public void setBeverageList(List<Beverage> beverageList) {
        this.beverageList = beverageList;
    }

    public void setAllMilk(int allMilk) {
        this.allMilk = allMilk;
    }

    public void setAllCoffee(int allCoffee) {
        this.allCoffee = allCoffee;
    }

    public void setAllSugar(int allSugar) {
        this.allSugar = allSugar;
    }

    public void setAllWater(int allWater) {
        this.allWater = allWater;
    }

    public int addMilk(int addedMilk) {
        return this.allMilk = this.allMilk + addedMilk;
    }

    public int addCoffee(int addedCoffee) {
        return this.allCoffee = this.allCoffee + addedCoffee;
    }

    public int addSugar(int addedSugar) {
        return this.allSugar = this.allSugar + allSugar;
    }

    public int addWater(int addedWater) {
        return this.allWater = this.allWater + addedWater;
    }

    public int theAmountOfMilkAfterPreparation(Beverage beverage) {
        return this.allMilk - beverage.getMilk();
    }

    public int theAmountOfCoffeeAfterPreparation(Beverage beverage) {
        return this.allCoffee - beverage.getCoffee();
    }

    public int theAmountOfWaterAfterPreparation(Beverage beverage) {
        return this.allWater - beverage.getWater();
    }

    public int theAmountOfSugarAfterPreparation(int amountOfSugar) {
        return this.allSugar - amountOfSugar;
    }


    @Override
    public String toString() {
        return "CoffeMashine{" +
                "allMilk=" + allMilk +
                ", allCoffee=" + allCoffee +
                ", allSugar=" + allSugar +
                ", allWater=" + allWater +
                '}';
    }
}
