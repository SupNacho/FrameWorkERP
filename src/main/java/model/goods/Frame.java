package model.goods;

import java.util.ArrayList;
import java.util.List;

public class Frame implements GoodsInterface {
    private int width;
    private int height;
    private float price;
    private float cost;
    private List<GoodsInterface> componentsList = new ArrayList<>();

    public Frame(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addComponent(GoodsInterface component){
        componentsList.add(component);
    }

    @Override
    public float getPrice() {
        float framePrice = 0;
        for (GoodsInterface goodsInterface : componentsList) {
            framePrice += goodsInterface.getPrice();
        }
        return framePrice;
    }

    @Override
    public float getCost() {
        float frameCost = 0;
        for (GoodsInterface goodsInterface : componentsList) {
            frameCost += goodsInterface.getCost();
        }
        return frameCost;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setCost(float cost) {
        this.cost = cost;
    }
}

