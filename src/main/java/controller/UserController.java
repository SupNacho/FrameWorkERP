package controller;

import model.user.*;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private static volatile UserController ourInstance = null;
    private List<Client> clients;
    private List<Manager> managers;
    private List<FrameMaster> masters;


    public static UserController getInstance() {
        if (ourInstance == null){
            synchronized (UserController.class){
                ourInstance = new UserController();
                return ourInstance;
            }
        }
        return ourInstance;
    }

    private UserController() {
        clients = new ArrayList<>();
        managers = new ArrayList<>();
        masters = new ArrayList<>();
    }

    public Client createNewClient(String name, String phone,  String address, int disc){
        Client client = new Client.Builder(name, phone).setAddress(address).setDiscount(disc).build();
        clients.add(client);
        return client;
    }
    public Manager createNewManager(String name, String phone,  String address){
        Manager manager = new Manager.Builder(name, phone).setAddress(address).build();
        managers.add(manager);
        return manager;
    }

    public FrameMaster createNewMaster(String name, String phone,  String address){
        FrameMaster master = new FrameMaster.Builder(name, phone).setAddress(address).build();
        masters.add(master);
        return master;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public List<FrameMaster> getMasters() {
        return masters;
    }
}
