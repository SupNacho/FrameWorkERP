package controller;

public class ManagerController implements Runnable, Observer {
    private String msg = "Инициализация";

    @Override
    public void update(OrderListener listener, Object arg) {
        msg = (String) arg;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!msg.isEmpty())
            System.out.println("Панель менеджера: " + msg);
                msg = "";

        }

    }
}
