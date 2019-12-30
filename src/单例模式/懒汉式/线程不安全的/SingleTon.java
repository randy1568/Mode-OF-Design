package 单例模式.懒汉式.线程不安全的;

/**
 * 懒汉式、线程安全
 */
public class SingleTon {

    private static SingleTon instance = null;

    public static SingleTon getInstance() {
        if(instance == null){
            return new SingleTon();
        }else {
            return instance;
        }
    }
}
