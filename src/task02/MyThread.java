package task02;

import static task02.Main.increcement;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            increcement();
        }
    }
}
