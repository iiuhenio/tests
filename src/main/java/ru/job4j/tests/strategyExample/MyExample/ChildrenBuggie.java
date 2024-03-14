package ru.job4j.tests.strategyExample.MyExample;

public class ChildrenBuggie extends Auto {

    public FillStrategy fillStrategy;

    ChildrenBuggie(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
        fillStrategy.FillAll();
    }

    public static void main(String[] args) {
        int[] array = {7, 1, 7, 8, 1, 67, 6, 5, 6};
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                System.out.print(array[i] + " ");
                break;
            }
        }
    }



}
