import controller.UserController;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String input = "";
        String name;
        String phone;
        String adr;
        int discount;
        UserController uc = UserController.getInstance();
        while(input != "quit"){
            input = in.nextLine();
            switch (input){
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
                case "quit":
                    input = "quit";
                    break;
                    default:
                        System.out.println("unknown command");
            }
        }
    }
}
