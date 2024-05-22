package task01;

public class Main {

    // Два способа создания потоков java
    // 1. наследуемся от класса Thread
    // 2. реализуем интерфейс Runnable

    public static void main(String[] args){

        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02();

        // 1. для запуска кода в отдельном потоке мы вызываем метод start
        // у объекта нашего класса, который наследуется от Thread
        thread01.start();

        // 1. для запуска кода в отдельном потоке мы создаём объект класса Thread
        // передавая ему в конструктор объект нашего класса, реализующего Runnable
        // А потом метод start вызываем у объекта Thread
        Thread thread = new Thread(thread02);

        thread.start();


        for (int i = 0; i < 10; i++ ) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
