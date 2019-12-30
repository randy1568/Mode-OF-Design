package 工厂设计模式.简单工厂设计模式;

//工厂类
public class Factory {

    public static Shape produce(String shape){

        if(shape == null){
            return null;
        }

        if (shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }else  if (shape.equalsIgnoreCase("Rectancle")){
            return new Rectangle();
        }
        return null;
    }
}
