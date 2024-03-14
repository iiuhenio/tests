package ru.job4j.tests.strategyExample.MyExample;

public class Sedan extends Auto {

    public FillStrategy fillStrategy;

    public Sedan(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
        fillStrategy.FillAll();
    }

    public static void main(String[] args) {

    }
}
