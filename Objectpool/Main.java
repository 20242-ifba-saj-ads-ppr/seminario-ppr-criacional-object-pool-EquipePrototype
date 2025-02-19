package Objectpool;

public class Main {
    public static void main(String[] args) {
        WorkerPool pool = new WorkerPool(2);

        Runnable task1 = () -> {
            Worker w = pool.getWorker();
            if (w != null) {
                w.executarTask("Task 1");
                pool.releaseWorker(w);
            }
        };

        Runnable task2 = () -> {
            Worker w = pool.getWorker();
            if (w != null) {
                w.executarTask("Task 2");
                pool.releaseWorker(w);
            }
        };

          Runnable task3 = () -> {
            Worker w = pool.getWorker();
            if (w != null) {
                w.executarTask("Task 3");
                pool.releaseWorker(w);
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
    }
}
