package ru.job4j.tests.strategyExample;

public class Sedan extends Auto {

    public Sedan() {
        this.fillStrategy = new StandartFillStrategy();
    }
}