package ru.job4j.tests.strategyExample;

public class Auto {

    FillStrategy fillStrategy;


    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void fill() {
        System.out.println("Заправить бензин!");
    }


    public class HybridFillStrategy implements FillStrategy {

        @Override
        public void fill() {
            System.out.println("Заправляем бензином или электричеством на выбор!");
        }
    }

    public class F1PitstopStrategy implements FillStrategy {

        @Override
        public void fill() {
            System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
        }
    }

    public class StandartFillStrategy implements FillStrategy {
        @Override
        public void fill() {
            System.out.println("Просто заправляем бензин!");
        }
    }
}

