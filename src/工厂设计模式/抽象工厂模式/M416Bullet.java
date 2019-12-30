package 工厂设计模式.抽象工厂模式;

public class M416Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("给M416装载AK子弹");
    }
}
