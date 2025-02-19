package Objectpool;

import java.util.ArrayList;
import java.util.List;

class WorkerPool {
    private List<Worker> pool = new ArrayList<>();

    public WorkerPool(int size) {
        for (int i = 0; i < size; i++) {
            pool.add(new Worker());
        }
    }

    public synchronized Worker getWorker() {
        for (Worker w : pool) {
            if (!w.isEmUso()) {
                w.setEmUso(true);
                return w;
            }
        }
        System.out.println("Nenhum worker disponível!");
        return null;
    }

    public synchronized void releaseWorker(Worker worker) {
        if (worker != null) {
            worker.setEmUso(false);
        }
    }
}
