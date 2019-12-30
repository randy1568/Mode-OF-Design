package 工厂设计模式.工厂方法模式;

public class CircleFactory {

    public static Shape produce(){
        return new Circle();
    }
}
