package ru.job4j.tests.strategyExample.MyExample;

public class Main {
    public static void main(String[] args) {

        ChidlrenBuggieFillStrategy chidlrenBuggieFillStrategy = new ChidlrenBuggieFillStrategy();
        CarsFillStrategy carsFillStrategy = new CarsFillStrategy();

        Sedan sedan = new Sedan(carsFillStrategy);
//        sedan.stop();
//        sedan.fill();
//        sedan.gaz();
        Truck truck = new Truck(carsFillStrategy);
        ChildrenBuggie childrenBuggie = new ChildrenBuggie(chidlrenBuggieFillStrategy);

    }
}
