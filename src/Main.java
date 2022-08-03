public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Создаю потоки");

        ThreadGroup group1 = new ThreadGroup("group1");

        for (int i = 1; i < 5; i++) {
            Thread thread = new Thread(group1, new MyThread(), "Поток " + i);
            thread.start();
        }

        Thread.sleep(15000);

        System.out.println("Закончили упражнение");

        group1.interrupt();
    }
}
