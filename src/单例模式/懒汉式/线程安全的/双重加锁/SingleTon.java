package 单例模式.懒汉式.线程安全的.双重加锁;

public class SingleTon {
    private volatile static SingleTon instance = null;

    public static SingleTon getInstance() {
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null){
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
