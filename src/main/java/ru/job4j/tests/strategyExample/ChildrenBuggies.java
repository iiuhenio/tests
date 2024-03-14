package ru.job4j.tests.strategyExample;

public class ChildrenBuggies extends Auto {

    public ChildrenBuggies(FillStrategy fillStrategy) {
    }

    public void fill() {

        //хм... Это детский багги, его не надо заправлять :/
    }
}