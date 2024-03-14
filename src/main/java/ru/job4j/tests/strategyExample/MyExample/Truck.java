package ru.job4j.tests.strategyExample.MyExample;

public class Truck extends Auto {

    public FillStrategy fillStrategy;

    public Truck(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
        fillStrategy.FillAll();
    }

    public static void fizzBuzzPrint(int i){
        if ((i % 5 == 0) && (i % 3 == 0)) {
            System.out.println("FizzBuzz");
        }
        else if (i % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (i % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (i  % 3 != 0 && i % 5 != 0) {
            System.out.println(i);
            System.out.println("New task");
        }
    }


    public static void main(String[] args) {
        fizzBuzzPrint(20);
    }
}
