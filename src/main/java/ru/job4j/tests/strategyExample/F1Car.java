package ru.job4j.tests.strategyExample;

public class F1Car extends Auto {

    public F1Car() {
        this.fillStrategy = new F1PitstopStrategy();
    }

    public static void main(String[] args) {
        F1Car f1Car = new F1Car();
        f1Car.fill();
    }
}