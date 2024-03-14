package ru.job4j.tests.strategyExample.MyExample;

public class Auto {

    public FillStrategy fillStrategy;

    public void gaz() {
        System.out.println("Дави на газ мой мальчик");
    }

    public void stop() {
        System.out.println("Тормоза придумали трусы");
    }

    public void fill() {
        System.out.println("Мне 92-й, пожалйста");
    }
}
