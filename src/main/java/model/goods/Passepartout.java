package model.goods;

public class Passepartout implements PassepartoutInterface {

    private int width;
    private int height;
    private float price;
    private float cost;
    private String color;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public float getCost() {
        return cost;
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
