package view;

import controller.MainController;
import model.goods.Frame;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleView implements Runnable{
    private MainController mc;
    private String input;
    private String name;
    private String phone;
    private String adr;
    private Frame newFrame = null;
    private int discount;
    private int width;
    private int height;

    private Scanner in;

    public ConsoleView(MainController mc) {
        in = new Scanner(System.in);
        this.mc = mc;
    }

    @Override
    public void run() {
        while(true){
            input = in.nextLine();
            switch (input){
                case "create frame":
                    System.out.println("CREATING FRAME:");
                    System.out.println("Enter width: ");
                    width = in.nextInt();
                    System.out.println("Enter height: ");
                    height = in.nextInt();
                    newFrame = mc.getGfc().createFrame(width, height);
                    break;
                case "get frame price":
                    mc.getGfc().printPrice();
                    break;
                case "get frame cost":
                    mc.getGfc().printCost();
                    break;
                case "get profit":
                    mc.getGfc().getProfit();
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
                    mc.getUc().createNewClient(name, phone, adr, discount);
                    break;
                case "add manager":
                    System.out.println("ADDING MANAGER:");
                    System.out.println("Enter Name: ");
                    name = in.nextLine();
                    System.out.println("Enter phone: ");
                    phone = in.nextLine();
                    System.out.println("Enter address: ");
                    adr = in.nextLine();
                    mc.getUc().createNewManager(name,phone,adr);
                    break;
                case "add master":
                    System.out.println("ADDING MASTER:");
                    System.out.println("Enter Name: ");
                    name = in.nextLine();
                    System.out.println("Enter phone: ");
                    phone = in.nextLine();
                    System.out.println("Enter address: ");
                    adr = in.nextLine();
                    mc.getUc().createNewMaster(name,phone,adr);
                    break;
                case "get clients":
                    System.out.println(Arrays.toString(mc.getUc().getClients().toArray()));
                    break;
                case "get managers":
                    System.out.println(Arrays.toString(mc.getUc().getManagers().toArray()));
                    break;
                case "get masters":
                    System.out.println(Arrays.toString(mc.getUc().getMasters().toArray()));
                    break;
                case "create new order":
                    if (newFrame != null) {
                        mc.getOc().addOrder(newFrame);
                    } else{
                        System.out.println("Frame not created");
                    }
                    break;
                case "set frame to master":
                    mc.getOc().setOrderProcessing();
                    break;
                case "set frame ready":
                    mc.getOc().setOrderCompleted();
                    break;
                case "ship frame":
                    mc.getOc().setOrderShiped();
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
