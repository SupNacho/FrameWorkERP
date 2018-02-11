package controller;

import model.goods.Frame;

import java.util.ArrayList;
import java.util.List;

public class OrderController extends OrderListener {
    private List<Frame> newOreders = new ArrayList<>();
    private List<Frame> processingOreders = new ArrayList<>();
    private List<Frame> completeOreders = new ArrayList<>();
    private List<Frame> shipedOreders = new ArrayList<>();

    public void addOrder(Frame frame){
        newOreders.add(frame);
        notifyManager("Добавлен новый заказ.");
    }

    public void setOrderProcessing(){
        if (newOreders.size() == 0){
            System.out.println("Нет новых заказов.");
        } else {
            processingOreders.add(newOreders.remove(0));
            notifyMasters("Заказ поступил в работу.");
        }
    }

    public void setOrderCompleted(){
        if (processingOreders.size() == 0){
            System.out.println("Нет заказов в производстве заказов.");
        } else {
            completeOreders.add(processingOreders.remove(0));
            notifyManager("Заказ готов.");
        }
    }

    public void setOrderShiped(){
        if (completeOreders.size() == 0){
            System.out.println("Нет завершенных заказов.");
        } else {
            shipedOreders.add(completeOreders.remove(0));
            notifyManager("Заказ доставлен.");
        }
    }
}
