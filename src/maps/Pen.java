package maps;

import java.util.Objects;

public class Pen {
    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

//    @Override
//    public boolean equals(Object obj){
//        Pen that = (Pen) obj;
//        boolean isEqual = this.price == that.price && this.color.equals(that.color);
//        return isEqual;
//    }
//
//    @Override
//    public int hashCode(){
//        return price + color.hashCode();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return price == pen.price && color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
