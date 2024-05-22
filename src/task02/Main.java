package task02;

import task01.MyThread01;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) {
        // есть счётчик, сначала он 0
        // задача - увеличить счётчик на единицу 1_000_000 раз
        // вывести в консоль значение счётчика

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();

        for (int i = 0; i < 1000000; i++) {
            counter++;
        }

        try {
            myThread.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Значение счётчика - " + counter);

    }
}
