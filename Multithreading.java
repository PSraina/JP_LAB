public class Multithreading {
    int counter = 1;
    static int N;

    public void OddNumber() {
        synchronized (this) {
            while(counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(counter + " ");

                counter++;

                notify();
            }
        }
    }

    public void EvenNumber()
    {
        synchronized (this) {
            while(counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                System.out.print(counter + " ");

                counter++;

                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 20;
        Multithreading obj = new Multithreading();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.EvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.OddNumber();
            }
        });

        t1.start();
        t2.start();
    }
}
