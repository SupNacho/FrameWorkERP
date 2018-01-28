package model.goods;

public class Glass implements GlassInterface {

    enum TYPE {NORMAL, MUSEUM, ACRYLIC}

    private int width;
    private int height;
    private int thickness;
    private float price;
    private float cost;
    private TYPE type;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getThickness() {
        return thickness;
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
    public void setThickness(int thickness) {
        this.thickness = thickness;
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
