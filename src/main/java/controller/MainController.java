package controller;

import model.goods.Background;
import model.goods.Baget;
import model.goods.Glass;
import model.goods.Passepartout;
import view.ConsoleView;

public class MainController {
    private OrderController oc;
    private ManagerController mc;
    private FrameMasterController fmc;
    private UserController uc;
    private GoodsFacadeController gfc;
    private ConsoleView consoleView;

    public MainController() {
        oc = new OrderController();
        mc = new ManagerController();
        fmc = new FrameMasterController();
        uc = UserController.getInstance();
        gfc = new GoodsFacadeController(new Glass(), new Passepartout(),
                new Baget(), new Background());
        consoleView = new ConsoleView(this);

    }

    public void start(){
        oc.addManagerListener(mc);
        oc.addMasterListener(fmc);
        new Thread(mc).start();
        new Thread(fmc).start();
        consoleView.run();
    }

    public OrderController getOc() {
        return oc;
    }

    public UserController getUc() {
        return uc;
    }

    public GoodsFacadeController getGfc() {
        return gfc;
    }
}
