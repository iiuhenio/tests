package ru.job4j.tests.strategyExample.MyExample;

public class CarsFillStrategy implements FillStrategy {
    @Override
    public void FillAll() {
        System.out.println("Заправляем бенз!!!");
    }
}
