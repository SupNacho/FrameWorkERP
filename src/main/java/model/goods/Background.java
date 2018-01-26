package model.goods;

public interface Background extends Goods {
    int getWidth();
    int getHeight();
    int getThickness();
    String getColor();

    int setWidth();
    int setHeight();
    int setThickness();
    String setColor();
}
