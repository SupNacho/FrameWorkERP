package model.goods;

public abstract class AbstractFrame implements GoodsInterface {
    private int width;
    private int height;
    private float price;
    private float cost;

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
