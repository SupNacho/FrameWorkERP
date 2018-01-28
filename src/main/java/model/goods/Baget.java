package model.goods;

public class Baget implements BagetInterface {
    enum TYPE {WOOD, PLASTIC, ALUMINIUM}
    private int width;
    private int height;
    private int length;
    private float price;
    private float cost;
    private TYPE type;
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
    public int getLength() {
        return length;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
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

    @Override
    public TYPE getType() {
        return type;
    }

    @Override
    public void setType(TYPE type) {
        this.type = type;
    }
}
