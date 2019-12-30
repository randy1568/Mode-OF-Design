package 单例模式.饿汉式;

/**
 * 线程安全的饿汉式写法
 */
public class SingleTon {

    private static SingleTon instance = new SingleTon();

    private SingleTon(){}

    public static SingleTon getInstance() {
        return instance;
    }
}
