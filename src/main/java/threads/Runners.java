package threads;

public class Runners {

    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Tarefa #1, rodando");
                    Thread.sleep(2000l);
                    System.out.println("Tarefa #1, finalizada");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        new Thread(task).start();
    }
}
