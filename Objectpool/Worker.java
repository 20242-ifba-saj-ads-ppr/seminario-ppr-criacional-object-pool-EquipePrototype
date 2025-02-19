package Objectpool;

class Worker {
    private boolean emUso = false;

    public void executarTask(String taskName) {
        System.out.println(Thread.currentThread().getName() + " executando: " + taskName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " terminou: " + taskName);
    }

    public boolean isEmUso() {
        return emUso;
    }

    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }
}
