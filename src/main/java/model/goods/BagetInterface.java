package model.goods;

public interface BagetInterface extends GoodsInterface {
   int getWidth();
   int getHeight();
   int getLength();
   String getColor();
   Baget.TYPE getType();

   void setWidth(int width);
   void setHeight(int height);
   void setLength(int length);
   void setColor(String color);
   void setType(Baget.TYPE type);
}
