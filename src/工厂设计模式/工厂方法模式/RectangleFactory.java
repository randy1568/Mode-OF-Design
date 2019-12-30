package 工厂设计模式.工厂方法模式;

public class RectangleFactory {

    public static Shape produce(){
        return  new Rectangle();
    }
}
