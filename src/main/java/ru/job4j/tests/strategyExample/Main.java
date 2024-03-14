package ru.job4j.tests.strategyExample;

public class Main {

    public static void main(String[] args) {

        Auto sedan = new Sedan();
        Auto f1car = new F1Car();

        sedan.fill();
        sedan.gas();
        sedan.stop();

        f1car.fill();
        f1car.gas();
        f1car.stop();
    }
}