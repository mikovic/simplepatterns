package src.main.java.com.mikovic;

public class Typography {
    boolean flag = false;

    public synchronized void printPong() {
        for (int i = 0; i < 5; i++) {
            while (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pong");
            flag = false;
            notify();
        }
    }

    public synchronized void printPing() {
        for (int i = 0; i < 5; i++) {
            while (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Ping");
            flag = true;
            notify();
        }
    }

}


