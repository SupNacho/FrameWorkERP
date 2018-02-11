package controller;

import java.util.ArrayList;
import java.util.List;

public abstract class OrderListener {
    private List<Observer> managerObservers = new ArrayList<>(); // Коллекция менеджеров
    private List<Observer> masterObservers = new ArrayList<>();  // Коллекция Мастеров

    public void addManagerListener(Observer observer){
        managerObservers.add(observer);
    }

    public void removeManagerListener(Observer observer){
        managerObservers.remove(observer);
    }
    public void addMasterListener(Observer observer){
        masterObservers.add(observer);
    }

    public void removeMasterListener(Observer observer){
        masterObservers.remove(observer);
    }

    public void notifyManager(Object arg){                  //Раздельное оповещение менеджеров и мастеров
        for (Observer observer : managerObservers) {
            observer.update(this, arg);
        }
    }
    public void notifyMasters(Object arg){
        for (Observer observer : masterObservers) {
            observer.update(this, arg);
        }
    }
}
