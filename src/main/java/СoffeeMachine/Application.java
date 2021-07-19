package СoffeeMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeMashine coffeMashine = new CoffeMashine();
        coffeMashine.setAllCoffee(50);
        coffeMashine.setAllMilk(50);
        coffeMashine.setAllSugar(50);
        coffeMashine.setAllWater(100);
        coffeMashine.setBeverageList(list());

        Beverage beverage = drinkSelection(coffeMashine, scanner);                   //выбрали напиток


        checkComponent(coffeMashine, beverage);                              // проверка компонентов
        int contributedMoney = beverage.getCoast();                         // стоимость
        int selectSugar = selectSugar(scanner);                                    // кол сахара
        checkSugar(coffeMashine, selectSugar, contributedMoney, scanner);           // проверка сахара

        if (checkMoney(coffeMashine, beverage, contributedMoney)) {            // проверка денег

            coffeMashine.giveAStick();
            System.out.println("Напиток " + beverage.getName() + " готов, стоимостью " + beverage.getCoast());

            componentsAferСooking(coffeMashine, beverage, selectSugar);
            System.out.println(coffeMashine);

        }

    }

    public static CoffeMashine componentsAferСooking(CoffeMashine coffeMashine, Beverage beverage, int selectSugar) {
        coffeMashine.theAmountOfCoffeeAfterPreparation(beverage);
        coffeMashine.theAmountOfMilkAfterPreparation(beverage);
        coffeMashine.theAmountOfSugarAfterPreparation(selectSugar);
        coffeMashine.theAmountOfWaterAfterPreparation(beverage);
        return coffeMashine;
    }


    public static boolean checkMoney(CoffeMashine coffeMashine, Beverage beverage, int contributedMoney) {
        boolean t;
        if (beverage.coastCheck(contributedMoney)) {
            System.out.println("Готовим напиток");
            coffeMashine.serveAGlass();
            return t = true;
        } else {
            System.out.println("Недостаточно средств");
            return t = false;
        }

    }

    public static void checkSugar(CoffeMashine coffeMashine, int selectSugar, int contributedMoney, Scanner scanner) {
        if (coffeMashine.checkSugar(selectSugar)) {
            System.out.println("Внесите " + contributedMoney + "$");
            int xxx = scanner.nextInt();
        } else {
            System.out.println("Недостаточно сахара");
            // смс персоналу .
        }
    }

    public static void checkComponent(CoffeMashine coffeMashine, Beverage beverage) {
        if (coffeMashine.checkingTheComponents(beverage)) {

        } else {
            System.out.println("Недостаточно компонентов");
            // смс персоналу .
        }
    }

    public static int selectSugar(Scanner scanner) {
        System.out.println("Выберите количество сахара");
        int selectSugar = scanner.nextInt();
        return selectSugar;
    }

    public static Beverage drinkSelection(CoffeMashine coffeMashine, Scanner scanner) {
        List<Beverage> list = coffeMashine.getBeverageList();

        System.out.println("Выберите напиток");
        System.out.println(Arrays.toString(coffeMashine.nameDrink()));
        String nameBeverage = scanner.nextLine();
        int x = 0;
        for (int i = 0; i < list().size(); i++) {
            if (nameBeverage.equalsIgnoreCase(list().get(i).getName())) {
                x = i;
            }
        }
        return list.get(x);
    }


    public static List<Beverage> list() {
        List<Beverage> list = new ArrayList<>();
        list.add(new Beverage("Espresso", 0, 5, 10, 5));
        list.add(new Beverage("Americano", 0, 11, 12, 7));
        list.add(new Beverage("Latte", 5, 7, 13, 8));
        list.add(new Beverage("Cappuccino", 10, 10, 10, 10));
        return list;
    }

}
