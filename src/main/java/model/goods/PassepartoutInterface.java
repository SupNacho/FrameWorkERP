package model.goods;

public interface PassepartoutInterface extends GoodsInterface {
    int getWidth();
    int getHeight();
    String getColor();

    void setWidth(int width);
    void setHeight(int height);
    void setColor(String color);
}
