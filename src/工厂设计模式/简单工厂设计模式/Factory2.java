package 工厂设计模式.简单工厂设计模式;

public class Factory2 {
    public Object produce(Class<? extends Shape> tclass) {

        if (tclass == null) {
            return null;
        }
        Object o = null;
        try {
            o = Class.forName(tclass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  o;

    }
}
