package 单例模式.懒汉式.线程安全的.静态内部内;

public class SingleTon {

    public static class MySingleTon{
        public static SingleTon instance = new SingleTon();
    }

    public static SingleTon getSingleTon(){
        return MySingleTon.instance;
    }
}
