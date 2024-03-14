package ru.job4j.tests.strategyExample;

import org.aspectj.weaver.ast.Or;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Example2 {

    public static interface ProcessingStrategy {
        public void pay();
    }

    final static class SberbankProcessing implements ProcessingStrategy {

        @Override
        public void pay() {
            System.out.println("Pay vye Sberbank");
        }
    }

    final static class VTBProcessing implements ProcessingStrategy {

        @Override
        public void pay() {
            System.out.println("Pay vye VTB");
        }
    }

    final static class Order extends Information {
        private ProcessingStrategy processingStrategy;

        public Order(ProcessingStrategy processingStrategy) {
            this.processingStrategy = processingStrategy;
            processingStrategy.pay();
        }

//
//        public void met() {
//            System.out.println("smth");
//        }

//        @Override
//        public void inform() {
//            System.out.println("new inform");
//        }
//
//        public void order() {
//            this.processingStrategy.pay();
//        }

        public static void main(String[] args) {
            SberbankProcessing sberbankProcessing = new SberbankProcessing();
            VTBProcessing vtbProcessing = new VTBProcessing();

            Order sberOrder = new Order(sberbankProcessing);
            Order vtbOrder = new Order(vtbProcessing);

        }
    }
}
