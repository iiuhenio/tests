package ru.job4j.tests.strategyExample.MyExample;

public class ChidlrenBuggieFillStrategy implements FillStrategy {
    @Override
    public void FillAll() {
        System.out.println("Только заряжаем!!!");
    }
}
