package threads;

public class RunnersLambda {

    public static void main(String[] args) {

        Runnable task = () -> {
                try {
                    System.out.println("Tarefa #1, rodando");
                    Thread.sleep(2000l);
                    System.out.println("Tarefa #1, finalizada");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        };

        new Thread(task).start();
    }
}
