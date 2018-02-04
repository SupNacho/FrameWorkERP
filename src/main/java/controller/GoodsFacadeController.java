package controller;

import model.goods.*;

public class GoodsFacadeController {
    private Frame frame;
    private Glass glass;
    private Passepartout passepartout;
    private Baget baget;
    private Background background;

    public GoodsFacadeController(Glass glass, Passepartout passepartout, Baget baget, Background background) {
        this.glass = glass;
        this.passepartout = passepartout;
        this.baget = baget;
        this.background = background;
    }

    public Frame createFrame(int width, int height){
        glass.setWidth(width);
        glass.setHeight(height);
        glass.setPrice(3.0f);
        glass.setCost(1.1f);
        passepartout.setWidth(width);
        passepartout.setHeight(height);
        passepartout.setPrice(5.0f);
        passepartout.setCost(2.0f);
        baget.setWidth(width);
        baget.setHeight(height);
        baget.setPrice(10.0f);
        baget.setCost(3.0f);
        background.setWidth(width);
        background.setHeight(height);
        background.setPrice(1.0f);
        background.setCost(0.3f);
        frame = new Frame(width, height);
        frame.addComponent(glass);
        frame.addComponent(background);
        frame.addComponent(baget);
        frame.addComponent(passepartout);
        return frame;
    }

    public void printPrice(){
        System.out.println("Frame summary price:" + frame.getPrice());
        System.out.println("--------------------");
        System.out.println("Glass: " + glass.getPrice());
        System.out.println("Baget: " + baget.getPrice());
        System.out.println("Pasp: " + passepartout.getPrice());
        System.out.println("Background: " + background.getPrice());
    }

    public void printCost(){
        System.out.println("Frame summary cost:" + frame.getCost());
        System.out.println("--------------------");
        System.out.println("Glass: " + glass.getCost());
        System.out.println("Baget: " + baget.getCost());
        System.out.println("Pasp: " + passepartout.getCost());
        System.out.println("Background: " + background.getCost());
    }

    public void getProfit(){
        System.out.println("Profit from this frame: " + (frame.getPrice() - frame.getCost()));
    }
}
