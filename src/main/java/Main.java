import controller.*;
import model.goods.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        String name;
        String phone;
        String adr;
        Frame newFrame = null;
        int discount;
        int width;
        int height;
        OrderController oc = new OrderController();
        ManagerController mc = new ManagerController();
        FrameMasterController fmc = new FrameMasterController();
        oc.addManagerListener(mc);
        oc.addMasterListener(fmc);
        new Thread(mc).start();
        new Thread(fmc).start();
        UserController uc = UserController.getInstance();
        GoodsFacadeController gfc = new GoodsFacadeController(new Glass(), new Passepartout(),
                new Baget(), new Background());
        while(true){
            input = in.nextLine();
            switch (input){
                case "create frame":
                    System.out.println("CREATING FRAME:");
                    System.out.println("Enter width: ");
                    width = in.nextInt();
                    System.out.println("Enter height: ");
                    height = in.nextInt();
                    newFrame = gfc.createFrame(width, height);
                    break;
                case "get frame price":
                    gfc.printPrice();
                    break;
                case "get frame cost":
                    gfc.printCost();
                    break;
                case "get profit":
                    gfc.getProfit();
                    break;
                case "add client":
                    System.out.println("ADDING CLIENT:");
                    System.out.println("Enter Name: ");
                    name = in.nextLine();
                    System.out.println("Enter phone: ");
                    phone = in.nextLine();
                    System.out.println("Enter discount: ");
                    discount = in.nextInt();
                    System.out.println("Enter address: ");
                    adr = in.nextLine();
                    uc.createNewClient(name, phone, adr, discount);
                    break;
                case "add manager":
                    System.out.println("ADDING MANAGER:");
                    System.out.println("Enter Name: ");
                    name = in.nextLine();
                    System.out.println("Enter phone: ");
                    phone = in.nextLine();
                    System.out.println("Enter address: ");
                    adr = in.nextLine();
                    uc.createNewManager(name,phone,adr);
                    break;
                case "add master":
                    System.out.println("ADDING MASTER:");
                    System.out.println("Enter Name: ");
                    name = in.nextLine();
                    System.out.println("Enter phone: ");
                    phone = in.nextLine();
                    System.out.println("Enter address: ");
                    adr = in.nextLine();
                    uc.createNewMaster(name,phone,adr);
                    break;
                case "get clients":
                    System.out.println(Arrays.toString(uc.getClients().toArray()));
                    break;
                case "get managers":
                    System.out.println(Arrays.toString(uc.getManagers().toArray()));
                    break;
                case "get masters":
                    System.out.println(Arrays.toString(uc.getMasters().toArray()));
                    break;
                case "create new order":
                    if (newFrame != null) {
                        oc.addOrder(newFrame);
                    } else{
                        System.out.println("Frame not created");
                    }
                    break;
                case "set frame to master":
                    oc.setOrderProcessing();
                    break;
                case "set frame ready":
                    oc.setOrderCompleted();
                    break;
                case "ship frame":
                    oc.setOrderShiped();
                    break;
                case "h":
                    System.out.println("create frame - создать раму");
                    System.out.println("get frame price - цена за раму для клиента");
                    System.out.println("get frame cost - себестоимость рамы");
                    System.out.println("get profit - прибыль с рамы");
                    System.out.println("add client - добавить нового клиента");
                    System.out.println("add manager - добавить менеджера");
                    System.out.println("add master - добавить мастера");
                    System.out.println("get clients / managers / masters - получмть список клиентов, менеджеров и мастеров");
                    System.out.println("create new order - создать новый заказ из ранее созданой рамы");
                    System.out.println("set frame to master - передать новый заказ в производство");
                    System.out.println("set frame ready - сообщить о готовности рабы");
                    System.out.println("ship frame - передать заказ в доставку");
                    break;
                case "quit":
                    System.exit(0);
                    break;
                    default:
                        System.out.println("unknown command");
            }
        }
    }
}
