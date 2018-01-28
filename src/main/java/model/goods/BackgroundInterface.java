package model.goods;

public interface BackgroundInterface extends GoodsInterface {
    int getWidth();
    int getHeight();
    int getThickness();
    String getColor();

    void setWidth(int width);
    void setHeight(int height);
    void setThickness(int thickness);
    void setColor(String color);
}
