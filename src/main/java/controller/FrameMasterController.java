package controller;

public class FrameMasterController implements Runnable, Observer{
    private String msg;

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
            if(msg != null){
                System.out.println("Панель мастера: " + msg);
                msg = null;
            }
        }
    }
}
