package model.goods;

public interface GlassInterface extends GoodsInterface {
    int getWidth();
    int getHeight();
    int getThickness();
    Glass.TYPE getType();

    void setWidth(int width);
    void setHeight(int height);
    void setThickness(int thickness);
    void setType(Glass.TYPE type);

}
